
package sagobo;
import java.io.FileNotFoundException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Book{
    private String maSach;
    private String tenSach;
    private String theLoai;
    private String tacgia;
    private String tinhTrang;
    
    public Book(){
        this.maSach = getMasach();
        this.tenSach = getTenSach();
        this.theLoai = getTheLoai();
        this.tacgia = getTacgia();
        this.tinhTrang = getTinhTrang();
    }
    public void capnhat( String maSach, String tenSach, String theLoai,String tacgia, String tinhTrang) {
        //this.maphieumuon = maphieumuon;
        this.tenSach = tenSach;
        this.theLoai = theLoai;
        this.theLoai = theLoai;
        this.tinhTrang = tinhTrang;
   
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

    public String getMasach() {
        return maSach;
    }

    public void setMasach(String maSach) {
        this.maSach = maSach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }
    



public String toString() {
        return "Book@[masach=" + maSach + " , ten sach=" + tenSach + ", "
                + "tacgia= " + tacgia + ",theloai =" + theLoai+ ",madausach= "+maDauSach+",tinhtrang ="+tinhTrang+"]";
    }

    void ghiFile_Student(String fileName) throws FileNotFoundException {
       
		DataOutputStream out =  new DataOutputStream(new FileOutputStream(fileName, Boolean.TRUE));
		try {
			out.writeUTF(String.valueOf(maSach));
			out.writeUTF(name);
			out.writeUTF(address);
			//out.writeInt(age);
                        out.writeUTF(age);
			
		}catch(IOException e) {
		}
    }
}