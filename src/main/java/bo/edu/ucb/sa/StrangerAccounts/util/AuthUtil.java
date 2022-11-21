package bo.edu.ucb.sa.StrangerAccounts.util;

import bo.edu.ucb.sa.StrangerAccounts.bl.LoginBl;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import java.util.List;
import java.util.Map;

public class AuthUtil {

    /**
     * Recibimos el token JWT y si sale bien, retornamos el sub, caso controrio lanzamos una excepcion
     * @param jwtToken
     * @return
     */
    public static String isUserAuthenticated(String jwt) {
        String subject = null;
        try {
            subject = JWT.require(Algorithm.HMAC256(LoginBl.JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getSubject();
        } catch (JWTVerificationException ex) {
            System.out.println("Usuario no autenticado");
        }
        return subject;
    }

    public static String getTokenFromHeader(Map<String, String> headers) {
        if (headers.get("Authorization") == null && headers.get("authorization") == null ) {
            System.out.println("No se ha enviado el token de autorización");
        }
        // Se acostumbra que cuando se envia el token, se lo envia en el siguiente formato
        // Authorization: Bearer TOKEN
        String jwt = "";
        if (headers.get("Authorization") != null) {
            jwt = headers.get("Authorization").split(" ")[1];
        } else {
            jwt = headers.get("authorization").split(" ")[1];
        }
        return jwt;
    }
    /**
     * Recibimos el token JWT y verificamos si tiene un grupo en particular
     * @param jwtToken
     * @return true si tiene el grupo y false si no lo tiene
     */
    public static boolean tokenHasRole(String jwt, String group) {
        List<String> groups = JWT.require(Algorithm.HMAC256(LoginBl.JWT_SECRET))
                .build()
                .verify(jwt)
                .getClaim("group").asList(String.class);
        return groups.contains(group);
    }

    /**
     * Recibimos el token JWT y verificamos si tiene un rol en particular, si no lo tiene se lanza excepción
     * @param jwtToken
     */
    public static void verifyHasRole(String jwt, String group) {
        List<String> roles = JWT.require(Algorithm.HMAC256(LoginBl.JWT_SECRET))
                .build()
                .verify(jwt)
                .getClaim("group").asList(String.class);
        if(!group.contains(group)) {
            System.out.println("No tiene permisos para realizar esta acción");
        }
    }

}
