package com.tsmt.crm.web.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * @author yyw
 */
public class LoginInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        /**
         * 判断session作用域是否有用户信息,如果有放行,反之拦截
         */
        Object obj = ActionContext.getContext().getSession().get("loginStaff");
        if (obj == null) {
            // 获得当前运行的action
            Object action = actionInvocation.getAction();
            // 判断运行时是否是ActionSupport
            if (action instanceof ActionSupport) {
                ActionSupport actionSupport = (ActionSupport) action;
                actionSupport.addFieldError("", "请登录");
            }

            // 需要登录
            return "login";
        }
        // 已登录,放行
        return actionInvocation.invoke();
    }
}
