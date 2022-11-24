package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.dto.PlansPersonalizationDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.Plans;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//sacar los planes de un servicio
public interface PlansPersonalizationDao {
    @Select("""
            select p.service_id,p.plans_id,p.duration_label,p.days, p.price from plans  p
                     JOIN service s ON s.service_id=p.service_id
                     and s.service_id=#{serviceId};
            """)
    List<PlansPersonalizationDto>getPlansByServiceId (Integer serviceId);
}
