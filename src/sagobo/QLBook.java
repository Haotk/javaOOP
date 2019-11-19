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
public class QLBook {

    Scanner scanner = new Scanner(System.in);
    //DauSachBL dausachBL = new DauSachBL();
    //SachBL sachBL = new SachBL();
    //PhieuMuonBL phieuMuonBL = new PhieuMuonBL();
    //DauSach dausach = new DauSach();

    public void menu() {
        do {
            System.out.println();
            System.out.println("             QUẢN LÝ SÁCH");
            System.out.println("-------------------***-------------------");
            System.out.println("|    1. Thêm sách.                      |");
            System.out.println("|    2. Sửa thông tin.                  |");
            System.out.println("|    3. Xóa sách.                       |");
            System.out.println("|    4. Xem danh sách.                  |");
            //System.out.println("|    5. Sắp xếp theo tên.               |");
            //System.out.println("|    6. Tìm kiếm.                       |");
            System.out.println("|    9. Quay lại menu chính.            |");
            System.out.println("|    0. Thoát chương trình.             |");
            System.out.println("-----------------------------------------");
            System.out.print("  Mời chọn chức năng: ");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    them();
                    break;
                case 2:
                    sua();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    xemDanhSach();
                    break;
                case 5:
                    sapXepTheoTen();
                    break;
                case 6:
                    timKiem();
                    break;
                case 9:
                    Main.menu();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

            System.out.println("\n---------------------KẾT THÚC MENU QUẢN LÝ SÁCH------------------\n");
        } while (true);
    }

    public void them() {
        System.out.println();
        System.out.println("                THÊM SÁCH");
        System.out.println("-------------------***-------------------");
        System.out.println("MỜI NHẬP VÀO CÁC THÔNG TIN:");
        String maDausach, maSach;
        ListDauSach lst = dausachBL.layDanhSach();
        NodeDauSach tg = lst.getHead();
        do {
            System.out.print("Nhập vào mã đầu sách: ");
            maDausach = scanner.nextLine();
        } while (maDausach == "");
        if (dausachBL.kiemTra(maDausach)== true) {
            do {
                System.out.print("Nhập mã sách : ");
                maSach = scanner.nextLine();
                if(sachBL.kiemTra(maSach)==true)
                while(tg != null){
                    if(tg.getInfo().getMaDauSach().equalsIgnoreCase(maDausach)){
                        Sach Sach = new Sach(maDausach, maSach, tg.getInfo().getTenSach(), tg.getInfo().getTheLoai(),tg.getInfo().getTacGia(), tg.getInfo().getTrangThai());
                        sachBL.them(Sach);
                        } tg = tg.getNext();
                }
        } else {
            System.out.println("không tồn tại mã: " + maDausach);
                { System.out.println("Mã Sách Đã tồn tại!");}
            } while (sachBL.kiemTra(maSach)== true);
                while(tg != null){
                    if(tg.getInfo().getMaDauSach().equalsIgnoreCase(maDausach)){
                        Sach Sach = new Sach(maDausach, maSach, tg.getInfo().getTenSach(), tg.getInfo().getTheLoai(),tg.getInfo().getTacGia(), tg.getInfo().getTrangThai());
                        sachBL.them(Sach);
                        } tg = tg.getNext();
                }
        } else {
            System.out.println("không tồn tại mã: " + maDausach);
        }
        System.out.println("\n-----------------------------------------------------------------------------\n");

    }

    public void sua() {
        System.out.println();
        System.out.println("                SỬA SÁCH");
        System.out.println("-------------------***-------------------");
        System.out.println("MỜI NHẬP VÀO CÁC THÔNG TIN:");
        String maDausach,maSach, tenSach, theLoai,tacgia, trangThai;
        ListSach lst = sachBL.layDanhSach();
        NodeSach tg = lst.getHead();

        do {
            System.out.print("Nhập vào mã cho sách: ");
            maSach = scanner.nextLine();
        } while (maSach == "");
        if (sachBL.kiemTra(maSach)) {
            do {
                System.out.print("Nhập tên sách : ");
                tenSach = scanner.nextLine();
            } while (tenSach == "");

            do {
                System.out.print("thể loại: ");
                theLoai = scanner.nextLine();
            } while (theLoai == "");
            do {
                System.out.print("Tac giả: ");
                tacgia = scanner.nextLine();
            } while (tacgia == "");

            do {
                System.out.print("trạng thái: ");
                trangThai = scanner.nextLine();
            } while (trangThai == "");
            Sach Sach = new Sach(maSach, tenSach, theLoai,tacgia, trangThai);
            sachBL.sua(Sach);
        } else {
            System.out.println("Đã tồn tại mã: " + maSach);
        }
        System.out.println("\n-----------------------------------------------------------------------------\n");

    }
    public void xoa() {
        System.out.println();
//        System.out.println("---------------------------------------\n");
        System.out.println("        XÓA THÔNG TIN ĐẦU SÁCH");
        System.out.println("-------------------***-------------------");
        System.out.println("Nhập vào mã đầu sách cần xóa: ");
        String maSach = scanner.nextLine();
        if (sachBL.kiemTra(maSach)) {
            sachBL.xoa(maSach);
            System.out.println("Xóa thành công đầu sách có mã: " + maSach);
        } else {
            System.out.println("Không tồn tại đầu sách có mã: " + maSach);
        }

        System.out.println("\n-----------------------------------------------------------------------------\n");
    }

