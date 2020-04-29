package com.tsmt.crm.dao;

import com.tsmt.crm.domain.CrmStaff;

import java.util.List;

/**
 * @author yyw
 */
public interface StaffDao {
    /**
     * 通过用户名和密码查询
     *
     * @param loginName
     * @param loginPwd
     * @return
     */
    public CrmStaff find(String loginName, String loginPwd);

    /**
     * 查询所有
     *
     * @return
     */
    public List<CrmStaff> findAll();

    /**
     * 通过Id查询
     *
     * @param staffId
     * @return
     */
    public CrmStaff findById(String staffId);
}
