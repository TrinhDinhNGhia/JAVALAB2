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
public class UnetiBook extends Book {
        private String language;
        private int semster ;  

    public String getLanguge() {
        return language;
    }

    public int getSemster() {
        return semster;
    }

    public void setLanguge(String languge) {
        this.language = languge;
    }

    public void setSemster(int semster) {
        this.semster = semster;
    }
       public void intput(){
              super.input();
               Scanner sc=new Scanner(System.in);
               System.out.println("Nhap ngon ngu: ");
               language=sc.nextLine();
               System.out.println("Nhap hoc ki :");
               semster =Integer.parseInt(sc.nextLine());
        }
        
        @Override
       public void display(){
        super.display();
           System.out.println("ngon ngu "+language );
           System.out.println("hoc ki :"+semster);
       }
       
       public void sort(UnetiBook[] b){
          for(int i=0;i<b.length -1 ;i++){
              for(int j=i+1;j<b.length;j++){
                    if (b[i].getYearPublishing() < b[j].getYearPublishing())
                    {
                        UnetiBook tem = b[i];
                        b[i] = b[j];
                        b[j] = tem;
                    
                    }
              }
                       
          }
       }
       public void searchNameBook(UnetiBook[] b){
                 Scanner sc=new Scanner(System.in);
               System.out.println("nhap ten sach:");
                String bookName=sc.nextLine();
                       int dem=0;
                System.out.println("thong tin sach ban muon tim la :");
                    for (int i = 0; i < b.length; i++) {
                   if(b[i].getBookName().equals(bookName)){
                       b[i].display();
                            dem++;
                   }
                  }
                    if(dem==0){
                        System.out.println("Khong co sach ban muon tim");
                    }}
       
        public void searchNameAuthor(UnetiBook[] b){
           Scanner sc= new Scanner(System.in);
            System.out.println("Nhap ten tac gia");
            String bookAuthor=sc.nextLine();
            int dem=0;
            System.out.println("THong tin tac gia muon tim la: ");
                 for (int i = 0; i < b.length; i++) {
                   if(b[i].getBookAuthor().equals(bookAuthor)){
                       b[i].display();
                            dem++;
                   }
                 }
                 if(dem==0){
                     System.out.println("khong co tac gia ban muon tim");}
        }

    void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
}

