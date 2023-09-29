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

@Namespaces(value={@Namespace("/User"),@Namespace("/")})
@Getter
@Setter
public class SongAction {

    private String songTitle;
    private Integer songAmount;
    private Integer id;
    private String mensajillo;
    List<SongBean> songList = null;

    @Action(value="song", results = {
            @Result(name="SUCCESS", location = "/inventory.jsp")
    })
    public String execute() throws Exception {

        if (null != getSongTitle() && !getSongTitle().isEmpty() && getSongAmount() > 0) {

            SongsDAO songsDAO = new SongsDAO();

            songsDAO.insert(getSongTitle(), getSongAmount());

            mensajillo = "Registro creado exitosamente";
            songList = songsDAO.selectAll();

            return "SUCCESS";
        }

        return "ERROR";
    }

    @Action(value="deleteSong", results = {
            @Result(name="SUCCESS", location = "/inventory.jsp")
    })
    public String delete() throws Exception {

        SongsDAO songsDAO = new SongsDAO();

        songsDAO.delete(id);

        mensajillo = "Registro eliminado";
        songList = songsDAO.selectAll();

        return "SUCCESS";
    }

}
