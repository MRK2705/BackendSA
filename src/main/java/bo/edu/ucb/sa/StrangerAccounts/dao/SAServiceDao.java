package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.entity.SAServices;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SAServiceDao {
    @Select("""
            select a.platform_name, a.service_type, a.picture,string_agg(b.duration_label||b.price,', ') as DurationLabel
            from service a JOIN plans b ON
                    a.service_id = b.service_id
                    and a.service_type = 'Streaming'
                    and a.status = true
                    and b.status = true
            group by a.platform_name, a.service_type,a.picture;
            """)
    List<SAServices> listStreamingServices(String PlatformName);

    @Select("""
            select a.platform_name, a.service_type, a.picture,string_agg(b.duration_label||b.price,', ') as DurationLabel
            from service a JOIN plans b ON
                    a.service_id = b.service_id
                    and a.service_type = 'Streaming'
                    and a.status = true
                    and b.status = true
            group by a.platform_name, a.service_type,a.picture;
            """)
    Integer listStreaming(Integer ServiceId);

    @Select("""
            select a.platform_name, a.service_type, a.picture,string_agg(b.duration_label||b.price,', ') as DurationLabel
            from service a JOIN plans b ON
                    a.service_id = b.service_id
                    and a.service_type = 'Music'
                    and a.status = true
                    and b.status = true
            group by a.platform_name, a.service_type,a.picture;
            """)
    List<SAServices> listMusicServices(String PlatformName);

    @Select("""
            select a.platform_name, a.service_type, a.picture,string_agg(b.duration_label||b.price,', ') as DurationLabel
            from service a JOIN plans b ON
                    a.service_id = b.service_id
                    and a.service_type = 'Gaming'
                    and a.status = true
                    and b.status = true
            group by a.platform_name, a.service_type,a.picture;
            """)
    List<SAServices> listGamingServices(String PlatformName);
}
