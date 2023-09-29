package org.example.nombre_tienda.data.repository;


import org.example.nombre_tienda.data.entity.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongJpaRepository extends JpaRepository<SongEntity, Integer> {


}
