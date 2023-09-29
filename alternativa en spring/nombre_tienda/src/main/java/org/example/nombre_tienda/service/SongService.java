package org.example.nombre_tienda.service;

import jakarta.transaction.Transactional;
import org.example.nombre_tienda.Model.SongModel;
import org.example.nombre_tienda.data.entity.SongEntity;
import org.example.nombre_tienda.data.repository.SongJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SongService {

    @Autowired
    SongJpaRepository songJpaRepository;
    @Autowired
    ModelMapper modelMapper;

    public void guarda(SongModel songModel) {

        SongEntity songEntity = new SongEntity();

        modelMapper.map(songModel, songEntity);

        songJpaRepository.save(songEntity);

    }

    public List<SongModel> lista() {

        return songJpaRepository.findAll().stream().map(this::convertToModel).collect(Collectors.toList());


    }

    public void borra(Integer id) {

        songJpaRepository.deleteById(id);

    }

    private SongModel convertToModel(SongEntity songEntity) {
        return modelMapper.map(songEntity, SongModel.class);
    }

}
