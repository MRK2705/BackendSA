package bo.edu.ucb.sa.StrangerAccounts.dto;

public class PlansPersonalizationDto {
    private Integer planId;
    private Integer ServiceId;
    private Integer days;
    private float price;

    public PlansPersonalizationDto() {
    }
    public PlansPersonalizationDto(Integer planId, Integer serviceId, Integer days, float price) {
        this.planId = planId;
        ServiceId = serviceId;
        this.days = days;
        this.price = price;
    }
    public Integer getPlanId() {
        return planId;
    }
    public void setPlanId(Integer planId) {
        this.planId = planId;
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
    @Override
    public String toString() {
        return "PlansDto{" +
                "planId=" + planId +
                ", ServiceId=" + ServiceId +
                ", days=" + days +
                ", price=" + price +
                '}';
    }
}
