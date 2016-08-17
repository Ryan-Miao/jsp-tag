package com.test.demo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by rmiao on 8/16/2016.
 */
public class StandardTag extends SimpleTagSupport {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    StringWriter sw = new StringWriter();

    public void doTag() throws JspException, IOException{
        JspWriter out = getJspContext().getOut();
        if (message!=null){
            //from filed
            out.println(message);
        }else{
            //from body
            getJspBody().invoke(sw);
            out.println(sw.toString());

        }
    }

    public static String hello(String name){
        return "Welcome: " + name;
    }

    public static boolean isHotelIn(String htid){
        return false;
    }


}
