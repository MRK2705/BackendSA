package bo.edu.ucb.sa.StrangerAccounts.dto;

public class RestorePassReqDto {
    private String password;

    public RestorePassReqDto() {
    }

    public RestorePassReqDto(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override

    public String toString() {
        return "RestorePassDto{" +
                "password='" + password + '\'' +
                '}';
    }
}
