package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.SecurityBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.AuthReqDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.AuthResDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.UserDto;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/auth")
public class AuthApi {
    private SecurityBl securityBl;

    public AuthApi(SecurityBl securityBl) {
        this.securityBl = securityBl;
    }

    @GetMapping("/{userId}")
    public UserDto test(@PathVariable(name = "userId") Integer userId){
        return this.securityBl.getUserByPk(userId);
    }

    @PostMapping()
    public AuthResDto authentication(@RequestBody AuthReqDto authReqDto){
        return securityBl.authenticate(authReqDto);
    }

}