package com.tsmt.crm.dao;

import com.tsmt.crm.domain.CrmDepartment;

import java.util.List;

/**
 * @author yyw
 */
public interface DepartmentDao {
    /**
     * 查询所有部门
     * @return
     */
    public List<CrmDepartment> findAll();
}
