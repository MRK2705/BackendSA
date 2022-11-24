package bo.edu.ucb.sa.StrangerAccounts.entity;

public class Plans {
    private Integer planId;
    private String planName;
    private String planDescription;
    private Integer planDuration;
    private Integer planPrice;
    private Integer planNumDevices;
    private Integer planStatus;
    private String txUsername;
    private String txHost;
    private String txDate;

    public Plans() {
    }

    public Plans(Integer planId, String planName, String planDescription, Integer planDuration, Integer planPrice, Integer planNumDevices, Integer planStatus, String txUsername, String txHost, String txDate) {
        this.planId = planId;
        this.planName = planName;
        this.planDescription = planDescription;
        this.planDuration = planDuration;
        this.planPrice = planPrice;
        this.planNumDevices = planNumDevices;
        this.planStatus = planStatus;
        this.txUsername = txUsername;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public Integer getPlanDuration() {
        return planDuration;
    }

    public void setPlanDuration(Integer planDuration) {
        this.planDuration = planDuration;
    }

    public Integer getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(Integer planPrice) {
        this.planPrice = planPrice;
    }

    public Integer getPlanNumDevices() {
        return planNumDevices;
    }

    public void setPlanNumDevices(Integer planNumDevices) {
        this.planNumDevices = planNumDevices;
    }

    public Integer getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(Integer planStatus) {
        this.planStatus = planStatus;
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

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }
    @Override
    public String toString() {
        return "Plans{" +
                "planId=" + planId +
                ", planName='" + planName + '\'' +
                ", planDescription='" + planDescription + '\'' +
                ", planDuration=" + planDuration +
                ", planPrice=" + planPrice +
                ", planNumDevices=" + planNumDevices +
                ", planStatus=" + planStatus +
                ", txUsername='" + txUsername + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate='" + txDate + '\'' +
                '}';
    }
}
