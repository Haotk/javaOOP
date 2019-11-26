package sagobo;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Arrays;
public class ioFile{
    NguoiMua[] ds;
    
    void inputfile() throws IOException{
        File khachhang = new File("khachhang.txt");
        BufferedReader br;
        try(FileReader fr = new FileReader(khachhang)){
          br = new BufferedReader(fr);
          String line="";
          String[] arrOfStr;
          NguoiMua x;
          while((line=br.readLine())!=null){
              arrOfStr = line.split("-");
              x = new NguoiMua((arrOfStr[0]),arrOfStr[1],arrOfStr[2],arrOfStr[3],arrOfStr[4]);
              x.nhap();
          }
      }//catch (FileNotFoundException ex) {
            //System.err.println("Không thể mở file hoặc không tồn tại file " + khachhang);
       // } catch (IOException ex) {
       //     System.err.println("Không thể đọc file " + khachhang);
       // }
        //return 
    }
    
    void output_file() throws IOException
    {
        File test = new File("test.txt");
        test.createNewFile();
        FileWriter writer = new FileWriter(test);
        for(int i=0;i<ds.length;i++){
        writer.write("Manguoimua "+ds[i].getmaNguoiMua()+"|Tennguoimua "+ds[i].getTenNguoiMua()+"|Diachi "+ds[i].getDiaChi()
        +"|Sodienthoai "+ds[i].getSoDienThoai()+"|Email "+ds[i].getEmail());
        writer.flush();
        writer.close();    
        }
    }
}



