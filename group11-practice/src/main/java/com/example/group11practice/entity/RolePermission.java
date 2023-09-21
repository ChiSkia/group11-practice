package com.example.group11practice.entity;

import com.example.group11practice.utils.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@DynamicUpdate
@DynamicInsert
@Data
@Table(name = "RolePermission")
public class RolePermission implements BaseEntity<Long>, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long roleId;

    private Long permissionId;

    private Boolean deleted;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private String remark;

}
