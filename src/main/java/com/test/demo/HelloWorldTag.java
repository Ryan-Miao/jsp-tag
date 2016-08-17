package com.test.demo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by rmiao on 8/16/2016.
 */
public class HelloWorldTag extends SimpleTagSupport {

    public void doTag() throws JspException, IOException{
        JspWriter out = getJspContext().getOut();
        out.println("Hello Custom Tag!");
    }
}
