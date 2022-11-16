package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.entity.SAUser;
import org.apache.ibatis.annotations.Select;

public interface SAUserDao {

    @Select("""
            SELECT user_id,group_id,profile_picture,first_name,last_name,
            email,pass,phone,status,tx_username,tx_host,tx_date
            FROM sa_users
            WHERE
                user_id = #{user_id};
                AND status = true
            """)
    SAUser findByPrimaryKey(Integer user_id);

    @Select("""
            SELECT pass
            FROM sa_users
            WHERE
                email = #{email}
                AND status = true
            """)
    public String findByUsernameAndPassword(String email);
}
