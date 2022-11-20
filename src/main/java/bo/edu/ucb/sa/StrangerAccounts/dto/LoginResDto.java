package bo.edu.ucb.sa.StrangerAccounts.dto;

public class LoginResDto {
    private String token;
    private String refresh;

    public LoginResDto() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    @Override
    public String toString() {
        return "AuthResDto{" +
                "token='" + token + '\'' +
                ", refresh='" + refresh + '\'' +
                '}';
    }
}