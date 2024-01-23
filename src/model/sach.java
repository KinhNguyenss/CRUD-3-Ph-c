package model;
public class sach {

    private String maSach;
    private String tenSach;
    private String nguoiMuon;
    private String ngayMuon;
    private String ngayHenTra;

    public sach() {
    }

    public sach(String maSach, String tenSach, String nguoiMuon, String ngayMuon, String ngayHenTra) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nguoiMuon = nguoiMuon;
        this.ngayMuon = ngayMuon;
        this.ngayHenTra = ngayHenTra;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNguoiMuon() {
        return nguoiMuon;
    }

    public void setNguoiMuon(String nguoiMuon) {
        this.nguoiMuon = nguoiMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayHenTra() {
        return ngayHenTra;
    }

    public void setNgayHenTra(String ngayHenTra) {
        this.ngayHenTra = ngayHenTra;
    }

   
}
