package bo.edu.ucb.sa.StrangerAccounts.dao;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

public interface UserDao {

    // encontrando el password por medio del username
    @Select("""
            select pass
            from 
                sa_users
            WHERE
                email = #{username} 
                AND status = true
            """)
    String findSecretByUsername(String username);


}
