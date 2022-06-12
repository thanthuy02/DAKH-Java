/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

import java.util.Scanner;

/**
 *
 * @author THANTHUY
 */
public class Test_delKH {
    public static void doDelKH(){
        XLKH kh = new XLKH();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dia chi");
        String diachi = sc.nextLine();
        System.out.println("Nhap gioi tinh");
        String gioitinh = sc.next();
        
        kh.delKH(diachi, gioitinh);
    }
    
    public static void main(String[] args) {
        doDelKH();
    }
}
