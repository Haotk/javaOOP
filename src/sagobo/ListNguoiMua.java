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
public class ListNguoiMua {
    Scanner inp =new Scanner(System.in);
    private int songuoimua;
    private NguoiMua[] Listnguoimua;

    public void menu(){
        do {
            System.out.println();
            System.out.println("             QUẢN LÝ KHÁCH HÀNG");
            System.out.println("-------------------***------------------");
            System.out.println("|    1. Thêm khách hàng.                |");
            System.out.println("|    2. Xóa khách hàng.                 |");
            System.out.println("|    3. Xem danh sách khách hàng.       |");
            System.out.println("|    4. Tìm kiếm khách                  |");
            System.out.println("|    5. Sửa thông tin khách hàng.       |");
            //System.out.println("|    5. Sắp xếp theo tên.               |");
            System.out.println("|    9. Quay lại menu chính.            |");
            System.out.println("|    0. Thoát chương trình.             |");
            System.out.println("----------------------------------------");
            System.out.print("  Mời chọn chức năng: ");
            int n = Integer.parseInt(inp.nextLine());
            switch (n) {
                case 1:
                    themNguoiMua();
                    break;
                case 2:
                    //xoaSach();
                    break;
                case 3:
                    //xuatDanhSach();
                    break;
                case 4:
                    timNguoiMua();
                    break;
                case 5:
                    
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
    public void timNguoiMua(){
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
    public void themNguoiMua(){
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
}
