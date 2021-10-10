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
public class Book {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Nhập vào book name");
        this.bookName=sc.nextLine();
        System.out.println("Nhâp vào book Author ");
        this.bookAuthor=sc.nextLine();
        System.out.println("Nhập vào producer");
        this.producer =sc.nextLine();
        System.out.println("Nhap vao year publishing");
        this.yearPublishing=sc.nextInt();
        System.out.println("Nhap vao price");
        this.price=sc.nextFloat();
        
      }
    
    public void display(){
                System.out.println("book Name "+this.bookName);
                System.out.println("book Author"+this.bookAuthor);
                System.out.println("producer"+this.producer);
                System.out.println(" year publishing"+this.yearPublishing);
                System.out.println("price "+this.price);
       }
    
}
