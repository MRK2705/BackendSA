package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.RegisterBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.RegisterReqDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.ResponseDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAUser;
import bo.edu.ucb.sa.StrangerAccounts.util.AuthUtil;
import bo.edu.ucb.sa.StrangerAccounts.util.StrangerAccountsException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reapi")
public class RegisterApi {
    private RegisterBl registerBl;

    public RegisterApi(RegisterBl registerBl) {
        this.registerBl = registerBl;
    }

    @PostMapping
    public ResponseDto<String> createUser(@RequestBody RegisterReqDto registerReqDto) {
        try {

            registerBl.createUser(registerReqDto);
            return new ResponseDto<>(true, "Usuario creado correctamente", null);
        } catch (StrangerAccountsException ex) {
            return new ResponseDto<>(false, ex.getMessage(), null);
        }
    }

    /**
     * Endpoint para probar la busqueda por llave primaria
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
            return new ResponseDto<>(true, null, this.registerBl.findByUsername(username));
        }
        catch (Exception ex) {
            return new ResponseDto<>(false, ex.getMessage(), null);
        }
    }



}
