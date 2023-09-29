package org.example.nombre_tienda.controller;

import org.example.nombre_tienda.service.ApiService;
import org.example.nombre_tienda.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
@RequestMapping("/api")
public class BackEndController {

    @Autowired
    ApiService apiService;

    @GetMapping(value = "/songs")
//    public ResponseEntity<?> enlista(@RequestParam("access") UUID id) {
    public ResponseEntity<?> enlista() {

        /**
         * Sólo te acepto con este id: 96fe8e23-2d6c-4778-ac22-e985b6192dfe
         */

//        if (null == id || !id.equals(UUID.fromString("96fe8e23-2d6c-4778-ac22-e985b6192dfe"))) {
//            return ResponseEntity.noContent().build();
//        }

        return apiService.enlista();

    }

}
