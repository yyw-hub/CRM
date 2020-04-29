package com.tsmt.crm.service;

import com.tsmt.crm.domain.CrmDepartment;
import com.tsmt.crm.domain.CrmPost;

import java.util.List;

/**
 * @author yyw
 */
public interface PostService {
    /**
     * 查询指定部门的所有职务
     *
     * @param department
     * @return
     */
    public List<CrmPost> findAll(CrmDepartment department);
}
