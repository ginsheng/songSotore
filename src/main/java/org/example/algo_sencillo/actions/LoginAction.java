package org.example.algo_sencillo.actions;

import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.convention.annotation.*;

@Action(value = "login", results = {
        @Result(name = "SUCCESS", location = "/main.jsp"),
        @Result(name = "ERROR", location = "/error.jsp") })
@Namespaces(value={@Namespace("/User"),@Namespace("/")})
//@InterceptorRefs(@InterceptorRef(value="defaultStack", params = {"scp.disabled", "true"}))
@Getter
@Setter
public class LoginAction {

    private String userName;
    private String pwd;

    public String execute() throws Exception {
        if("admin".equals(getUserName()) && "1234".equals(getPwd())) {
            return "SUCCESS";
        }

        return "ERROR";
    }

}
