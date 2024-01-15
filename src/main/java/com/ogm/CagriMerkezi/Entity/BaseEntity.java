package com.ogm.CagriMerkezi.Entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;
@MappedSuperclass
//bütün tabloların ortak olmasını sağlamak için anatasyonu kullandık.
@Getter
@Setter
@ToString
public class BaseEntity implements Serializable {
    private Date createdDate;
    private String createdBy;
    private Date updatedAt;
    private Date updatedBy;

}
