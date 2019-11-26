package sagobo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;

public class File extends SachVanHoc{
    private SachVanHoc[] listsach;
    
    Scanner inp = new Scanner(System.in);
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
    
    void input_file() throws FileNotFoundException
    {
        Book[] list;
        FileInputStream fi = new FileInputStream("input.txt");
        Scanner inp = new Scanner(fi,"UTF-8");
        String temp = inp.nextLine(); //doc dong mang trong file
        inp.close();
        String [] item = temp.split(" "); //tach chuoi thanh cac phan tu chuoi
        list = new Book[item.length];
        for(int i=0; i<item.length; i++) //doi kiem string sang int cua cac phan tu
            list[i] = Integer.parseInt(item[i]);
    }
    void output_file() throws IOException
    {
        FileOutputStream fo = new FileOutputStream("output.txt");
        PrintWriter out = new PrintWriter(fo);
        for (int i=0; i<Element.length; i++)
            out.printf("%-5d",Element[i]);
        out.close();
    }
}

