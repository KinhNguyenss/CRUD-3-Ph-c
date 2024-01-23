/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import connect.connectDb;
import java.sql.*;
import model.taiKhoan;

/**
 *
 * @author kinhn
 */
public class taiKhoanDAO {
     public static boolean taiKhoan(taiKhoan tk) {
        Connection conn = connect.connectDb.getconnect();
        String sql = "select * from taikhoan where taikhoan = ? and matkhau = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tk.getTaiKhoan());
            pst.setString(2, tk.getMatKhau());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connect.connectDb.closeConnect(conn);
        }
        return false;
    }
}
