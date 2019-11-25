package sagobo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
public class File extends SachVanHoc{
    private SachVanHoc[] listsach;
    public void docFile() 
    {
        //-------------------B1. Tao doi tuong luong va lien ket luong-----------
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\testout.txt");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(MangSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Khong tim thay duong dan:");
        }
        ObjectInputStream ois = null;
         try {
             ois = new ObjectInputStream(fis);
         } catch (IOException ex) {
             Logger.getLogger(SachVanHoc.class.getName()).log(Level.SEVERE, null, ex);
         }
           
         try {
             listsach=(SachVanHoc[])ois.readObject();
         } catch (IOException ex) {
             //Logger.getLogger(File1.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("Loi 3");
         } catch (ClassNotFoundException ex) {
             //Logger.getLogger(File1.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("Loi 4");
         }
       
        
        for(int i=0; i<listsach.length;i++)
        {
            System.out.println(listsach[i].getTenSach());
            System.out.println(listsach[i].getTheLoai());
            System.out.println(listsach[i].getTinhTrang());
            System.out.println(listsach[i].getMaSach());
            System.out.println(listsach[i].getTacGia());
        }
        //--------------------------B3. Đóng Luồng-----------------------------
         try {
             ois.close();
         } catch (IOException ex) {
             //Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("Rong 3");
         }
         
         try {
             ois.close();
         } catch (IOException ex) {
             //Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public void ghiFile() throws IOException {
        nhapSach();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("C:\\testout.txt"));
            // create student
            // write student
            oos.writeObject(listsach);
            System.out.println("Success...");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            oos.close();
        }
    }
}

