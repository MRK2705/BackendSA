package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.entity.Group;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface GroupDao {
    // encontrando el password por medio del username
    @Select("""
            select b.group_name, b.description, b.status, b.tx_username, b.tx_host, b.tx_date
            FROM  sa_users a
                JOIN sa_group b
            ON
                a.email = #{username} 
                AND a.status = true
                AND a.group_id = b.group_id
                AND b.status = true
            """)
    public List<Group> findRoleByUsername(String username);
}