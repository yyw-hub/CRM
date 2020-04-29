package com.tsmt.crm.service;

import com.tsmt.crm.domain.CrmStaff;

import java.util.List;

/**
 * @author yyw
 */
public interface StaffService {
    /**
     * 登录
     *
     * @param crmStaff
     * @return
     */
    public CrmStaff login(CrmStaff crmStaff);

    /**
     * 查询所有员工
     *
     * @return
     */
    public List<CrmStaff> findAllStaff();

    /**
     * 通过id查询
     *
     * @param staffId
     * @return
     */
    public CrmStaff findById(String staffId);

    public void updateStaff(CrmStaff crmStaff);
}
