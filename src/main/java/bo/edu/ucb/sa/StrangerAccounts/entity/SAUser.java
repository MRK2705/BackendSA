package bo.edu.ucb.sa.StrangerAccounts.entity;

import java.util.Date;

public class SAUser {
    private Integer userId;
    private Integer groupId;
    private String profilePicture;
    private String firstName;
    private String lastName;
    private String email;
    private String pass;
    private String phone;
    private Boolean status;
    private String txUsername;
    private String txHost;
    private Date txDate;

    public SAUser() {
    }

    public SAUser(Integer userId, Integer groupId, String profilePicture, String firstName, String lastName, String email, String pass, String phone, Boolean status, String txUsername, String txHost, Date txDate) {
        this.userId = userId;
        this.groupId = groupId;
        this.profilePicture = profilePicture;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.status = status;
        this.txUsername = txUsername;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroup_id(Integer groupId) {
        this.groupId = groupId;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profilePicture = profilePicture;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLast_name(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getTxUsername() {
        return txUsername;
    }

    public void setTxUsername(String txUsername) {
        this.txUsername = txUsername;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + userId +
                ", group_id=" + groupId +
                ", profile_picture='" + profilePicture + '\'' +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", txUsername='" + txUsername + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
