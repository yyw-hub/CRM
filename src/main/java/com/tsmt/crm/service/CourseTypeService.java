package com.tsmt.crm.service;

import com.tsmt.crm.domain.CrmCourseType;

import java.util.List;

/**
 * @author yyw
 */
public interface CourseTypeService {
    /**
     * 查询所有
     *
     * @return
     */
    public List<CrmCourseType> findAll();
}
