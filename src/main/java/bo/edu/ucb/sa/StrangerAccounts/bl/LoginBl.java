package bo.edu.ucb.sa.StrangerAccounts.bl;
import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.sa.StrangerAccounts.dao.GroupDao;
import bo.edu.ucb.sa.StrangerAccounts.dao.SAUserDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.LoginReqDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.LoginResDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.Group;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import bo.edu.ucb.sa.StrangerAccounts.util.StrangerAccountsException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class LoginBl {
    //definiendo el JSON Web Token secreto que nos ayudara a generar el token principal mas adelante
    public final static String JWT_SECRET = "LaGeraEsLaMejor1304";
    private SAUserDao saUserDao;
    private GroupDao groupDao;
    public LoginBl(SAUserDao saUserDao, GroupDao groupDao) {
        this.saUserDao = saUserDao;
        this.groupDao = groupDao;
    }
    // en esta funcion generamos el token principal
    private LoginResDto generateTokenJwt(String subject, int expirationTimeInSeconds, List<String> group) {
        LoginResDto result = new LoginResDto();

        try {
            Algorithm algorithm = Algorithm.HMAC256(JWT_SECRET);
            String token = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(subject)
                    .withArrayClaim("grupo", group.toArray(new String[group.size()]))
                    .withClaim("refresh", false)
                    .withExpiresAt(new Date(System.currentTimeMillis() + (expirationTimeInSeconds * 1000)))
                    .sign(algorithm);
            result.setToken(token);
            String refreshToken = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(subject)
                    .withClaim("refresh", true)
                    .withExpiresAt(new Date(System.currentTimeMillis() + (expirationTimeInSeconds * 1000 * 2)))
                    .sign(algorithm);
            result.setRefresh(refreshToken);
        } catch (JWTCreationException exception){
            throw new StrangerAccountsException("Error al generar el token", exception);
        }
        return result;
    }

    public LoginResDto authenticate(LoginReqDto credentials) {
        LoginResDto result = new LoginResDto();
        //System.out.println("Comenzando proceso de autenticación con: " + credentials);
        //buscando el password por medio del username
        String currentPasswordInBCrypt = saUserDao.findSecretByUsername(credentials.username());
       // System.out.println("Se obtuvo la siguiente contraseña de bbdd: " + currentPasswordInBCrypt);
        // confirmando que el password sea diferente de null
        if (currentPasswordInBCrypt != null ) {
            //System.out.println("Se procede a verificar si las contraseñas coinciden");
            // Consulto si los passwords coinciden
            BCrypt.Result bcryptResult = BCrypt.verifyer().verify(credentials.password().toCharArray(), currentPasswordInBCrypt);
            // si ha sido correctamente verificado
            if (bcryptResult.verified) {
                // Procedo a generar el token
                System.out.println("Las constraseñas coinciden se genera el token");
                // Consultamos los roles que tiene el usuario y llenamos en entity
                List<Group> groups = groupDao.findRoleByUsername(credentials.username());
                List<String> groupsAsString = new ArrayList<>();
                for ( Group group : groups) {
                    //guardamos unicamente el nombre del grupo al que pertenece el usuario
                    groupsAsString.add(group.getGroupName());
                }
                // Con esto no será necesario refrescar token.
                // FIXME: Error de seguridad, los tokens deberían ser de corta duración.
                result = generateTokenJwt(credentials.username(), 30000, groupsAsString);

            } else {
                System.out.println("Las constraseñas no coinciden");
                throw new StrangerAccountsException("Forbiden the secret and password are wrong.");
            }
        } else {
            System.out.println("Usuario no existente");
            throw new StrangerAccountsException("El usuario y contraseña son incorrectos.");
        }
        return result;
    }




}
