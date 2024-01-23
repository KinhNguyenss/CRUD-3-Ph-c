package DAO;

import java.util.ArrayList;
import java.sql.*;
import connect.connectDb;
import model.sach;

public class functionDAO {

    public static boolean insert(sach t) {
        Connection con = connectDb.getconnect();
        String sql = "insert into sach (masach,tenSach,nguoiMuon,ngayMuon,ngayHenTra) "
                + "values(?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaSach());
            pst.setString(2, t.getTenSach());
            pst.setString(3, t.getNguoiMuon());
            pst.setString(4, t.getNgayMuon());
            pst.setString(5, t.getNgayHenTra());
            pst.executeUpdate();
            pst.close();
            connectDb.closeConnect(con);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectDb.closeConnect(con);
        }
        return false;
    }

    public static boolean update(sach t) {
        Connection conn = connectDb.getconnect();
        String sql = "update sach set tenSach=?,nguoiMuon=?,ngayMuon=?,ngayHenTra=? where maSach = ? ";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(5, t.getMaSach());
            pst.setString(1, t.getTenSach());
            pst.setString(2, t.getNguoiMuon());
            pst.setString(3, t.getNgayMuon());
            pst.setString(4, t.getNgayHenTra());
            pst.executeUpdate();
            pst.close();
            connectDb.closeConnect(conn);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean delete(sach t) {
        Connection conn = connectDb.getconnect();
        String sql = "delete from sach where maSach = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, t.getMaSach());
            pst.executeUpdate();
            pst.close();
            connectDb.closeConnect(conn);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static ArrayList<sach> selectAll() {
        ArrayList<sach> list = new ArrayList<>();
        String sql = "select * from sach ";
        try {
            Connection con = connectDb.getconnect();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maS = rs.getString("maSach");
                String tenS = rs.getString("tenSach");
                String nguoiM = rs.getString("nguoiMuon");
                String ngayM = rs.getString("ngayMuon");
                String ngayH = rs.getString("ngayHenTra");
                sach s = new sach(maS, tenS, nguoiM, ngayM, ngayH);
                list.add(s);
            }
            connectDb.closeConnect(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<sach> selectByCondition(sach s) {
        ArrayList<sach> list = new ArrayList<>();
        try {
            Connection conn = connectDb.getconnect();
            String sql = "select * from sach where maSach = ? OR tensach = ? OR nguoiMuon = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, s.getMaSach());
            pst.setString(2, s.getTenSach());
            pst.setString(3, s.getNguoiMuon());System.out.println(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maS = rs.getString("maSach");
                String tenS = rs.getString("tenSach");
                String nguoiM = rs.getString("nguoiMuon");
                String ngayM = rs.getString("ngayMuon");
                String ngayH = rs.getString("ngayHenTra");
                sach sach = new sach(maS, tenS, nguoiM, ngayM, ngayH);
                list.add(sach);
            }
            connectDb.getconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
