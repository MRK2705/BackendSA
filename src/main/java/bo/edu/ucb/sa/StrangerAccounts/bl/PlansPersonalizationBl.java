package bo.edu.ucb.sa.StrangerAccounts.bl;

import bo.edu.ucb.sa.StrangerAccounts.dao.PlansPersonalizationDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.PlansPersonalizationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlansPersonalizationBl {

    private final PlansPersonalizationDao plansPersonalizationDao;

    public PlansPersonalizationBl(PlansPersonalizationDao plansPersonalizationDao) {
        this.plansPersonalizationDao = plansPersonalizationDao;
    }

    public List<PlansPersonalizationDto> getPlansByServiceId(Integer serviceId) {
        if (plansPersonalizationDao.getPlansByServiceId(serviceId) == null) {
            System.out.println("No se encontró el servicio");
        }
        return plansPersonalizationDao.getPlansByServiceId(serviceId);
    }
}

