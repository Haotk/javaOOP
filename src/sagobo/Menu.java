
package sagobo;

import java.util.Scanner;

public class Menu {
    public void menu(){
    Scanner scanner = new Scanner(System.in);
    int selection;
    do{
            System.out.println();
//          System.out.println("---------------------------------------\n");
            System.out.println("    CHƯƠNG TRÌNH QUẢN LÝ THƯ VIỆN");
            System.out.println("-------------------***------------------");
            System.out.println("|   1. Quản lý sách.                    |");
            System.out.println("|   2. Quản lý khách hàng.              |");
            System.out.println("|   3. Quản lý hóa đơn.                 |");
            System.out.println("|   0. Thoát chương trình.              |");
            System.out.println("----------------------------------------");
            System.out.print("Mời chọn chức năng: ");
            selection = scanner.nextInt();
            if (selection == 1){
                ListSach sach = new ListSach();
                sach.menu();
            }
            if (selection == 2){
                ListNguoiMua khachhang = new ListNguoiMua();
                khachhang.menu();
            }
            if (selection == 3){
                ListHoaDon hoadon = new ListHoaDon();
                hoadon.menu();
            }
        }while (selection !=0);
        
    }
}
