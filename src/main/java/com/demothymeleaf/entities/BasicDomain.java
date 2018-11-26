package com.demothymeleaf.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class BasicDomain implements Serializable {

    protected Long id;
    // 创建数据的时间
    protected Date createdDate = new Date();
    // 最后修改数据的时间
    protected Date lastModifiedDate = new Date();
    protected int version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public BasicDomain(Long id, Date createdDate, Date lastModifiedDate, int version) {
        this.id = id;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.version = version;
    }

    public BasicDomain() {
    }


}
