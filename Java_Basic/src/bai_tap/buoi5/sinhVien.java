package bai_tap.buoi5;

import java.util.Scanner;

public class sinhVien {
    //thuộc tính
    private String id;
    private String name;
    private int age;
    private String address;
    private double score;

    //constructor mặc đinh không tham số
    public sinhVien(){}

    //constructor
    public sinhVien(String id, String name, int age, String address, double score){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    //phương thưc
    //phương thức input để nhập thông tin sinh viên
    public void input(Scanner sc){
        System.out.println("Nhâp thông id: ");
        this.id = sc.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.nextLine();
        System.out.println("Nhập score: ");
        this.score = sc.nextInt();
        sc.nextLine();
    }

    //phương thức display hiển thị thông tin sinh viên
    public void display(){
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Address: " + address +
                " | Score: " + score);}

        //phương thức getID để lấy id sinh viên
        public String getId(){
        return id;
        }
}
