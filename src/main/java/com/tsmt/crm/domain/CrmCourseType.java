package com.tsmt.crm.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yyw
 */
public class CrmCourseType {

    private String courseTypeId;
    /**
     * 课程类别费用、总学时、课程类别名称、课程类别描述
     */
    private String courseCost;
    private Integer total;
    private String courseName;
    private String remark;

    /**
     * 一对多:一个课程类别对应多个班级
     */
    private Set<CrmClasses> classesSet = new HashSet<CrmClasses>();

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(String courseCost) {
        this.courseCost = courseCost;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Set<CrmClasses> getClassesSet() {
        return classesSet;
    }

    public void setClassesSet(Set<CrmClasses> classesSet) {
        this.classesSet = classesSet;
    }
}
