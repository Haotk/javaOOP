
package sagobo;
import java.io.FileNotFoundException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Book{
    private String maSach;
    private String tenSach;
    private String theLoai;
    private String tacGia;
    private String tinhTrang;
    private String maDauSach;
    Object getTheLoai;
    public abstract String getTenSach();
    public abstract void setTenSach(String tenSach);
    public abstract String getTheLoai();
    public abstract void setTheLoai(String theLoai);
    public abstract String getTinhTrang();
    public abstract String getMaSach();
    public abstract void setMaSach(String maSach);
    public abstract String getTacGia();
    public abstract void setTacGia(String tacgia);
    public abstract String toString();
    public abstract void nhap();
    public abstract void xuatSach();
}



