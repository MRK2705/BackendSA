package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.GamingBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.ResponseDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAServices;
import bo.edu.ucb.sa.StrangerAccounts.util.AuthUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/gaming")
public class GamingServiceApi {
    private final GamingBl gamingBl;

    public GamingServiceApi(GamingBl gamingBl) {
        this.gamingBl = gamingBl;
    }

    @GetMapping("/")
    public ResponseEntity<ResponseDto> listGamingServices(@RequestHeader Map<String,String> headers){
        try {
            String jwt = AuthUtil.getTokenFromHeader(headers);
            AuthUtil.verifyHasRole(jwt, "Cliente normal");
            List<SAServices> platformName = gamingBl.listGamingServices(headers.get("platformName"));
            ResponseDto<List<SAServices>> responseDto = new ResponseDto<>(true, "Gaming Services", platformName);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } catch (Exception e) {
            ResponseDto<String> responseDto = new ResponseDto<>(false, null, null);
            return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
