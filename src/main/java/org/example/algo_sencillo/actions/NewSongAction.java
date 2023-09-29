package org.example.algo_sencillo.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action(value="newSong", results = {
        @Result(name="SUCCESS", location = "/new_song.jsp")
})
public class NewSongAction {

    public String execute() throws Exception {
        return "SUCCESS";
    }

}
