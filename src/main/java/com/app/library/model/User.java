package com.app.library.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "us_id")
    private int userID;

    @Column(name = "us_name")
    private String username;

    @Column(name = "us_password")
    private String password;
    @Column(name = "us_fullname")
    private String fullname;
    @Column(name = "us_address")
    private String address;
    @Column(name = "us_create_date")
    private Date createDate;
    @Column(name = "us_update_password")
    private int updatePassword;
    @Column(name = "us_mobile")
    private String mobile;
    @Column(name = "us_status")
    private int status;
    @Column(name = "us_group")
    private int group;
    @Column(name = "us_email")
    private String email;

    public User(String username, String password, String fullname, String address, Date createDate, int updatePassword,
            String mobile, int status, int group, String email) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.address = address;
        this.createDate = createDate;
        this.updatePassword = updatePassword;
        this.mobile = mobile;
        this.status = status;
        this.group = group;
        this.email = email;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getUpdatePassword() {
        return updatePassword;
    }

    public void setUpdatePassword(int updatePassword) {
        this.updatePassword = updatePassword;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", createDate=" + createDate +
                ", updatePassword=" + updatePassword +
                ", mobile='" + mobile + '\'' +
                ", status=" + status +
                ", group=" + group +
                ", email='" + email + '\'' +
                '}';
    }
}
