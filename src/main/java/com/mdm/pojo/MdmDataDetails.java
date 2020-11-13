package com.mdm.pojo;

import java.util.Date;

/**
 * @author BinQi.Dai
 */
public class MdmDataDetails {
    private Integer id;

    private Integer dataMainId;

    private String dataDetailsCode;

    private String dataDetailsName;

    private Integer createdBy;

    private Date createdDate;

    private Integer updatedBy;

    private Date updatedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDataMainId() {
        return dataMainId;
    }

    public void setDataMainId(Integer dataMainId) {
        this.dataMainId = dataMainId;
    }

    public String getDataDetailsCode() {
        return dataDetailsCode;
    }

    public void setDataDetailsCode(String dataDetailsCode) {
        this.dataDetailsCode = dataDetailsCode == null ? null : dataDetailsCode.trim();
    }

    public String getDataDetailsName() {
        return dataDetailsName;
    }

    public void setDataDetailsName(String dataDetailsName) {
        this.dataDetailsName = dataDetailsName == null ? null : dataDetailsName.trim();
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}