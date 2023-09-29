package org.example.algo_sencillo.actions;

import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.SessionMap;

import java.io.Serializable;
import java.util.Map;

@Namespaces(value = {@Namespace("/User"), @Namespace("/")})
@Getter
@Setter
public class LoginAction implements Serializable {

    private static final long serialVersionUID = -3434561352924343132L;

    private String userName;
    private String pwd;
    private SessionMap<String, Object> sessionMap;

    public void setSession(Map map) {
        sessionMap = (SessionMap<String, Object>) map;
        sessionMap.put("login", "true");
    }

    @Action(value = "login", results = {
            @Result(name = "SUCCESS", location = "/main.jsp"),
            @Result(name = "LOGIN", location = "/login.jsp")})
    public String execute() throws Exception {

        if ("admin".equals(getUserName()) && "1234".equals(getPwd())) {

//            sessionMap.put("userId", getUserName());

            return "SUCCESS";
        }

        return "LOGIN";
    }

    @Action(value = "logout", results = {
            @Result(name = "LOGIN", location = "/login.jsp")})
    public String logout() {
        System.out.println("Bye");
        return "LOGIN";
    }


}
