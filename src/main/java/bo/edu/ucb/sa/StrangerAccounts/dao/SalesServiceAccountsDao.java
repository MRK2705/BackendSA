package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.entity.SASalesServiceAccounts;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface SalesServiceAccountsDao {

    @Insert("""
            insert into sales_service_accounts
                (service_id, user_id, item_account_id, profile_username, duration_label, start_date, expiration_date, price, num_devices, total_price, status, tx_username, tx_host, tx_date)
                values
                (#{serviceId},#{userId},#{itemAccountId},#{profileUsername},#{durationLabel},now(),now()+INTERVAL '30 DAY',#{price},#{numDevices},#{price},true,'jperez','localhost',now());
            """)
    void CreateSalesServiceAccounts(SASalesServiceAccounts salesServiceAccounts);
}
