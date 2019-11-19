package sagobo;


/**
 * Created by Alone on 11/5/2016.
 */
public class Hoadon {
    private String maNguoiMuon,maSach, madausach;
    private String ngayMua;

    public Hoadon() {
        this.maNguoiMuon= "";
        this.madausach = "";
        this.maSach = "";
        this.ngayMua = "";
    }

    public Hoadon(Hoadon hoaDon) {
        this.maNguoiMuon = hoaDon.getmaNguoiMuon();
        this.maSach = hoaDon.getMaSach();
        this.madausach = hoaDon.getMadausach();
        this.ngayMua = hoaDon.getNgayMua();
    }

    public Hoadon(String maNguoiMuon, String maSach,String madausach, String ngayMua) {
        this.maNguoiMuon = maNguoiMuon;
        this.maSach = maSach;
        this.madausach = madausach;
        this.ngayMua = ngayMua;
    }


    public void hienThi() {

        System.out.printf("%-25s | %-10s |%-10s | %-20s|\n",
                getmaNguoiMuon(),
                getMaSach(),
                getMadausach(),
                getNgayMua());
    }

    @Override
    public String toString() {
        return getmaNguoiMuon()+ "#" +
                getMaSach()+ "#" +
                getMadausach()+"#"+
                getNgayMua();
    }    
    public void capNhat(Hoadon hoaDon) {
        this.maNguoiMuon = hoaDon.getmaNguoiMuon();
        this.maSach = hoaDon.getMaSach();
        this.madausach = hoaDon.getMadausach();
        this.ngayMua = hoaDon.getNgayMua();
    }

    public void capNhat(String maNguoiMuon,String maSach, String madausach,String ngayMua) {
        this.maNguoiMuon = maNguoiMuon;
        this.maSach = maSach;
        this.madausach = madausach;
        this.ngayMua = ngayMua;
    }

    public String getmaNguoiMuon() {
        return maNguoiMuon;
    }

    public void setmaNguoiMuon(String hoaDon) {
        this.maNguoiMuon = maNguoiMuon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getMadausach() {
        return madausach;
    }

    public void setMadausach(String madausach) {
        this.madausach = madausach;
    }
    
    
}