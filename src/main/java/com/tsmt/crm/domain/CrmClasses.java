package com.tsmt.crm.domain;

import java.util.Date;

/**
 * @author yyw
 */
public class CrmClasses {

    private String classesId;
    /**
     * 课程名
     */
    private String name;
    /**
     * 开课时间
     */
    private Date beginTime;
    /**
     * 结业时间
     */
    private Date endTime;
    /**
     * 状态
     */
    private String status;
    /**
     * 总人数
     */
    private Integer totalCount;
    /**
     * 升级数
     */
    private Integer upgradeCount;
    /**
     * 转班数
     */
    private Integer changeCount;
    /**
     * 流失数
     */
    private Integer runoffCount;
    /**
     * 描述
     */
    private String remark;
    /**
     * 上传时间
     */
    private Date uploadTime;
    /**
     * 上传课表路径
     */
    private String uploadPath;
    /**
     * 上传课表名称
     */
    private String uploadFilename;

    /**
     * 多对一:多个班级对应一个课程类别
     */
    private CrmCourseType courseType;

    public String getClassesId() {
        return classesId;
    }

    public void setClassesId(String classesId) {
        this.classesId = classesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUpgradeCount() {
        return upgradeCount;
    }

    public void setUpgradeCount(Integer upgradeCount) {
        this.upgradeCount = upgradeCount;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public Integer getRunoffCount() {
        return runoffCount;
    }

    public void setRunoffCount(Integer runoffCount) {
        this.runoffCount = runoffCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getUploadFilename() {
        return uploadFilename;
    }

    public void setUploadFilename(String uploadFilename) {
        this.uploadFilename = uploadFilename;
    }

    public CrmCourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CrmCourseType courseType) {
        this.courseType = courseType;
    }
}
