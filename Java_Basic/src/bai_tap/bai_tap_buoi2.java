package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi2 {
    public static void main(String[] args) {
        //Bài tập 1: kiểm tra sinh viên có pass môn hay không với điều kiện điểm trung bình >= 5 và không được nghỉ quá 3 buổi

        //input: điểm trung bình >= 5, số buổi nghỉ
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình: ");
        double diemTB = sc.nextDouble();
        System.out.println("Nhập số buổi nghỉ: ");
        double soBuoiNghi = sc.nextDouble();

        //Process: kiểm tra điều kiện:
        Boolean isquaMon = diemTB >= 5.0 && soBuoiNghi <= 3;
        if (isquaMon){
            //logic A
            System.out.println("Sinh viên qua môn");
        } else {
            //logic B
            System.out.println("Sinh viên chưa qua môn");
        }
        //Output: in kết quả
        System.out.println("Kết quả sinh viên có pass môn hay không: " + isquaMon);


        //Bài tập 2: Kiểm tra xem khách hàng có được giảm giá hay không
        //Điều kiện là: 1. sinh viên, 2.Có tổng đơn hàng >= 500k

        //Input:
        System.out.println("Có là sinh viên không? (true/flase): ");
        Boolean isSinhVien = sc.nextBoolean();
        System.out.println("Tổng giá trị đơn hàng: ");
        double tongGiaTriDonHang = sc.nextDouble();

        //Process:
        Boolean isGiamGia = isSinhVien || tongGiaTriDonHang >= 500;

        //Output:
        System.out.println("Khách hàng được giảm giá: " + isGiamGia);

        //tiền tố, hậu tố: ++, --
        //Cấu trúc câu điều kiện
        // if statment:
        //if ( điều kiện đúng) {thực hiện logic bên trong}

        int thu = 2;
        if (thu == 2 || thu == 6) {
            System.out.println("Hôm nay tôi cần đi học: ");
        }


    }

}


