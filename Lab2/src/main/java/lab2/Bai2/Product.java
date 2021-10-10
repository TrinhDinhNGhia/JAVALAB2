/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.Bai2;

import java.util.Scanner;

/**
 *
 * @author Nghia
 */
public class Product {
    private String maHH;
    private  String tenHH;
    private float soLuong;
   private  float  gia1SP;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public String getMaHH() {
        return maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }
   
      
    
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Nhap ma hang hoa");
        this.maHH=sc.nextLine();
         System.out.println(" Nhap ten  hang hoa");
        this.tenHH=sc.nextLine();
         System.out.println(" Nhap so luong ");
        this.soLuong= Float.parseFloat(sc.nextLine());
         System.out.println(" Nhap gia 1 san pham ");
        this.gia1SP= Float.parseFloat(sc.nextLine());
               
   
    }
    public void HienThi() {
        System.out.println("Tên sách: " + this.maHH);
        System.out.println("Tác giả: " + this.tenHH);      
        System.out.println("Soluong: " + this.soLuong);
          System.out.println("Giá: " + this.gia1SP + " đồng");
    } 
   
    
}
