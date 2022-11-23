package bo.edu.ucb.sa.StrangerAccounts.entity;

public class SAServices {

    private Integer ServiceId;
    private String PlatformName;
    private String Picture;
    private String ServiceType;
    private String DurationLabel;

    public SAServices() {
    }

    public SAServices(Integer serviceId, String platformName, String picture, String serviceType, String durationLabel) {
        this.ServiceId = serviceId;
        this.PlatformName = platformName;
        this.Picture = picture;
        this.ServiceType = serviceType;
        this.DurationLabel = durationLabel;
    }

    public Integer getServiceId() { return ServiceId;}
    public void setServiceId(Integer serviceId) {
        ServiceId = serviceId;
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

    //public float getPrice() {
        //return Price;
    //}

    //public void setPrice(float price) {
        //Price = price;
    //}

    public String getDurationLabel() {
        return DurationLabel;
    }

    public void setDurationLabel(String durationLabel) {
        DurationLabel = durationLabel;
    }

    @Override
    public String toString() {
        return "SAServices{" +
                //"ServiceId='" + ServiceId + '\'' +
                "PlatformName='" + PlatformName + '\'' +
                ", Picture='" + Picture + '\'' +
                ", ServiceType='" + ServiceType + '\'' +
                //", Price=" + Price +
                ", DurationLabel='" + DurationLabel + '\'' +
                '}';
    }
}
