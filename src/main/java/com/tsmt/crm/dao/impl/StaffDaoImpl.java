package com.tsmt.crm.dao.impl;

import com.tsmt.crm.dao.StaffDao;
import com.tsmt.crm.domain.CrmStaff;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author yyw
 */
public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {

    @Override
    public CrmStaff find(String loginName, String loginPwd) {
        List<CrmStaff> allStaff = this.getHibernateTemplate().find("from CrmStaff where loginName = ? and loginPwd = ?", loginName, loginPwd);
        if (allStaff.size() == 1) {
            return allStaff.get(0);
        }
        return null;
    }

    @Override
    public List<CrmStaff> findAll() {
        return this.getHibernateTemplate().find("from CrmStaff");
    }

    @Override
    public CrmStaff findById(String staffId) {
        return this.getHibernateTemplate().get(CrmStaff.class, staffId);
    }
}
