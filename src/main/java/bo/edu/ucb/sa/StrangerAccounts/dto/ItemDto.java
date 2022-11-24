package bo.edu.ucb.sa.StrangerAccounts.dto;

public class ItemDto {
    private Integer ItemId;
    private String ArticleConcept;
    private String GamePrice;
    private float Price;
    private String Picture;

    public ItemDto() {
    }

    public ItemDto(Integer itemId, String articleConcept, String gamePrice, float price, String picture) {
        this.ItemId = itemId;
        this.ArticleConcept = articleConcept;
        this.GamePrice = gamePrice;
        this.Price = price;
        this.Picture = picture;
    }

    public Integer getItemId() {
        return ItemId;
    }
    public void setItemId(Integer itemId) {
        ItemId = itemId;
    }
    public String getArticleConcept() {
        return ArticleConcept;
    }

    public void setArticleConcept(String articleConcept) {
        ArticleConcept = articleConcept;
    }

    public String getGamePrice() {
        return GamePrice;
    }

    public void setGamePrice(String gamePrice) {
        GamePrice = gamePrice;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "ItemId='" + ItemId + '\'' +
                ",ArticleConcept='" + ArticleConcept + '\'' +
                ", GamePrice='" + GamePrice + '\'' +
                ", Price=" + Price +
                ", Picture='" + Picture + '\'' +
                '}';
    }
}
