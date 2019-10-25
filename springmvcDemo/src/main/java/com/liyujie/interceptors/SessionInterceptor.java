package com.liyujie.interceptors;
import com.liyujie.pojo.UserInterceptor;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
会话拦截器
 */
public class SessionInterceptor implements HandlerInterceptor {
    //记录日志
    private static final Logger LOGGER=Logger.getLogger(SessionInterceptor.class);
    //检查当前会话里是否有user，有就方形，否则不放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("SESSION_USER");
        if (user==null){
            LOGGER.warn("您不具备权限，请先登录");
            return false;
        }
         if(user instanceof UserInterceptor){
//            再去数据库检查其身份对不对，冻结了。

            //如果身份正确，就把密码抹为空，保护。
            UserInterceptor userInterceptor=(UserInterceptor) user;
            userInterceptor.setPassword(null);
            request.getSession().setAttribute("SESSION_USER",userInterceptor);
                LOGGER.info(userInterceptor.getUsername()+"处于登录状态,可以执行操作！");
                return true;
        }
        else {
            LOGGER.warn("请不要搞事，请先登录。");
            return false;
        }
    }
}
