package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.AcquiredBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.ResponseDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.SalesServiceAccountsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/acquired")
public class AcquiredApi {

    private final AcquiredBl acquiredBl;
    public AcquiredApi(AcquiredBl acquiredBl) {
        this.acquiredBl = acquiredBl;
    }
    @GetMapping("/")
    public ResponseEntity<ResponseDto> listMethods(@RequestHeader Map<String,String> headers) {
        try{
            List<SalesServiceAccountsDto> ServiceName = acquiredBl.listMethodsA(headers.get("ServiceName"));
            ResponseDto<List<SalesServiceAccountsDto>> responseDto = new ResponseDto<>(true, "Metodos de pago", ServiceName);
            return ResponseEntity.ok(responseDto);
        }catch (Exception e){
            ResponseDto<String> responseDto = new ResponseDto<>(false, null, null);
            return ResponseEntity.ok(responseDto);
        }
    }
}
