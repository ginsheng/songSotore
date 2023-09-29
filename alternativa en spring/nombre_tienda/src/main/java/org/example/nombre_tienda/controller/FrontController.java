package org.example.nombre_tienda.controller;

import org.apache.tomcat.util.http.parser.Authorization;
import org.example.nombre_tienda.Model.SongModel;
import org.example.nombre_tienda.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;

@Controller
@RequestMapping(value = "/song")

public class FrontController {

    @Autowired
    SongService songService;

    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public RedirectView formReceive(@ModelAttribute("song") SongModel songModel, RedirectAttributes attributes) {

        songService.guarda(songModel);
        attributes.addFlashAttribute("resultado", "Canción agregada");
//        model.addAttribute("songList", songService.lista());


        return new RedirectView("/song/inventario", true);
    }

    @GetMapping(value = "/nueva")
    @PreAuthorize("hasRole('USER')")
    public String formulario(Model model) {

        model.addAttribute("song", new SongModel());

        return "formulario";
    }

    @GetMapping(value = "/inventario")
    @PreAuthorize("hasRole('USER')")
    public String enlista(Model model) {

        model.addAttribute("songList", songService.lista());

        return "inventario";

    }

    @GetMapping(value = "/eliminar")
    public RedirectView elimina(@RequestParam("id") Integer id, RedirectAttributes attributes) {

        songService.borra(id);

        attributes.addFlashAttribute("resultado", "Canción eliminada");

        return new RedirectView("/song/inventario", true);

    }

}
