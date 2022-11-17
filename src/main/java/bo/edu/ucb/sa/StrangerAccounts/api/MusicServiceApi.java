package bo.edu.ucb.sa.StrangerAccounts.api;

import bo.edu.ucb.sa.StrangerAccounts.bl.MusicBl;
import bo.edu.ucb.sa.StrangerAccounts.dto.ResponseDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/music")
public class MusicServiceApi {
    MusicBl musicBl;

    public MusicServiceApi(MusicBl musicBl) {
        this.musicBl = musicBl;
    }

    @GetMapping("/")
    public ResponseEntity<ResponseDto> listMusicServices(@RequestHeader Map<String,String> headers){
        try {
            List<SAServices> platformName = musicBl.listMusicServices(headers.get("platformName"));
            ResponseDto<List<SAServices>> responseDto = new ResponseDto<>(platformName, "Music Services", true);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } catch (Exception e) {
            ResponseDto<String> responseDto = new ResponseDto<>(null, null, false);
            return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
