package com.tsmt.crm.dao;

import com.tsmt.crm.domain.CrmCourseType;

import java.util.List;

/**
 * @author yyw
 */
public interface CourseTypeDao {
    /**
     * 查询所有
     *
     * @return
     */
    public List<CrmCourseType> findAll();
}
