package me.xyly.demo;

import com.jfinal.core.Controller;

/**
 * Created by hnair20160706 on 2016/9/13.
 */
public class IndexController extends Controller {
    public void index(){
        render("index.jsp");
    }
}
