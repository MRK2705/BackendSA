package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.dto.MethodDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.SalesServiceAccountsDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AcquiredServiceDao {
    @Select("""
            Select a.service_Id, se.platform_name, a.user_Id, a.profile_username, a.duration_label, se.picture,a.start_date, a.expiration_date
            from sales_service_accounts a JOIN sa_users s ON s.user_Id=a.user_id
                                          JOIN service se ON se.service_id=a.service_id
            where s.user_id =#{userId};
             """)
    List<SalesServiceAccountsDto>lista(Integer userId);
}
