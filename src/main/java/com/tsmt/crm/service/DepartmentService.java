package com.tsmt.crm.service;

import com.tsmt.crm.domain.CrmDepartment;

import java.util.List;

/**
 * @author yyw
 */
public interface DepartmentService {
    /**
     * 查询所有
     *
     * @return
     */
    public List<CrmDepartment> findAll();
}
