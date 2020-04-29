package com.tsmt.crm.dao;

import com.tsmt.crm.domain.CrmDepartment;
import com.tsmt.crm.domain.CrmPost;
import com.tsmt.crm.domain.CrmStaff;

import java.util.List;

/**
 * @author yyw
 */
public interface PostDao {
    /**
     * 查询指定部门的所有职务
     *
     * @return
     */
    public List<CrmPost> findAll(CrmDepartment department);
}
