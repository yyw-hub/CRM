package com.tsmt.crm.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tsmt.crm.domain.CrmCourseType;
import com.tsmt.crm.service.CourseTypeService;

import java.util.List;

/**
 * @author yyw
 */
public class CourseTypeAction extends ActionSupport implements ModelDriven<CrmCourseType> {
    /**
     * 封装数据
     *
     * @return
     */
    private CrmCourseType courseType = new CrmCourseType();

    @Override
    public CrmCourseType getModel() {
        return courseType;
    }

    /**
     * service
     */
    private CourseTypeService courseTypeService;

    public void setCourseTypeService(CourseTypeService courseTypeService) {
        this.courseTypeService = courseTypeService;
    }

    /**
     * 查询所有
     */
    public String findAll() {
        // 简单查询
        List<CrmCourseType> allCourseType = this.courseTypeService.findAll();
        // 查询结果存在值栈
        ActionContext.getContext().put("allCourseType", allCourseType);

        return "findAll";
    }
}
