//package org.example.algo_sencillo.rest.controllers;
//
//import org.example.algo_sencillo.data.SongBean;
//import org.example.algo_sencillo.data.SongsDAO;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//public class SongController {
//
//    @RequestMapping(value = "/songs", method = RequestMethod.GET)
//    @ResponseBody public List<SongBean> listSongs() {
//        SongsDAO songsDAO = new SongsDAO();
//
//        return songsDAO.selectAll();
//    }
//
//
//}
