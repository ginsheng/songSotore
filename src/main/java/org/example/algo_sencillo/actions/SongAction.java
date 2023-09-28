package org.example.algo_sencillo.actions;

import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

@Action(value="song", results = {
        @Result(name="SUCCESS", location = "/main.jsp")
})
@Namespaces(value={@Namespace("/User"),@Namespace("/")})
@Getter
@Setter
public class SongAction {

    private String songTitle;
    private Integer songAmount;

    public String execute() throws Exception {

        if (!getSongTitle().isEmpty() && getSongAmount() > 0) {
            // TODO: persistencia
            return "SUCCESS";
        }

        return "ERROR";
    }

}
