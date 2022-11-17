package bo.edu.ucb.sa.StrangerAccounts.bl;

import bo.edu.ucb.sa.StrangerAccounts.dao.SAServiceDao;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamingBl {
    private final SAServiceDao saServiceDao;

    public GamingBl(SAServiceDao saServiceDao) {
        this.saServiceDao = saServiceDao;
    }

    public List<SAServices> listGamingServices(String PlatformName) {
        if (saServiceDao.listGamingServices(PlatformName) == null) {
            System.out.println("No se encontró el servicio");
        }
        return saServiceDao.listGamingServices(PlatformName);
    }
}
