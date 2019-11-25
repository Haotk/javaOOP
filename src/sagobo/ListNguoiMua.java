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
public class ListNguoiMua {
    Scanner inp =new Scanner(System.in);
    private int songuoimua;
    private NguoiMua[] Listnguoimua;
    public void nhapNguoiMua(){
        System.out.println("nhap so nguoi mua ");
        songuoimua=Integer.parseInt(inp.nextLine());
        int i;
        Listnguoimua= new NguoiMua[songuoimua];    
        for(i = 0;i<songuoimua;i++){
            Listnguoimua[i]= new NguoiMua();
            Listnguoimua[i].nhap();
        }
    }
    public void timNguoiMua(){
        String timMaNguoiMua;
        int error = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nguoi mua muon tim: ");
        timMaNguoiMua = sc.nextLine();
        for(int i=0;i<songuoimua;i++){
            if(Listnguoimua[i].getmaNguoiMua().equals(timMaNguoiMua)){
                Listnguoimua[i].hienThi();
                error = 0;
            }
        }
        if(error == 1) System.out.println("Khong ton tai nguoi mua!");
    }    
    public void themNguoiMua(){
        NguoiMua[] temp;
        int j=0;
        temp = new NguoiMua[songuoimua+1];
        for(int i=0;i<songuoimua;i++){
            temp[i] = new NguoiMua();
            temp[i] = Listnguoimua[j++];
        }
        temp[songuoimua] = new NguoiMua();
        temp[songuoimua].nhap();
        songuoimua++;
        this.Listnguoimua=temp;
    }
}
