package com.tsmt.crm.service.impl;

import com.tsmt.crm.dao.CourseTypeDao;
import com.tsmt.crm.domain.CrmCourseType;
import com.tsmt.crm.service.CourseTypeService;

import java.util.List;

/**
 * @author yyw
 */
public class CourseTypeServiceImpl implements CourseTypeService {
    private CourseTypeDao courseTypeDao;

    public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
        this.courseTypeDao = courseTypeDao;
    }

    @Override
    public List<CrmCourseType> findAll() {
        return courseTypeDao.findAll();
    }
}
