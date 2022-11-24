package bo.edu.ucb.sa.StrangerAccounts.dto;

public class VerifyUserReqDto {
    private String username;

    public VerifyUserReqDto() {
    }

    public VerifyUserReqDto(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "VerifyUsernameReqDto{" +
                "username='" + username + '\'' +
                '}';
    }
}
