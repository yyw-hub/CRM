package com.tsmt.crm.service.impl;

import com.tsmt.crm.dao.DepartmentDao;
import com.tsmt.crm.domain.CrmDepartment;
import com.tsmt.crm.service.DepartmentService;

import java.util.List;

/**
 * @author yyw
 */
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentDao departmentDao;

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<CrmDepartment> findAll() {
        return this.departmentDao.findAll();
    }
}
