/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        ArrayList<Product> list = new ArrayList<>();
        do {
            showMenu();
            choose = sc.nextInt();
            switch (choose) {
                case 1 -> {
                    System.out.print("Nhập số sản phẩm N: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Product product = new Product();
                        System.out.println("Thêm sản phẩm thứ " + (i+1) + " : ");
                        product.Nhap();
                        list.add(product);
                    }
                }
                case 2 -> {
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).HienThi();
                    }
                }
                case 3 -> { Collections.sort(list, new Comparator<Product>() {
                    @Override
                    public int compare(Product t1, Product t2) {
                        if (t1.getGiaBan() > t2.getGiaBan()) {
                        } else {
                            return 1;
                        }
                        return -1;
                    }
                });
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).HienThi();
                    }
                   
                }
                case 4 -> System.out.println("Thoát!!!!");
                default -> System.err.println("Nhập lỗi mời nhập lại!!!");
            }

        } while (choose != 4);

    }

     static void showMenu() {
       System.out.println("1.Nhập thông tin cho n sản phẩm");
        System.out.println("2.Hiển thị thông tin vừa nhập");
        System.out.println("3.Sắp xếp thông tin ");
        System.out.println("4. Thoát.");
        System.out.print("Nhập lựa chọn: ");
    }
}
