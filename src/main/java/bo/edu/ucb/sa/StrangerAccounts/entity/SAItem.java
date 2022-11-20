package bo.edu.ucb.sa.StrangerAccounts.entity;

import java.util.Date;

public class SAItem {
    private Integer ItemId;
    private String ArticleConcept;
    private String GamePrice;
    private float Price;
    private String Picture;
    private Boolean Status;
    private String txUsername;
    private String txHost;
    private Date txDate;

    public SAItem() {
    }

    public SAItem(Integer ItemId, String ArticleConcept, String GamePrice, float Price, String Picture, Boolean status,String txUsername, String txHost, Date txDate) {
        this.ItemId = ItemId;
        this.ArticleConcept = ArticleConcept;
        this.GamePrice = GamePrice;
        this.Price = Price;
        this.Picture = Picture;
        this.Status = status;
        this.txUsername = txUsername;
        this.txHost = txHost;
        this.txDate = txDate;
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

    public String getPicture() {return Picture;}

    public void setPicture(String picture) {Picture = picture;}

    public Boolean getStatus() {return Status;}

    public void setStatus(Boolean status) {Status = status;}

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
        return "SAItem{" +
                "ItemId=" + ItemId +
                ", ArticleConcept='" + ArticleConcept + '\'' +
                ", GamePrice='" + GamePrice + '\'' +
                ", Price=" + Price +
                ", Picture='" + Picture + '\'' +
                ", Status='" + Status + '\'' +
                ", txUsername='" + txUsername + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
