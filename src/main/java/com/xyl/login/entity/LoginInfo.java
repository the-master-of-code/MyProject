package com.xyl.login.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * 账号密码表(LoginInfo)实体类
 *
 * @author makejava
 * @since 2020-11-12 18:29:04
 */
//@JsonIgnoreProperties(value= {"handler"})
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LoginInfo implements Serializable {
    private static final long serialVersionUID = -58666914579505863L;
    /**
    * 账号
    */
    private String id;
    /**
    * 昵称
    */
    private String name;
    /**
    * 密码
    */
    private String password;
    /**
    * 备用
    */
    private String spare1;
    /**
    * 备用
    */
    private String spare2;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }

    public void addAttribute(String name, LoginInfo loginInfo) {
        loginInfo.setName(name);
    }

    public LoginInfo(String id, String name, String password, String spare1, String spare2) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.spare1 = spare1;
        this.spare2 = spare2;
    }

    public LoginInfo() {
    }
}