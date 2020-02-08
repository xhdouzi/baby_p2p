package src;


public class TAccountFlow {

  private long id;
  private String accountId;
  private long amount;
  private long flowType;
  private long availableAmount;
  private long freezeAmount;
  private String remark;
  private java.sql.Timestamp createTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }


  public long getFlowType() {
    return flowType;
  }

  public void setFlowType(long flowType) {
    this.flowType = flowType;
  }


  public long getAvailableAmount() {
    return availableAmount;
  }

  public void setAvailableAmount(long availableAmount) {
    this.availableAmount = availableAmount;
  }


  public long getFreezeAmount() {
    return freezeAmount;
  }

  public void setFreezeAmount(long freezeAmount) {
    this.freezeAmount = freezeAmount;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
