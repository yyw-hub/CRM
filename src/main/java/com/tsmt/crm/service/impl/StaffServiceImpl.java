package com.tsmt.crm.service.impl;

import com.tsmt.crm.dao.StaffDao;
import com.tsmt.crm.domain.CrmStaff;
import com.tsmt.crm.service.StaffService;
import com.tsmt.crm.utils.MyStringUtils;

import java.util.List;

/**
 * @author yyw
 */
public class StaffServiceImpl implements StaffService {

    private StaffDao staffDao;

    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public CrmStaff login(CrmStaff crmStaff) {
        // MD5加密密码
        String loginPwd = MyStringUtils.getMD5Value(crmStaff.getLoginPwd());
        return staffDao.find(crmStaff.getLoginName(), loginPwd);
    }

    @Override
    public List<CrmStaff> findAllStaff() {
        return this.staffDao.findAll();
    }

    @Override
    public CrmStaff findById(String staffId) {
        return this.staffDao.findById(staffId);
    }

    @Override
    public void updateStaff(CrmStaff crmStaff) {
        CrmStaff findStaff = staffDao.findById(crmStaff.getStaffId());
        if(!findStaff.getLoginPwd().equals(crmStaff.getLoginPwd())){
            findStaff.setLoginPwd(MyStringUtils.getMD5Value(crmStaff.getLoginPwd()));
        }
        findStaff.setLoginName(crmStaff.getLoginName());
        findStaff.setStaffName(crmStaff.getStaffName());
        findStaff.setGender(crmStaff.getGender());
        findStaff.setOnDutyDate(crmStaff.getOnDutyDate());
        findStaff.setPost(crmStaff.getPost());
    }
}
