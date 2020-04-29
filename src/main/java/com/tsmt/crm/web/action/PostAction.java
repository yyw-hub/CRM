package com.tsmt.crm.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tsmt.crm.domain.CrmPost;
import com.tsmt.crm.service.PostService;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;

import java.io.IOException;
import java.util.List;

/**
 * @author yyw
 */
public class PostAction extends ActionSupport implements ModelDriven<CrmPost> {
    /**
     * 封装数据
     */
    private CrmPost crmPost = new CrmPost();

    @Override
    public CrmPost getModel() {
        return crmPost;
    }

    /**
     * service
     */
    private PostService postService;

    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    /**
     * 通过部门查询所有的职务
     *
     * @return
     */
    public String findAllWithDepartment() throws IOException {
        // 查询所有
        List<CrmPost> allPost = this.postService.findAll(crmPost.getDepartment());
        // 排除不需要数据
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.setExcludes(new String[]{"department", "staffSet"});
        // 将Java对象转换成json数据
        String jsonData = JSONArray.fromObject(allPost, jsonConfig).toString();
        // 响应中文乱码
        ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");

        // 将json数据发送给浏览器
        ServletActionContext.getResponse().getWriter().print(jsonData);

        return "none";
    }
}
