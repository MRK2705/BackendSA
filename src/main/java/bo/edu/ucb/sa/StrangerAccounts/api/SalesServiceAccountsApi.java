package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.SalesServiceAccountsBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.ResponseDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.SalesServiceAccountsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/sales")
public class SalesServiceAccountsApi {

    private final SalesServiceAccountsBl salesServiceAccountsBl;

    public SalesServiceAccountsApi(SalesServiceAccountsBl salesServiceAccountsBl) {
        this.salesServiceAccountsBl = salesServiceAccountsBl;
    }

    @PostMapping()
    public ResponseEntity<ResponseDto> CreateSalesServiceAccounts(@RequestBody SalesServiceAccountsDto salesServiceAccountsDto) {
        ResponseDto responseDto = new ResponseDto();
        try {
            this.salesServiceAccountsBl.CreateSalesServiceAccounts(salesServiceAccountsDto.getServiceId(), salesServiceAccountsDto);
            responseDto.setMessage("SalesServiceAccounts created successfully");
            responseDto.setData(salesServiceAccountsDto);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } catch (Exception e) {
            responseDto.setMessage("Error creating SalesServiceAccounts");
            responseDto.setData(e.getMessage());
            return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
