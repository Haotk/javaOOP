
package sagobo;
import java.io.FileNotFoundException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SachVanHoc extends Book{
    Scanner inp= new Scanner (System.in);
    private String maSach;
    private String tenSach;
    private String theLoai="Van Hoc";
    private String tacGia;
    private String tinhTrang;
    private String maDauSach="VH";
    public void nhapSach(){
        this.maSach="Nhan";
        this.tenSach="Nhan";
        this.theLoai="Loai";
        this.tacGia="TacGia";
        this.tinhTrang="TinhTrang";
    }
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

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
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
    //System.out.print("Nhap the loai: ");
    //theLoai = inp.nextLine();
    System.out.print("Nhap tac gia: ");
    tacGia = inp.nextLine();
    System.out.print("Nhap tinh trang: ");
    tinhTrang = inp.nextLine();
    }
    public void xuatSach(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",maSach,tenSach,theLoai,tacGia,tinhTrang,maDauSach);
    }
    
    public void suathongtin(){
        System.out.println("Nhap ma dau sach: ");
        this.tacGia=inp.nextLine();
        System.out.println("Nhap ma sach: ");
        this.maSach=inp.nextLine();
        System.out.println("Nhap ten sach: ");
        this.tenSach=inp.nextLine();
        System.out.println("Nhap the loai: ");
        this.theLoai=inp.nextLine();
        System.out.println("Nhap tac gia");
        this.tacGia=inp.nextLine();
        System.out.println("Nhap tinh trang");
        this.tinhTrang=inp.nextLine();
    }
}



