package bo.edu.ucb.sa.StrangerAccounts.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.sa.StrangerAccounts.dao.SAUserDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.RegisterReqDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAUser;
import org.springframework.stereotype.Service;

@Service
public class RegisterBl {
    private SAUserDao saUserDao;

    public RegisterBl(SAUserDao saUserDao) {
        this.saUserDao = saUserDao;
    }

    public void createUser(RegisterReqDto registerReqDto) {
        SAUser saUser = new SAUser();
        saUser.setProfilePicture(registerReqDto.getPicture());
        saUser.setFirstName(registerReqDto.getName());
        saUser.setLastName(registerReqDto.getLastname());
        // seteando el email al entity
        saUser.setEmail(registerReqDto.getUsername());
        // Encrypt secret with BCrypt
        String secret = BCrypt.withDefaults().hashToString(12,
                registerReqDto.getPassword().toCharArray());
        // setenado el password encriptado al entity
        saUser.setPass(secret);
        saUser.setPhone(registerReqDto.getPhone());
        // usando funcion de dao para guardar el usuario
        this.saUserDao.saveUser(saUser);
    }


}
