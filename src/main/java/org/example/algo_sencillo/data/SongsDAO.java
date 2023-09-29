package org.example.algo_sencillo.data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SongsDAO {

    private final String registra = "INSERT INTO songs(songTitle, songAmount) VALUES(?,?)";
    private final String consulta = "SELECT id, songTitle, songAmount FROM songs";
    private final String elimina = "DELETE FROM songs WHERE id = ?";

    private DBControl dbControl;

    public void insert(String songTitle, Integer songAmount) {

        dbControl = new DBControl();

        try (Connection conn = dbControl.connect();
             PreparedStatement pstmt = conn.prepareStatement(registra)) {

            pstmt.setString(1, songTitle);
            pstmt.setInt(2, songAmount);

            pstmt.executeUpdate();
            System.out.println("New song successfully inserted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public List<SongBean> selectAll() {

        dbControl = new DBControl();

        List<SongBean> resultado = new ArrayList<>();
        try (Connection conn = dbControl.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while(rs.next()) {
                SongBean songBean = new SongBean();
                songBean.setId(rs.getInt("id"));
                songBean.setSongTitle(rs.getString("songTitle"));
                songBean.setSongAmount(rs.getInt("songAmount"));

                resultado.add(songBean);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return resultado;

    }

    public void delete(Integer id) {

        dbControl = new DBControl();

        try (Connection conn = dbControl.connect();
             PreparedStatement pstmt = conn.prepareStatement(elimina)) {

            pstmt.setInt(1, id);

            pstmt.executeUpdate();
            System.out.println("Song successfully deleted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
