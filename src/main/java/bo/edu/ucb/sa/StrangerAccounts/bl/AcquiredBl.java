package bo.edu.ucb.sa.StrangerAccounts.bl;

import bo.edu.ucb.sa.StrangerAccounts.dao.AcquiredServiceDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.MethodDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcquiredBl {
    private final AcquiredServiceDao acquiredServiceDao;
    public AcquiredBl(AcquiredServiceDao acquiredServiceDao) {
        this.acquiredServiceDao = acquiredServiceDao;
    }
    public List<MethodDto> listMethods(String methodName) {
        if (acquiredServiceDao.listMethods(methodName) == null) {
            System.out.println("No se encontraron servicios adquiridos");
        }
        return acquiredServiceDao.listMethods(methodName);
    }
}
