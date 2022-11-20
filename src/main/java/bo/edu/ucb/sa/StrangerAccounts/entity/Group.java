package bo.edu.ucb.sa.StrangerAccounts.entity;
import java.util.Date;

public class Group {
    private Integer groupId;
    private String groupName;
    private String description;
    private Boolean status;
    private String txUsername;
    private String txHost;
    private Date txDate;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
   public String toString(){
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", txUsername='" + txUsername + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }

   }

