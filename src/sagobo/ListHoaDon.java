
package sagobo;
import java.util.Scanner;

public class ListHoaDon {
    
    Scanner inp =new Scanner(System.in);
    private int sohoadon;
    private Hoadon[] Listhoadon;
    
    public void menu(){
        do {
            System.out.println();
            System.out.println("             QUẢN LÝ HÓA ĐƠN");
            System.out.println("-------------------***------------------");
            System.out.println("|    1. Thêm hóa đơn.                   |");
            System.out.println("|    2. Xóa hóa đơn.                    |");
            System.out.println("|    3. Xem danh sách hóa đơn.          |");
            System.out.println("|    4. Tìm kiếm.                       |");
            System.out.println("|    5. Sửa thông tin hóa đơn.          |");
            //System.out.println("|    5. Sắp xếp theo tên.               |");
            //System.out.println("|    9. Quay lại menu chính.            |");
            System.out.println("|    0. Thoát chương trình.             |");
            System.out.println("----------------------------------------");
            System.out.print("  Mời chọn chức năng: ");
            int n = Integer.parseInt(inp.nextLine());
            switch (n) {
                case 1:
                    themHoaDon();
                    break;
                case 2:
                    //xoaSach();
                    break;
                case 3:
                    xuatHoaDon();
                    break;
                case 4:
                    timHoaDon();
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
    
    public void nhapHoaDon(){
        System.out.println("nhap so luong hoa don : ");
        sohoadon=Integer.parseInt(inp.nextLine());
        int i;
        Listhoadon = new Hoadon[sohoadon];
        for(i = 0;i<sohoadon;i++){
            Listhoadon[i]= new Hoadon();
            Listhoadon[i].nhap();
        }
    }
    public void timHoaDon(){
        String timMaHoaDon;
        int error = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hoa don muon tim: ");
        timMaHoaDon = sc.nextLine();
        for(int i=0;i<sohoadon;i++){
            if(Listhoadon[i].getMahoadon().equals(timMaHoaDon)){
                Listhoadon[i].hienThi();
                error = 0;
            }
        }
        if(error == 1) System.out.println("Khong ton tai hoa don");
    }    
    public void themHoaDon(){
        Hoadon[] temp;
        Check check =new Check();
        int j=0;
        temp = new Hoadon[sohoadon+1];
        for(int i=0;i<sohoadon;i++){
            temp[i] = new Hoadon();
            temp[i] = Listhoadon[j++];
        }
        temp[sohoadon] = new Hoadon();
        temp[sohoadon].nhap();
        for(int i=0;i<sohoadon;i++){
            if(check.checkMahoadon(temp[i].getMahoadon())==1)
               break;
        }
        sohoadon++;
        this.Listhoadon=temp;
    }
    public void xuatHoaDon(){
        
        for(int i=0;i<sohoadon;i++){
            Listhoadon[i].hienThi();
    }
}
}
