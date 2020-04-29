package com.tsmt.crm.dao.impl;

import com.tsmt.crm.dao.PostDao;
import com.tsmt.crm.domain.CrmDepartment;
import com.tsmt.crm.domain.CrmPost;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author yyw
 */
public class PostDaoImpl extends HibernateDaoSupport implements PostDao {
    @Override
    public List<CrmPost> findAll(CrmDepartment department) {
        return this.getHibernateTemplate().find("from CrmPost where department = ?", department);
    }
}
