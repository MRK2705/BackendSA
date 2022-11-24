package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.entity.SAUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SAUserDao {

    //encontrar el usuario por userId
    @Select("""
            SELECT user_id,group_id,profile_picture,first_name,last_name,
            email,pass,phone,status,tx_username,tx_host,tx_date
            FROM sa_users
            WHERE
                user_id = #{user_id};
                AND status = true
            """)
    SAUser findByPrimaryKey(Integer user_id);

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

    @Select("""
            select user_id, group_id, profile_picture, first_name, last_name, email, pass, phone, status, tx_username, tx_host, tx_date
            from 
                sa_users
            WHERE
                email = #{username} 
                AND status = true
            """)
    public SAUser findByUsername(String username);

    //guardando el usuario
    @Insert("""
            INSERT INTO sa_users (group_id,profile_picture,first_name,last_name,email,pass,phone,status,tx_username,tx_host,tx_date)
            VALUES (1,#{profilePicture},#{firstName},#{lastName},#{email},#{pass},#{phone},true,'geraldine','localhost',now())
            """)


    void saveUser(SAUser user);


}
