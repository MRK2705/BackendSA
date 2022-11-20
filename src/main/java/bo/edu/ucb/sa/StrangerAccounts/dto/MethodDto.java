package bo.edu.ucb.sa.StrangerAccounts.dto;

public class MethodDto {

    private String MethodName;
    private String MethodLink;
    private String MethodPicture;

    public MethodDto() {
    }

    public MethodDto(String methodName, String methodLink, String methodPicture) {
        MethodName = methodName;
        MethodLink = methodLink;
        MethodPicture = methodPicture;
    }

    public String getMethodName() {
        return MethodName;
    }

    public void setMethodName(String methodName) {
        MethodName = methodName;
    }

    public String getMethodLink() {
        return MethodLink;
    }

    public void setMethodLink(String methodLink) {
        MethodLink = methodLink;
    }

    public String getMethodPicture() {
        return MethodPicture;
    }

    public void setMethodPicture(String methodPicture) {
        MethodPicture = methodPicture;
    }

    @Override
    public String toString() {
        return "MethodDto{" +
                "MethodName='" + MethodName + '\'' +
                ", MethodLink='" + MethodLink + '\'' +
                ", MethodPicture='" + MethodPicture + '\'' +
                '}';
    }
}


