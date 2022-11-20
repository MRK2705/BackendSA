package bo.edu.ucb.sa.StrangerAccounts.dto;

import java.util.Date;
public class SalesServiceAccountsDto {
    private Integer serviceId;
    private Integer userId;
    private Integer itemAccountId;
    private String profileUsername;
    private String durationLabel;
    private Date startDate;
    private Date expirationDate;
    private float price;
    private Integer numDevices;
    private float totalPrice;

    public SalesServiceAccountsDto() {
    }

    public SalesServiceAccountsDto(Integer serviceId, Integer userId, Integer itemAccountId, String profileUsername, String durationLabel, Date startDate, Date expirationDate, float price, Integer numDevices, float totalPrice) {
        this.serviceId = serviceId;
        this.userId = userId;
        this.itemAccountId = itemAccountId;
        this.profileUsername = profileUsername;
        this.durationLabel = durationLabel;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.price = price;
        this.numDevices = numDevices;
        this.totalPrice = totalPrice;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemAccountId() {
        return itemAccountId;
    }

    public void setItemAccountId(Integer itemAccountId) {
        this.itemAccountId = itemAccountId;
    }

    public String getProfileUsername() {
        return profileUsername;
    }

    public void setProfileUsername(String profileUsername) {
        this.profileUsername = profileUsername;
    }

    public String getDurationLabel() {
        return durationLabel;
    }

    public void setDurationLabel(String durationLabel) {
        this.durationLabel = durationLabel;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getNumDevices() {
        return numDevices;
    }

    public void setNumDevices(Integer numDevices) {
        this.numDevices = numDevices;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "SalesServiceAccountsDto{" +
                "serviceId=" + serviceId +
                ", userId=" + userId +
                ", itemAccountId=" + itemAccountId +
                ", profileUsername='" + profileUsername + '\'' +
                ", durationLabel='" + durationLabel + '\'' +
                ", startDate=" + startDate +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                ", numDevices=" + numDevices +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
