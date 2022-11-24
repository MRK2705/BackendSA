package bo.edu.ucb.sa.StrangerAccounts.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.sa.StrangerAccounts.dao.SAUserDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.RegisterReqDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.RestorePassReqDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.VerifyCodeReqDto;
import bo.edu.ucb.sa.StrangerAccounts.dto.VerifyUserReqDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAUser;
import org.springframework.stereotype.Service;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;




@Service
public class UserBl {

    private SAUserDao saUserDao;
    private int code1 = 0;
    private String auxpass = "";


    public UserBl(SAUserDao saUserDao) {
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
        saUserDao.saveUser(saUser);
    }

    //encontrar el usuario por email
    public SAUser findByUsername(String username) {
        return saUserDao.findByUsername(username);
    }

    public void verifyUser(VerifyUserReqDto verifyUserReqDto) {
        auxpass = verifyUserReqDto.getUsername();

        if (findByUsername(verifyUserReqDto.getUsername()) != null) {


            code1 = (int) (Math.random() * ((9999 - 1000) + 1)) + 1000;
            String emailFrom = "strngrccnts@gmail.com";
            String passwordFrom = "kuyhefkmjpqnziba";
            String emailTo = verifyUserReqDto.getUsername();
            String subject = "Codigo de verificacion";
            String content = "Su codigo de verificacion es: " + code1;
            Properties mProperties = new Properties();
            Session mSession;
            MimeMessage mMessage;
            //Configuración de la conexión con el servidor de Gmail
            mProperties.put("mail.smtp.host", "smtp.gmail.com");
            mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            mProperties.setProperty("mail.smtp.starttls.enable", "true");
            mProperties.setProperty("mail.smtp.port", "587");
            mProperties.setProperty("mail.smtp.user", emailFrom);
            mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
            mProperties.setProperty("mail.smtp.auth", "true");

            mSession = Session.getDefaultInstance(mProperties);

            try {
                mMessage = new MimeMessage(mSession);
                mMessage.setFrom(new InternetAddress(emailFrom));
                mMessage.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress(emailTo));
                mMessage.setSubject(subject);
                mMessage.setText(content, "ISO-8859-1", "html");

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }

            //procedemos a enviar el correo
            try {
                Transport t = mSession.getTransport("smtp");
                t.connect(emailFrom, passwordFrom);
                t.sendMessage(mMessage, mMessage.getRecipients(Message.RecipientType.TO));
                t.close();
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("El usuario no existe");
        }


    }

    public String verifyCode(VerifyCodeReqDto verifyCodeReqDto) {
        int code2 = Integer.parseInt(verifyCodeReqDto.getCodee());
        if (code1 == code2) {
            return ("Codigo correcto");
        } else {
            throw new RuntimeException("Codigo incorrecto");
        }


    }

    public void restorePass(RestorePassReqDto restorePassReqDto) {
        String secret = BCrypt.withDefaults().hashToString(12,
                restorePassReqDto.getPassword().toCharArray());
        saUserDao.updatePass(auxpass, secret);


    }
}




