package bo.edu.ucb.sa.StrangerAccounts.dto;

public class VerifyCodeReqDto {
    private String codee;

    public VerifyCodeReqDto() {
    }

    public VerifyCodeReqDto(String codee) {
        this.codee = codee;
    }

    public String getCodee() {
        return codee;
    }

    public void setCodee(String codee) {
        this.codee = codee;
    }

    @Override

    public String toString() {
        return "VerifyCodeReqDto{" +
                "codee='" + codee + '\'' +
                '}';
    }

}
