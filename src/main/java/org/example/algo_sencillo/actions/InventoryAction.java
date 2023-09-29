package org.example.algo_sencillo.actions;

import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.example.algo_sencillo.data.DBControl;
import org.example.algo_sencillo.data.SongBean;
import org.example.algo_sencillo.data.SongsDAO;

import java.util.List;

@Action(value = "inventory", results = {
        @Result(name = "SUCCESS", location = "/inventory.jsp")
})
@Namespaces(value = @Namespace("/"))
@Getter
@Setter
public class InventoryAction {

    List<SongBean> songList = null;

    public String execute() throws Exception {

        SongsDAO songsDAO = new SongsDAO();

        songList = songsDAO.selectAll();

        return "SUCCESS";

    }

}
