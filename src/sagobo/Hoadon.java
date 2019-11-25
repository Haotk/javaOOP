package sagobo;
import java.util.Scanner;

/**
 * Created by Alone on 11/5/2016.
 */
public class Hoadon {
    private String maNguoiMua,maSach, maDauSach,maHoaDon;
    private String ngayMua;
    Scanner inp =new Scanner(System.in);

    public Hoadon() {
        this.maHoaDon="";
        this.maNguoiMua= "";
        this.maDauSach = "";
        this.maSach = "";
        this.ngayMua = "";
    }

    public Hoadon(Hoadon hoaDon) {
        this.maHoaDon=hoaDon.getMahoadon();
        this.maNguoiMua = hoaDon.getmaNguoiMua();
        this.maSach = hoaDon.getMaSach();
        this.maDauSach = hoaDon.getMadausach();
        this.ngayMua = hoaDon.getNgayMua();
    }

    public Hoadon(String maNguoiMua, String maSach,String maDauSach, String ngayMua,String maHoaDon) {
        this.maHoaDon=maHoaDon;
        this.maNguoiMua = maNguoiMua;
        this.maSach = maSach;
        this.maDauSach = maDauSach;
        this.ngayMua = ngayMua;
    }


    public void hienThi() {

        System.out.printf("%-25s | %-10s |%-10s | %-20s|%-20s|\n",
                getMahoadon(),
                getmaNguoiMua(),
                getMaSach(),
                getMadausach(),
                getNgayMua());
    }

    @Override
    public String toString() {
        return  getMahoadon()+"#"+
                getmaNguoiMua()+ "#" +
                getMaSach()+ "#" +
                getMadausach()+"#"+
                getNgayMua();
    }    
    public void capNhat(Hoadon hoaDon) {
        this.maHoaDon=hoaDon.getMahoadon();
        this.maNguoiMua = hoaDon.getmaNguoiMua();
        this.maSach = hoaDon.getMaSach();
        this.maDauSach = hoaDon.getMadausach();
        this.ngayMua = hoaDon.getNgayMua();
    }

    public void capNhat(String maNguoiMua,String maSach, String maDauSach,String ngayMua,String maHoaDon) {
        this.maHoaDon=maHoaDon;
        this.maNguoiMua = maNguoiMua;
        this.maSach = maSach;
        this.maDauSach = maDauSach;
        this.ngayMua = ngayMua;
    }

    public String getmaNguoiMua() {
        return maNguoiMua;
    }

    public void setmaNguoiMua(String hoaDon) {
        this.maNguoiMua = maNguoiMua;
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
        return maDauSach;
    }

    public void setMadausach(String maDauSach) {
        this.maDauSach = maDauSach;
    }
    public String getMahoadon(){
        return maHoaDon;
    }
    public void setMahoadon(){
        this.maHoaDon=maHoaDon;
    }
    
    public void nhap(){
        System.out.println("nhap ma hoa don");
        maHoaDon=inp.nextLine();
        System.out.println("nhap ma nguoi mua");
        maNguoiMua=inp.nextLine();
        System.out.println("nhap ma sach");
        maSach=inp.nextLine();
        System.out.println("nhap ma dau sach");
        maDauSach=inp.nextLine();
        System.out.println("nhap ngay mua");
        ngayMua=inp.nextLine();
    }
    
}