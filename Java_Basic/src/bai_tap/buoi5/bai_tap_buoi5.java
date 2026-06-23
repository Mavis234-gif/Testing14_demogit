package bai_tap.buoi5;

import java.util.Scanner;

public class bai_tap_buoi5 {
    public static void main(String[] args) {
        //bài tập quản lý sinh viên thông qua menu có 4 chức năng chính
        //1. Thêm sinh viên
        //2. Xóa sinh viên dựa vào id
        //3. Hiển thị danh sách sinh viên
        //4. Tìm sinh viên theo ID
        //5. Thoát chương trình
        //Mỗi sinh viên có các thuộc tính: ID, name, age, address

        //Cách và bước làm ***
        //1. Tạo class sinhVien
        //2. Tạo class quản lý sinh viên để thực hiện chức năng
        //3. Tạo menu để người dùng lựa chọn chức năng

        //tạo ra menu
        Scanner sc = new Scanner(System.in);
        quanLySinhVien quanLySinhVien = new quanLySinhVien();
        int choice;
        do{
        System.out.println("===== QUẢN LÝ SINH VIÊN ====");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm sinh viên theo id");
        System.out.println("4. Xóa sinh viên theo id");
        System.out.println("5. Thoát chương trình");
        System.out.println("=======================");
        System.out.println("Nhập lựa chọn của bạn: ");
        choice = sc.nextInt();
        sc.nextLine(); // để đọc bỏ dòng mới sau khi nhập choice
        switch (choice){
            case 1:
                quanLySinhVien.themSinhVien(sc);
                break;
            case 2:
                quanLySinhVien.hienThiDanhSachSinhVien();
                break;
            case 3:
                quanLySinhVien.timSinhVien(sc);
                break;
            case 4:
                quanLySinhVien.xoaSinhVien(sc);
                break;
            case 5:
                System.out.println("Thoát chương trình thành công! ");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại. ");
        }}while (choice != 5);
    }
}
