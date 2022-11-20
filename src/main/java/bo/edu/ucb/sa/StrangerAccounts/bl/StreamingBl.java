package bo.edu.ucb.sa.StrangerAccounts.bl;

import bo.edu.ucb.sa.StrangerAccounts.dao.SAServiceDao;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamingBl {

    private final SAServiceDao saServiceDao;

    public StreamingBl(SAServiceDao saServiceDao) {
        this.saServiceDao = saServiceDao;
    }

    public List<SAServices> listStreamingServices(String PlatformName) {

        if (saServiceDao.listStreamingServices(PlatformName) == null) {
            System.out.println("No se encontró el servicio");
        }
        return saServiceDao.listStreamingServices(PlatformName);
    }

    public Integer listStreaming(Integer ServiceId) {

        if (saServiceDao.listStreaming(ServiceId) == null) {
            System.out.println("No se encontró el servicio");
        }
        return saServiceDao.listStreaming(ServiceId);
    }
}
