package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.UserBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.*;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAUser;
import bo.edu.ucb.sa.StrangerAccounts.util.AuthUtil;
import bo.edu.ucb.sa.StrangerAccounts.util.StrangerAccountsException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/userapi")
public class UserApi {
    private UserBl userBl;

    public UserApi(UserBl userBl) {
        this.userBl = userBl;
    }

    /**
     * HACERLO ASÍ POR SIMPLICIDAD.
     * @param registerReqDto
     * @return
     */

    @PostMapping("/register")
    public ResponseDto<String> createUser(@RequestBody RegisterReqDto registerReqDto) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            // Do nothing
        }
        if (registerReqDto != null && registerReqDto.getPicture() != null && registerReqDto.getName() != null && registerReqDto.getLastname() != null && registerReqDto.getUsername() != null && registerReqDto.getPassword() != null && registerReqDto.getPhone() != null) {
            try {

                userBl.createUser(registerReqDto);
                return new ResponseDto<>(true, "Usuario creado correctamente", null);
            } catch (StrangerAccountsException ex) {
                return new ResponseDto<>(false, ex.getMessage(), null);
            }
        }
        else {
            return new ResponseDto<>(false, "Credenciales incorrectas", null);
        }
    }
    /**
     * HACERLO ASÍ POR SIMPLICIDAD.
     * @param userId
     * @return
     */


    @GetMapping("/")
    public ResponseDto<SAUser> getUserFromToken(@RequestHeader Map<String, String> headers) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            // Do nothing
        }
        try {
            String username = AuthUtil.isUserAuthenticated(AuthUtil.getTokenFromHeader(headers));
            return new ResponseDto<>(true, null, userBl.findByUsername(username));
        }
        catch (Exception ex) {
            return new ResponseDto<>(false, ex.getMessage(), null);
        }
    }

    /**
     * HACERLO ASÍ POR SIMPLICIDAD.
     * @param verifyUserReqDto
     * @return
     */

    @PostMapping("/verify")
    public ResponseDto<String> verifyUser(@RequestBody VerifyUserReqDto verifyUserReqDto) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            // Do nothing
        }
        if (verifyUserReqDto != null && verifyUserReqDto.getUsername() != null) {
            try {

                userBl.verifyUser(verifyUserReqDto);
                return new ResponseDto<>(true, "Se encontro el usuario y se envio el codigo de verificacion", null);
            } catch (StrangerAccountsException ex) {
                return new ResponseDto<>(false, ex.getMessage(), null);
            }
        }
        else {
            return new ResponseDto<>(false, "Credenciales incorrectas", null);
        }
    }

    @PostMapping("/verifycode")
    public  ResponseDto<String> verifyCode(@RequestBody VerifyCodeReqDto verifyCodeReqDto) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            // Do nothing
        }
        if (verifyCodeReqDto != null && verifyCodeReqDto.getCodee() != null) {
            try {

                userBl.verifyCode(verifyCodeReqDto);
                return new ResponseDto<>(true, userBl.verifyCode(verifyCodeReqDto), null);
            } catch (StrangerAccountsException ex) {
                return new ResponseDto<>(false, ex.getMessage(), null);
            }
        }
        else {
            return new ResponseDto<>(false, "Credenciales incorrectas", null);
        }


    }

    @PostMapping("/restorepass")
    public  ResponseDto<String> restorePass(@RequestBody RestorePassReqDto restorePassReqDto) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            // Do nothing
        }
        if (restorePassReqDto != null && restorePassReqDto.getPassword() != null) {
            try {

                userBl.restorePass(restorePassReqDto);
                return new ResponseDto<>(true, "Se actualizo la contrasena correctamente", null);
            } catch (StrangerAccountsException ex) {
                return new ResponseDto<>(false, ex.getMessage(), null);
            }
        }
        else {
            return new ResponseDto<>(false, "Credenciales incorrectas", null);
        }
    }




}
