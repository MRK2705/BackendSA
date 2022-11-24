package bo.edu.ucb.sa.StrangerAccounts.dto;

public class PlansPersonalizationDto {
    private Integer plansId;
    private Integer ServiceId;
    private Integer days;
    private float price;
    private String durationLabel;

    public PlansPersonalizationDto() {
    }
    public PlansPersonalizationDto(Integer plansId, Integer serviceId, Integer days, float price, String durationLabel) {
        this.plansId = plansId;
        ServiceId = serviceId;
        this.days = days;
        this.price = price;
        this.durationLabel = durationLabel;
    }
    public Integer getPlansId() {
        return plansId;
    }
    public void setPlansId(Integer planId) {
        this.plansId = planId;
    }
    public Integer getServiceId() {
        return ServiceId;
    }
    public void setServiceId(Integer serviceId) {
        ServiceId = serviceId;
    }
    public Integer getDays() {
        return days;
    }
    public void setDays(Integer days) {
        this.days = days;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getDurationLabel() {
        return durationLabel;
    }
    public void setDurationLabel(String durationLabel) {
        this.durationLabel = durationLabel;
    }
    @Override
    public String toString() {
        return "PlansDto{" +
                "plansId=" + plansId +
                ", ServiceId=" + ServiceId +
                ", days=" + days +
                ", price=" + price +
                ", durationLabel='" + durationLabel + '\'' +
                '}';
    }
}
