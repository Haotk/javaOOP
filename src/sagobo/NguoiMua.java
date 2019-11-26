package sagobo;
import java.util.Scanner;
public class NguoiMua {
    Scanner inp=new Scanner(System.in);

    private String maNguoiMua, tenNguoiMua,  diaChi, soDienThoai, email;
    public NguoiMua() {
        this.maNguoiMua = "";
        this.tenNguoiMua = "";
        this.diaChi = "";
        this.soDienThoai = "";
        this.email = "";
   
    }

    public NguoiMua(NguoiMua hoaDon) {
        this.maNguoiMua = hoaDon.getmaNguoiMua();
        this.tenNguoiMua = hoaDon.getTenNguoiMua();
        this.diaChi = hoaDon.getDiaChi();
        this.soDienThoai = hoaDon.getSoDienThoai();
        this.email = hoaDon.getEmail();
    
    }

    public NguoiMua(String maNguoiMua,  String tenNguoiMua, String diaChi, String soDienThoai, String email) {
        this.maNguoiMua = maNguoiMua;
        this.tenNguoiMua = tenNguoiMua;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
     
    }

    public void hienThi() {

        System.out.printf("%-15s | %-20S | %-25s | %-30s | %-25s |\n",
                getmaNguoiMua(),
                getTenNguoiMua(),
                getDiaChi(),
                getSoDienThoai(),
                getEmail());
              
    }

    @Override
    public String toString() {
        return getmaNguoiMua()+ "#"
                + getTenNguoiMua()+ "#"
                + getDiaChi()+ "#"
                + getSoDienThoai()+ "#"
                + getEmail()+ "#";
               
               
    }

    public void capNhat(NguoiMua hoaDon) {
        this.maNguoiMua = hoaDon.getmaNguoiMua();
        this.tenNguoiMua = hoaDon.getTenNguoiMua();
        this.diaChi = hoaDon.getDiaChi();
        this.soDienThoai = hoaDon.getSoDienThoai();
        this.email = hoaDon.getEmail();
   
    }
    public void capnhat(String maNguoiMua,String tenNguoiMua,  String diaChi, String soDienThoai, String email) {
        //this.maphieumuon = maphieumuon;
        this.tenNguoiMua = tenNguoiMua;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
   
    }
    public void suathongtin(){
        System.out.println("nhap ma nguoi mua: ");
        maNguoiMua=inp.nextLine();
        System.out.println("nhap ten nguoi mua: ");
        tenNguoiMua=inp.nextLine();
        System.out.println("nhap dia chi: ");
        diaChi=inp.nextLine();
        System.out.println("nhap so dien thoai: ");
        soDienThoai=inp.nextLine();
        System.out.println("nhap email: ");
        email=inp.nextLine();
    }
    public String getmaNguoiMua() {
        return maNguoiMua;
    }

    public void setmaNguoiMua(String maNguoiMua) {
        this.maNguoiMua = maNguoiMua;
    }
    public String getTenNguoiMua() {
        return tenNguoiMua;
    }

    public void setTenNguoiMua(String tenNguoiMua) {
        this.tenNguoiMua = tenNguoiMua;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void nhap(){
        System.out.println("nhap ma nguoi mua: ");
        maNguoiMua=inp.nextLine();
        System.out.println("nhap ten nguoi mua: ");
        tenNguoiMua=inp.nextLine();
        System.out.println("nhap dia chi: ");
        diaChi=inp.nextLine();
        System.out.println("nhap so dien thoai: ");
        soDienThoai=inp.nextLine();
        System.out.println("nhap email: ");
        email=inp.nextLine();
    }
}