    public void xemDanhSach() {
        System.out.println();
//        System.out.println("---------------------------------------\n");
        System.out.println("DANH SÁCH ");
        ListSach lst = sachBL.layDanhSach();
        NodeSach tg = lst.getHead();
        lst.sapXepTheoTen();
        System.out.printf("%-10s | %-30s | %-30S | %-15s | %-15s |%-20s|\n\n",
                "Mã đầu sách",
                "Mã sách ",
                "Tên sách",
                "Thể loại",
                "Tác Giả",
                "Tinh Trang");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        while (tg != null) {
            tg.getInfo().hienThi();
            tg = tg.getNext();
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }

    public void sapXepTheoTen() {
        System.out.println();
//        System.out.println("---------------------------------------\n");
        System.out.println("DANH SÁCH ĐẦU SÁCH");
        ListSach lst = sachBL.layDanhSach();
        lst.sapXepTheoTen();
        NodeSach tg = lst.getHead();
           System.out.printf("%-10s | %-30s | %-30S | %-15s | %-15s |%-20s|\n",
                   "Mã đầu Sách",
                "Mã sách ",
                "Tên sách",
                "Thể loại",
                "Tác Giả",
                "Tinh Trang");
        while (tg != null) {
            tg.getInfo().hienThi();
            tg = tg.getNext();
        }

        System.out.println("\n-----------------------------------------------------------------------------\n");
    }

    public void timKiem() {
        do {
            System.out.println();
//            System.out.println("---------------------------------------\n");
            System.out.println("            TÌM KIẾM SÁCH");
            System.out.println("-------------------***-------------------");
            System.out.println("|   1. Tìm theo mã sách gân đúng.   |");
            System.out.println("|   2. Tìm theo mã sách.            |");
            System.out.println("|   3. Tìm theo tên sách.           |");
            System.out.println("|   9. Quay lại menu QL .               |");
            System.out.println("|   0. Thoát chương trình.              |");
            System.out.println("-----------------------------------------");
            System.out.print("  Mời chọn chức năng: ");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    timGanMa();
                    break;
                case 2:
                    timMa();
                    break;
                case 3:
                    timTen();
                    break;
                case 9:
                    menu();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

            System.out.println("\n--------------------KẾT THÚC MENU TÌM KIẾM SÁCH-------------------\n");
        } while (true);
    }

   
    public void timMa() {
        System.out.println();
//        System.out.println("---------------------------------------\n");
        System.out.println("            TÌM KIẾM THEO MÃ");
        System.out.println("-------------------***-------------------");
        System.out.print("Nhập vào mã cần tìm kiếm: ");
        String maSach = scanner.nextLine();
          NodeSach tg = sachBL.timMa(maSach);

        System.out.println();
        if (tg != null) {
                System.out.printf("%-10s | %-30s | %-30S | %-15s | %-15s |%-20s|\n",
                        "Mã đầu sách",
                "Mã sách ",
                "Tên sách",
                "Thể loại",
                "Tác Giả",
                "Tinh Trang");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
              tg.getInfo().hienThi();
            }
         else {
            System.out.println("Không có kết quả nào phù hợp.");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");

    }
      public void timGanMa() {
        System.out.println();
//        System.out.println("---------------------------------------\n");
        System.out.println("        TÌM KIẾM GẦN ĐÚNG THEO MÃ");
        System.out.println("-------------------***-------------------");
        System.out.print("Nhập vào ký tự cần tìm kiếm: ");
        String maSach = scanner.nextLine();
        ListSach lst = sachBL.timGanMa(maSach);
        NodeSach tg = lst.getHead();

        System.out.println();
        if (tg != null) {
        System.out.printf("%-10s | %-30s | %-30S | %-15s | %-15s |%-20s|\n",
                "Mã đầu sách",
                "Mã sách ",
                "Tên sách",
                "Thể loại",
                "Tác giả",
                "Tình Trạng");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
            while (tg != null) {
                tg.getInfo().hienThi();
                tg = tg.getNext();
            }
        } else {
            System.out.println("Không có kết quả nào phù hợp.");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");

    }
    public void timTen() {
        System.out.println();
        System.out.println("            TÌM KIẾM THEO TÊN");
        System.out.println("-------------------***-------------------");
        System.out.print("Nhập vào tên cần tìm kiếm: ");
        String tenSach = scanner.nextLine();
        ListSach lst = sachBL.timTen(tenSach);
        NodeSach tg = lst.getHead();

        System.out.println();
        if (tg != null) {
        System.out.printf("%-10s | %-30s | %-30S | %-15s | %-15s |%-20s|\n",
                "Mã đầu Sách",
                "Mã sách ",
                "Tên sách",
                "Thể loại",
                "Tác giả",
                "Tình Trạng");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
            while (tg != null) {
                tg.getInfo().hienThi();
                tg = tg.getNext();
            }
        } else {
            System.out.println("Không có kết quả nào phù hợp.");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");

    }

    }
}
