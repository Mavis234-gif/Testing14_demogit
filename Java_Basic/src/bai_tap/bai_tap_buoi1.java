package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi1 {
    public static void main(String[] args) {
        //bài 1: tính điểm trung bình của học sinh, cho phép nhập: họ và tên, điểm toaán lí hóa, in ra điểm trung bình của học sinh đó.
        //bài 2: tính lương nhân viên: cho phép nhập tên, lương cơ bản, số ngày làm việc , sau đó in ra thông tin nhân viên đó.

        //Sử dụng mô hình IPO ( Input - Process - Output: )
        // Input: dữ liệu đầu vào
        // Process: Xử lý logic
        // Output: Kết quả mong muốn


        //Bài 1

//        //Input
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập họ và tên: ");
//        String hoTen = sc.nextLine();
//
//        System.out.println("Nhập điểm Toán: ");
//        float diem_toan = sc.nextFloat();
//
//        System.out.println("Nhập điểm Lí: ");
//        float diem_li = sc.nextFloat();
//
//        System.out.println("Nhập điểm Hóa: ");
//        float diem_hoa = sc.nextFloat();
//
//        //Process
//        float diemTB = (diem_toan + diem_li + diem_hoa) / 3;
//        String diemTrungBinh = String.format("%.1f", diemTB);
//
//        //Output
//        System.out.println("\n---Kết Quả Học Tập---");
//        System.out.println("Nhập họ và tên: " + hoTen);
//        System.out.println("Nhập Điểm toán: " + diem_toan);
//        System.out.println("Nhập Điểm lí: " + diem_li);
//        System.out.println("Nhập điểm hóa: " + diem_hoa);
//        System.out.println("=>Điểm trung bình của học sinh: " + diemTrungBinh);


        //Bài 2
        System.out.println("Nhập họ và tên: ");
        String hoTenNhanVien = sc.nextLine();

        System.out.println("Nhập lương cơ bản: ");
        double luongCoBan = sc.nextDouble();

        System.out.println("Nhập số ngày công: ");
        double soNgayCong = sc.nextDouble();

        double tongLuong = luongCoBan * (soNgayCong / 26.0);

        System.out.println("Nhập họ và tên nhân viên: " + hoTenNhanVien);
        //%.0f: Dấu phẩy để ngăn cách nghìn, .0 để không hiện số lẻ
        System.out.printf("Nhập lương cơ bản: %,.0f\n", luongCoBan);
        //%.1f: Hiện 1 chữ số thập phân cho ngày công
        System.out.printf("Nhập số ngày công: %.1f\n", soNgayCong);
        //%.1f: Vưa ngăn cách hàng nghìn vừa làm tròn 1 số lẻ cho tổng lương
        System.out.printf("Tổng lương nhận được: %,.1f VND\n", tongLuong);


    }
}
