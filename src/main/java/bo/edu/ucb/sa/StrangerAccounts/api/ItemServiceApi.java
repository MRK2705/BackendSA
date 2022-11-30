package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.ItemBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.ItemDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/item")
public class ItemServiceApi {

    private final ItemBl itemBl;

    public ItemServiceApi(ItemBl itemBl) {
        this.itemBl = itemBl;
    }

    @GetMapping("/")
    public ResponseEntity<ResponseDto> listItems(@RequestHeader Map<String,String> headers){
        try {
            List<ItemDto> articleConcept = itemBl.listItems(headers.get("articleConcept"));
            ResponseDto<List<ItemDto>> responseDto = new ResponseDto<>(true, "Items", articleConcept);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } catch (Exception e) {
            ResponseDto<String> responseDto = new ResponseDto<>(false, null, null);
            return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
