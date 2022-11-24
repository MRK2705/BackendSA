package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.PlansPersonalizationBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.PlansPersonalizationDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/plans")
public class PlansPersonalizationApi {

    PlansPersonalizationBl plansPersonalizationBl;

    public PlansPersonalizationApi(PlansPersonalizationBl plansPersonalizationBl) {
        this.plansPersonalizationBl = plansPersonalizationBl;
    }

    @GetMapping("/{serviceId}")
    public ResponseEntity<ResponseDto> getPlansByServiceId(@PathVariable Integer serviceId) {
        try {
            List<PlansPersonalizationDto> plans = plansPersonalizationBl.getPlansByServiceId(serviceId);
            ResponseDto<List<PlansPersonalizationDto>> responseDto = new ResponseDto<>(true, "Plans", plans);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } catch (Exception e) {
            ResponseDto<String> responseDto = new ResponseDto<>(false, null, null);
            return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
