package bo.edu.ucb.sa.StrangerAccounts.bl;

import bo.edu.ucb.sa.StrangerAccounts.dao.SAServiceDao;
import bo.edu.ucb.sa.StrangerAccounts.dao.SAUserDao;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicBl {
    private final SAServiceDao saServiceDao;

    public MusicBl(SAServiceDao saServiceDao) {
        this.saServiceDao = saServiceDao;
    }

    public List<SAServices> listMusicServices(String PlatformName) {

        if (saServiceDao.listMusicServices(PlatformName) == null) {
            System.out.println("No se encontró el servicio");
        }
        return saServiceDao.listMusicServices(PlatformName);
    }
}
