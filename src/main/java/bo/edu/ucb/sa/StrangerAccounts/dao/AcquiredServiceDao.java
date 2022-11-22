package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.dto.MethodDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AcquiredServiceDao {
    @Select("""
            Select a.serviceId, a.userId
            from sales_service_accounts a
            where a.userid = #{serviceId}
             """)
    List<MethodDto> listMethods(String methodName);
}
