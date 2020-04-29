package com.tsmt.crm.domain;

import java.util.Date;

/**
 * @author yyw
 */
public class CrmStaff {
    private String staffId;

    /**
     * 登录名、登录密码、员工姓名、性别、入职日期
     */
    private String loginName;
    private String loginPwd;
    private String staffName;
    private String gender;
    private Date onDutyDate;

    /**
     * 多对一:多个员工对应一个职务
     */
    private CrmPost post;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(Date onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public CrmPost getPost() {
        return post;
    }

    public void setPost(CrmPost post) {
        this.post = post;
    }
}
