package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.dto.MethodDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.SalesServiceAccountsDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AcquiredServiceDao {
    @Select("""
            Select a.profile_username, a.duration_label, a.start_date, a.expiration_date
            from sales_service_accounts a
            where a.user_id = #{serviceId}
             """)
    List<SalesServiceAccountsDto>lista(Integer serviceId);
}
