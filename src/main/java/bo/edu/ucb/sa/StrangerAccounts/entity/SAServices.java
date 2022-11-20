package bo.edu.ucb.sa.StrangerAccounts.entity;

public class SAServices {
    private String PlatformName;
    private String Picture;
    private String ServiceType;

    private Boolean Status;
    private float Price;
    private String DurationLabel;

    public SAServices() {
    }

    public SAServices(String platformName, String picture, String serviceType, Boolean status,float price, String durationLabel) {
        this.PlatformName = platformName;
        this.Picture = picture;
        this.ServiceType = serviceType;
        this.Status = status;
        this.Price = price;
        this.DurationLabel = durationLabel;
    }

    public String getPlatformName() { return PlatformName;}

    public void setPlatformName(String platformName) {
        PlatformName = platformName;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {Status = status;}

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getDurationLabel() {
        return DurationLabel;
    }

    public void setDurationLabel(String durationLabel) {
        DurationLabel = durationLabel;
    }

    @Override
    public String toString() {
        return "SAServices{" +
                "PlatformName='" + PlatformName + '\'' +
                ", Picture='" + Picture + '\'' +
                ", ServiceType='" + ServiceType + '\'' +
                ", Status='" + Status + '\'' +
                ", Price=" + Price +
                ", DurationLabel='" + DurationLabel + '\'' +
                '}';
    }
}
