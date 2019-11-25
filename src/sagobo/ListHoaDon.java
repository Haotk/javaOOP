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
public class ListHoaDon {
    Scanner inp =new Scanner(System.in);
    private int sohoadon;
    private Hoadon[] Listhoadon;
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
