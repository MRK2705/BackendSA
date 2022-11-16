package bo.edu.ucb.sa.StrangerAccounts.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.sa.StrangerAccounts.dao.SAUserDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.AuthReqDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.AuthResDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.UserDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityBl {
    private SAUserDao saUserDao;

    public SecurityBl(SAUserDao saUserDao) {
        this.saUserDao = saUserDao;
    }

    public UserDto getUserByPk(Integer user_id) {
        SAUser saUser = saUserDao.findByPrimaryKey(user_id);
        //Transformamos la entidad de base de datos
        // a un DTO para retornar via API --Data transfer Object
        UserDto userDto = new UserDto(saUser.getUserId(), saUser.getGroupId(), saUser.getProfilePicture(), saUser.getFirstName(), saUser.getLastName(), saUser.getEmail(), saUser.getPhone());
        return userDto;
    }

    //este memtodo realiza la autenticacion del sistema, busca en la bdd la contraseña del usuario y
    //la compara con su equivalente BYCRIPT
    public AuthResDto authenticate(AuthReqDto credentials) {
        AuthResDto result = new AuthResDto();
        System.out.println("Comenzando proceso de autenticación con: " + credentials);
        String currentPasswordInBCrypt = saUserDao.findByUsernameAndPassword(credentials.getEmail());
        System.out.println("Se obtuvo la siguiente contraseña de bbdd: " + currentPasswordInBCrypt);
        if (currentPasswordInBCrypt!= null) {
            System.out.println("Se procede a verificar si las contraseñas coinciden");
            String passs = currentPasswordInBCrypt;
            //BCrypt.Result bcryptResult1 = BCrypt.verifyer().verify(credentials.getPassword().toCharArray(), currentPasswordInBCrypt);
            if (passs.equals(credentials.getPassword())) { // Ha sido verificado
                // Procedo a generar el token
                System.out.println("Las constraseñas coinciden se genera el token");
            } else {
                System.out.println("Las constraseñas no coinciden");
            }
        } else {
            System.out.println("Usuario no existente");
        }
        return result;
    }
}
