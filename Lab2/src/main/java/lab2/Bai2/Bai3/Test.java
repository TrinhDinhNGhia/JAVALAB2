/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.Bai2.Bai3;

import java.util.Scanner;

/**
 *
 * @author Nghia
 */
public class Test {
    void menu(){
 System.out.println("1 nhap thong tin n cuon sach ");
 System.out.println("2 hien thi thong tin vua nhap");
 System.out.println("3 sap xep giam dan theo nam xuat ban");
 System.out.println("4 tim kiem theo ten sach");
 System.out.println("5 tim kiem theo ten tac gia ");
 System.out.println("6 thoat");
 }
    
    public static void main(String[] args){
      int n=0;
      UnetiBook ab=new UnetiBook();
      UnetiBook[] ab1=null;
      do{
          ab.menu();
          System.out.println("Nhap vao lua chon cua ban");
          Scanner sc=new Scanner(System.in);
          n=Integer.parseInt(sc.nextLine());
          switch(n){
              case 1:{
              int m;
              
                 System.out.println("Nhap vao m :");
                  m = Integer.parseInt(sc.nextLine());
                  ab1= new UnetiBook[m];
                  for(int i=0;i<m;i++){
                              ab1[i]=new UnetiBook();
                              ab1[i].input();
                     }
                  break;
                      } 
              case 2:{
                  if(ab1==null)
                  {
                      System.out.println("Ban chua nhap du lieu");
                  }else{
                      System.out.println("du lieu ban vua nhap la: ");
                      for(int i=0;i<ab1.length;i++){
                              System.out.println("Thong tin sach thu "+(i+1));
                              ab1[i].display();
                        }
                       }
                  break;
              
                  }
              case 3:
              {
                  if(ab1==null){
                      System.out.println(" Ban chua nhap du lieu ");
                    }
                  else{
                  ab.sort(ab1);
                      System.out.println("Du lieu sau khi sap xep la: ");
                      for(int i=0;i<ab1.length;i++){
                          System.out.println("thong tin hang hoa thu "+(i+1));
                          ab1[i].display();
                      }
                    }
                  break;
              }
              case 4:{
                  ab.searchNameBook(ab1);
                  break;
              
              }
              case 5:{
              ab.searchNameAuthor(ab1);
              break;
              }
              case 6:break;
              default:{
                  System.out.println("Khong co lua chon cua ban ");
                  break;
              }
              
           }   
          
      }while(n!=6);
    
    }
    
}
