package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.AcquiredBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.ResponseDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.SalesServiceAccountsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/acquired")
public class AcquiredApi {

    private final AcquiredBl acquiredBl;
    public AcquiredApi(AcquiredBl acquiredBl) {
        this.acquiredBl = acquiredBl;
    }
    @GetMapping("/{serviceId}")
    public ResponseEntity<ResponseDto> listMethods(@PathVariable Integer serviceId) {
        try{
            List<SalesServiceAccountsDto> ServiceName = acquiredBl.listMethodsA(serviceId);
            ResponseDto<List<SalesServiceAccountsDto>> responseDto = new ResponseDto<>(true, "Servicios Adquiridos", ServiceName);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<String> responseDto = new ResponseDto<>(false, null, null);
            return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
