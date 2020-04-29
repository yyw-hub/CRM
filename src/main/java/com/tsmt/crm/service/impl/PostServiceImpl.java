package com.tsmt.crm.service.impl;

import com.tsmt.crm.dao.PostDao;
import com.tsmt.crm.domain.CrmDepartment;
import com.tsmt.crm.domain.CrmPost;
import com.tsmt.crm.service.PostService;

import java.util.List;

/**
 * @author yyw
 */
public class PostServiceImpl implements PostService {
    private PostDao postDao;

    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public List<CrmPost> findAll(CrmDepartment department) {
        return postDao.findAll(department);
    }
}
