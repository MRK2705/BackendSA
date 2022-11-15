package bo.edu.ucb.sa.StrangerAccounts.bl;

import bo.edu.ucb.sa.StrangerAccounts.dao.SAUserDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.UserDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAUser;
import org.springframework.stereotype.Service;

@Service
public class SecurityBl {
    private SAUserDao saUserDao;

    public SecurityBl(SAUserDao saUserDao) {
        this.saUserDao = saUserDao;
    }

    public UserDto getUserByPk(Integer user_id){
        SAUser saUser = saUserDao.findByPrimaryKey(user_id);
        UserDto userDto = new UserDto(saUser.getUser_id(),saUser.getGroup_id(),saUser.getProfile_picture(),saUser.getFirst_name(),saUser.getLast_name(),saUser.getEmail(),saUser.getPhone());
        return userDto;
    }

}
