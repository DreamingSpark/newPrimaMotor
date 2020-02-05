/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
public class koneksi {
    private Connection koneksi;
    public Connection getKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            
        }
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/dbprimamotorsidomulyo","root","");
            if (koneksi != null) {
                System.out.println("Koneksi Berhasil");
            }
        } catch (SQLException ex) {
            System.out.println("Koneksi Gagal");
        }
        return koneksi;
    }
}
