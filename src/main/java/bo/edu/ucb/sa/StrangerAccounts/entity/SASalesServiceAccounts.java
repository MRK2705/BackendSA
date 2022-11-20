package bo.edu.ucb.sa.StrangerAccounts.entity;

import java.util.Date;
public class SASalesServiceAccounts {
    private Integer salesServiceAccountId;
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
    private Boolean status;
    private String txUsername;
    private String txHost;
    private Date txDate;

    public SASalesServiceAccounts() {
    }

    public SASalesServiceAccounts(Integer salesServiceAccountId, Integer serviceId, Integer userId, Integer itemAccountId, String profileUsername, String durationLabel, Date startDate, Date expirationDate, float price, Integer numDevices, float totalPrice, Boolean status, String txUsername, String txHost, Date txDate) {
        this.salesServiceAccountId = salesServiceAccountId;
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
        this.status = status;
        this.txUsername = txUsername;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Integer getSalesServiceAccountId() {
        return salesServiceAccountId;
    }

    public void setSalesServiceAccountId(Integer salesServiceAccountId) {
        this.salesServiceAccountId = salesServiceAccountId;
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
        return "SASalesServiceAccounts{" +
                "salesServiceAccountId=" + salesServiceAccountId +
                ", serviceId=" + serviceId +
                ", userId=" + userId +
                ", itemAccountId=" + itemAccountId +
                ", profileUsername='" + profileUsername + '\'' +
                ", durationLabel='" + durationLabel + '\'' +
                ", startDate=" + startDate +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                ", numDevices=" + numDevices +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", txUsername='" + txUsername + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
