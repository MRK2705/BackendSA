package bo.edu.ucb.sa.StrangerAccounts.bl;

import bo.edu.ucb.sa.StrangerAccounts.dao.AcquiredServiceDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.SalesServiceAccountsDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcquiredBl {
    private final AcquiredServiceDao acquiredServiceDao;
    public AcquiredBl(AcquiredServiceDao acquiredServiceDao) {
        this.acquiredServiceDao = acquiredServiceDao;
    }
    public List<SalesServiceAccountsDto> listMethodsA(Integer serviceId) {
        if (acquiredServiceDao.lista(serviceId) == null) {
            System.out.println("No se encontraron servicios adquiridos");
        }
        return acquiredServiceDao.lista(serviceId);
    }
}
