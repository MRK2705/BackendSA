package bo.edu.ucb.sa.StrangerAccounts.bl;

import bo.edu.ucb.sa.StrangerAccounts.dao.SAServiceDao;
import bo.edu.ucb.sa.StrangerAccounts.dao.SAUserDao;
import bo.edu.ucb.sa.StrangerAccounts.dao.SalesServiceAccountsDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.SalesServiceAccountsDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.SASalesServiceAccounts;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceAccountsBl {

    private final SAServiceDao saServiceDao;
    private final SalesServiceAccountsDao salesServiceAccountsDao;

    public SalesServiceAccountsBl(SAServiceDao saServiceDao, SalesServiceAccountsDao salesServiceAccountsDao) {
        this.saServiceDao = saServiceDao;
        this.salesServiceAccountsDao = salesServiceAccountsDao;
    }

    public void CreateSalesServiceAccounts(Integer serviceId, SalesServiceAccountsDto salesServiceAccountsDto) {
        SASalesServiceAccounts salesServiceAccounts = new SASalesServiceAccounts();
        salesServiceAccounts.setServiceId(salesServiceAccountsDto.getServiceId());
        salesServiceAccounts.setUserId(salesServiceAccountsDto.getUserId());
        salesServiceAccounts.setItemAccountId(salesServiceAccountsDto.getItemAccountId());
        salesServiceAccounts.setProfileUsername(salesServiceAccountsDto.getProfileUsername());
        salesServiceAccounts.setDurationLabel(salesServiceAccountsDto.getDurationLabel());
        salesServiceAccounts.setStartDate(salesServiceAccountsDto.getStartDate());
        salesServiceAccounts.setExpirationDate(salesServiceAccountsDto.getExpirationDate());
        salesServiceAccounts.setPrice(salesServiceAccountsDto.getPrice());
        salesServiceAccounts.setNumDevices(salesServiceAccountsDto.getNumDevices());
        salesServiceAccounts.setTotalPrice(salesServiceAccountsDto.getTotalPrice());
        this.salesServiceAccountsDao.CreateSalesServiceAccounts(salesServiceAccounts);
    }
}
