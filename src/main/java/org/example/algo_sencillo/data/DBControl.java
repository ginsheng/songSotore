package org.example.algo_sencillo.data;

import java.sql.*;

public class DBControl {



    Connection connect() {
        Connection conn = null;

        try {
            String url = "jdbc:sqlite:file:nombre_tienda.db";

            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLIte has been established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {

                    String sql = "CREATE TABLE IF NOT EXISTS songs ("
                            + "	id integer PRIMARY KEY,"
                            + "	songTitle text NOT NULL,"
                            + "	songAmount integer NOT NULL"
                            + ");";

                    DatabaseMetaData meta = conn.getMetaData();
                    System.out.println("Driver name is " + meta.getDriverName());

                    try (Statement stmt = conn.createStatement()) {
                        stmt.execute(sql);
                    }

                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

}
