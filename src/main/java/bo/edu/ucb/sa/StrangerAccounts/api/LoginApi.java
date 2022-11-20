package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.LoginBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.LoginReqDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.LoginResDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.ResponseDto;
import bo.edu.ucb.sa.StrangerAccounts.util.StrangerAccountsException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
// definiendo la ruta del api
@RequestMapping("/api/v1/loapi")

public class LoginApi {

    private LoginBl loginBl;

    public LoginApi(LoginBl loginBl) {
        this.loginBl = loginBl;
    }

    @PostMapping()
    public ResponseDto<LoginResDto> authentication(@RequestBody LoginReqDto loginReqDto) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            // Do nothing
        }
        if (loginReqDto != null && loginReqDto.username() != null && loginReqDto.password() != null) {
            // Retorna los tokens, null (porque no hay error), true porque fue exitoso
            try {
                return new ResponseDto<>(true, null, loginBl.authenticate(loginReqDto));
            } catch (StrangerAccountsException ex) {
                return new ResponseDto<>(false, ex.getMessage(), null);
            }
        } else {
            return new ResponseDto<>(false, "Credenciales incorrectas", null);
        }
    }


}
