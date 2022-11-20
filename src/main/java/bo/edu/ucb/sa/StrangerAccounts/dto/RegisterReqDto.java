package bo.edu.ucb.sa.StrangerAccounts.dto;

public class RegisterReqDto {
    private String picture;
    private String name;
    private String lastname;
    private String username;
    private String password;
    private String phone;

       public RegisterReqDto() {
        }

        public RegisterReqDto(String picture,String name, String lastname, String username, String password, String phone) {
           this.picture = picture;
           this.name = name;
            this.lastname = lastname;
            this.username = username;
            this.password = password;
            this.phone = phone;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "RegisterReqDto{" +
                "picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}


