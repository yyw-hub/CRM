package com.tsmt.crm.dao.impl;

import com.tsmt.crm.dao.CourseTypeDao;
import com.tsmt.crm.domain.CrmCourseType;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author yyw
 */
public class CourseTypeDaoImpl extends HibernateDaoSupport implements CourseTypeDao {
    @Override
    public List<CrmCourseType> findAll() {
        return this.getHibernateTemplate().find("from CrmCourseType");
    }


}
