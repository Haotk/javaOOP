
package sagobo;
import java.io.FileNotFoundException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SachThieuNhi extends Book{
    Scanner inp= new Scanner(System.in);
    private String maSach;
    private String tenSach;
    private String theLoai;
    private String tacGia;
    private String tinhTrang;
    private String maDauSach="TN";
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public String getMasach() {
        return maSach;
    }

    public void setMasach(String maSach) {
        this.maSach = maSach;
    }

    public String getTacgia() {
        return tacGia;
    }

    public void setTacgia(String tacGia) {
        this.tacGia = tacGia;
    }
    @Override
    public String getMaSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaSach(String maSach) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public String toString() {
        return "Book@[maSach=" + maSach + " , tenSach=" + tenSach + ",theLoai= " + theLoai + ",tacGia =" + tacGia + ",tinhTrang=" +tinhTrang+",maDauSach="+maDauSach+"]";
    }
    public void nhap(){
    System.out.print("Nhap ma sach: ");
    maSach = inp.nextLine();
    System.out.print("Nhap ten sach: ");
    tenSach = inp.nextLine();
    System.out.print("Nhap the loai: ");
    theLoai = inp.nextLine();
    System.out.print("Nhap tac gia: ");
    tacGia = inp.nextLine();
    System.out.print("Nhap tinh trang: ");
    tinhTrang = inp.nextLine();
    }
    public void xuatSach(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s",maSach,tenSach,theLoai,tacGia,tinhTrang,maDauSach);
    }
}



