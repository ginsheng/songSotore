package org.example.nombre_tienda.service;

import jakarta.transaction.Transactional;
import org.example.nombre_tienda.data.repository.SongJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ApiService {

    @Autowired
    SongJpaRepository songJpaRepository;

    public ResponseEntity<?> enlista() {

        return ResponseEntity.ok(songJpaRepository.findAll());

    }

}
