package com.tsmt.crm.dao.impl;

import com.tsmt.crm.dao.DepartmentDao;
import com.tsmt.crm.domain.CrmDepartment;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author yyw
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {
    @Override
    public List<CrmDepartment> findAll() {
        return this.getHibernateTemplate().find("from CrmDepartment");
    }
}
