package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.dto.PlansPersonalizationDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.Plans;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//sacar los planes de un servicio
public interface PlansPersonalizationDao {
    @Select("""
            select plan_id
            from plans  p
            JOIN service s ON s.service_id=p.service_id
            """)
    Plans getPlansByServiceId(Integer serviceId);
}
