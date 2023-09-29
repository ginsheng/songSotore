package org.example.nombre_tienda.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SongModel {

    private Integer id;
    private String songTitle;
    private Integer songAmount;

}
