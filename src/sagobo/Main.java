/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sagobo;

import java.io.IOException;

/**
 *
 * @author USER-PC
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ListHoaDon lh=new ListHoaDon();
        lh.nhapHoaDon();
        lh.xuatHoaDon();
        System.out.println("them 1 hoa don");
        lh.themHoaDon();
        lh.xuatHoaDon();
    }
}
