/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Nghia
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author Nghia
 */
public class Product {
    private String tenHangHoa;
    private String nhaSanXuat;
    private  float giaBan;
    public boolean gia1SP;

    public Product() {
    }

    public Product(String tenHangHoa, String nhaSanXuat, float giaBan) {
        this.tenHangHoa = tenHangHoa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
    
    public void sort(Product[] b){
    for (int i = 0; i < b.length - 1; i++) {
      for (int j = i + 1; j < b.length; j++) {
           if (b[i].giaBan > b[j].giaBan) {
              Product tem = b[i];
              b[i] = b[j];
              b[j] = tem;
                }
             }
          }
    }
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hàng hóa: ");
       this.tenHangHoa = sc.nextLine();
        System.out.println("Nhà sản xuất: ");
        this.nhaSanXuat = sc.nextLine();       
        System.out.println("Nhap gia bán: ");
       this.giaBan = Float.parseFloat(sc.nextLine());
    }
    
     public void HienThi() {
        System.out.println("Tên sách: " + this.tenHangHoa);
        System.out.println("Tác giả: " + this.nhaSanXuat);
        System.out.println("Giá: " + this.giaBan + " đồng");
    } 
}
