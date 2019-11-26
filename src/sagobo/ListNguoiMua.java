/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sagobo;
import java.util.Scanner;
/**
 *
 * @author USER-PC
 */
public class ListNguoiMua implements Them,Tim,Sua{
    Scanner inp =new Scanner(System.in);
    private int songuoimua;
    private NguoiMua[] Listnguoimua;

    public void menu(){
        do {
            System.out.println();
            System.out.println("             QUẢN LÝ KHÁCH HÀNG");
            System.out.println("-------------------***------------------");
            System.out.println("|    1. Thêm khách hàng.                |");
            System.out.println("|    2. Xem danh sách khách hàng.       |");
            System.out.println("|    3. Tìm kiếm khách hàng.                  |");
            System.out.println("|    4. Sửa thông tin khách hàng.       |");
            //System.out.println("|    5. Sắp xếp theo tên.               |");
            System.out.println("|    9. Quay lại menu chính.            |");
            System.out.println("|    0. Thoát chương trình.             |");
            System.out.println("----------------------------------------");
            System.out.print("  Mời chọn chức năng: ");
            int n = Integer.parseInt(inp.nextLine());
            switch (n) {
                case 1:
                    them();
                    break;
                case 2:
                    xuatNguoiMua();
                    break;
                case 3:
                    tim();
                    break;
                case 4:
                    sua();
                    break;
                case 9:
                Menu mainmenu = new Menu();
                mainmenu.menu();
                case 0:
                    System.exit(0);
                    break;
            }

            System.out.println("\n---------------------KẾT THÚC MENU QUẢN LÝ SÁCH------------------\n");
        } while (true);
    }
    
    
    public void nhapNguoiMua(){
        System.out.println("nhap so nguoi mua ");
        songuoimua=Integer.parseInt(inp.nextLine());
        int i;
        Listnguoimua= new NguoiMua[songuoimua];    
        for(i = 0;i<songuoimua;i++){
            Listnguoimua[i]= new NguoiMua();
            Listnguoimua[i].nhap();
        }
    }
    public void xuatNguoiMua(){
        giaodien();
        for(int i=0;i<songuoimua;i++){
            Listnguoimua[i].hienThi();
    }
    }
    public void tim(){
        String timMaNguoiMua;
        int error = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nguoi mua muon tim: ");
        timMaNguoiMua = sc.nextLine();
        for(int i=0;i<songuoimua;i++){
            if(Listnguoimua[i].getmaNguoiMua().equals(timMaNguoiMua)){
                Listnguoimua[i].hienThi();
                error = 0;
            }
        }
        if(error == 1) System.out.println("Khong ton tai nguoi mua!");
    }    
    
    public void sua(){
        String timMaNguoiMua;
        int error = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nguoi mua muon tim: ");
        timMaNguoiMua = sc.nextLine();
        for(int i=0;i<songuoimua;i++){
            if(Listnguoimua[i].getmaNguoiMua().equals(timMaNguoiMua)){
                Listnguoimua[i].suathongtin();
                error = 0;
            }
        }
        if(error == 1) System.out.println("Khong ton tai nguoi mua!");
    }
    
    
    public void them(){
        NguoiMua[] temp;
        int j=0;
        temp = new NguoiMua[songuoimua+1];
        for(int i=0;i<songuoimua;i++){
            temp[i] = new NguoiMua();
            temp[i] = Listnguoimua[j++];
        }
        temp[songuoimua] = new NguoiMua();
        temp[songuoimua].nhap();
        songuoimua++;
        this.Listnguoimua=temp;
    }
    
    public void giaodien(){
        System.out.println("=================================================================================================================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n","maNguoiMua", "tenNguoiMua", "diaChi", "soDienThoai", "email");
        System.out.println("=================================================================================================================================");
    }
    
    /*public void xoaNguoiMua(){
        int c,i;
        String xoaMaNguoiMua;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach muon xoa: ");
        xoaMaNguoiMua = sc.nextLine();
        for(c=i=0;i<songuoimua;i++){
            if(Listnguoimua[i].getmaNguoiMua() == null ? xoaMaNguoiMua != null : !Listnguoimua[i].getmaNguoiMua().equals(xoaMaNguoiMua)) {
                Listnguoimua[c]=Listnguoimua[i];
                c++;}
        }
        songuoimua=c;
    }
    */
}
