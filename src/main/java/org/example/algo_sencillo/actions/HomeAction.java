package org.example.algo_sencillo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@Namespaces(value = {@Namespace("/User"), @Namespace("/")})
@Result(location = "/login.jsp")
@Actions(value = {@Action(""), @Action("home")})
public class HomeAction extends ActionSupport {
}
