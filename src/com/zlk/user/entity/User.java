package com.zlk.user.entity;

import java.util.Date;

/**
 * @program: ssm
 * @description: 用户实体类
 * @author: lth
 * @create: 2019-09-11 10:00
 **/
public class User {
   /* uid VARCHAR(32) PRIMARY KEY COMMENT '用户的id',
    NAME VARCHAR(20) COMMENT '用户的姓名',
    pwd VARCHAR(32) COMMENT '用户的密码',
    phone VARCHAR(11) COMMENT '用户的电话',
    create_time DATETIME COMMENT '用户的创建时间',
    update_time DATETIME COMMENT '修改时间'*/

   /**ID*/
   private String uid;
   /**姓名*/
   private String name;
   /**密码*/
   private String pwd;
   /**电话*/
   private String phone;
   /**创建时间*/
   private Date createTime;
   /**修改时间*/
   private Date updateTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public User() {
    }

    public User(String uid, String name, String pwd, String phone, Date createTime, Date updateTime) {
        this.uid = uid;
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
