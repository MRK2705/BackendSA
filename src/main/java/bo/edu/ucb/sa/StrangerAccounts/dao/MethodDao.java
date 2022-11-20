package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.dto.MethodDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MethodDao {
     @Select("""
            Select a.total_price, a.num_devices
            from sales_service_accounts a
            where a.service_id = #{serviceId}
             """)
     List<MethodDto> listMethods(String methodName);
}

