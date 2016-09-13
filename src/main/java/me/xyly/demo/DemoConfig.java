package me.xyly.demo;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;

/**
 * Created by hnair20160706 on 2016/9/13.
 */
public class DemoConfig extends JFinalConfig{

    @Override
    public void configConstant(Constants me) {
        me.setViewType(ViewType.JSP);
        me.setBaseViewPath("/");
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/",IndexController.class);
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
