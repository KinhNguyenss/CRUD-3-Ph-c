package model;
public class taiKhoan {
    private String taiKhoan;
    private String matKhau;

    public taiKhoan() {
        super();
    }

    public taiKhoan(String taiKhoan, String matKhau) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "taiKhoan{" + "taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + '}';
    }
    
}
