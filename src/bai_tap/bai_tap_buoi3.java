package bai_tap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class bai_tap_buoi3 {
    public static void main(String[] args){
        //bài tập 1: quản lý chi tiêu trong 7 ngày.
        //cho phép người dùng nhập vào chi tiêu cá nhân trong 7 ngày, sau đó in ra tổng chi tiêu mỗi ngày
        //chi tiêu cao nhất và thấp nhất trong 7 ngày

        Scanner sc = new Scanner(System.in);
        double[] chiTieu = new double[7];

        for (int i = 0; i < chiTieu.length; i++){
            System.out.println("Yêu cầu nhập chi tiêu ngày " + (i + 1) + ": ");
            chiTieu[i] = sc.nextDouble();
        }

        double tongChiTieu = 0;
        double chiTieuTB = 0;
        double chiTieuCaoNhat = chiTieu[0];
        double chiTieuThapNhat = chiTieu[0];
        for (double chi: chiTieu){
            tongChiTieu += chi; //tongChiTieu = tongChiTieu + chi

        }
        for (int i = 0; i < chiTieu.length; i++){
            if (chiTieu[i] > chiTieuCaoNhat) {
                chiTieuCaoNhat = chiTieu[i];
            }
            if (chiTieu[i] < chiTieuThapNhat){
                chiTieuThapNhat = chiTieu[i];
            }
        }

        chiTieuTB = tongChiTieu / chiTieu.length;
        System.out.printf("Tổng chi tiêu trong 7 ngày: %.1f\n", tongChiTieu);
        System.out.printf("Tổng chi tiêu mỗi ngày: %.1f\n ", chiTieuTB);
        System.out.println("Chi tiêu cao nhất trong 7 ngày: " + chiTieuCaoNhat);
        System.out.println("Chi tiêu thấp nhất trong 7 ngày: " + chiTieuThapNhat);

        //bài tập 2: quản lý điểm số của học sinh trong 5 môn học.
        //cho phép người dùng nhập vào điểm số của 5 môn, sau đó in ra điểm trung bình, cao nhất và thấp nhất
        // và số môn học có điểm số >= 5.0

        double[] diemSoMonHoc = new double[5];

        for (int i = 0; i < diemSoMonHoc.length; i++){
            System.out.println("Nhập số điểm môn học " + (i + 1) + " :");
            diemSoMonHoc[i] = sc.nextDouble();
        }

        double tongSoDiemMonHoc = 0;
        double soDiemCaoNhat = diemSoMonHoc[0];
        double soDiemThapNhat = diemSoMonHoc[0];
        int soMonDat = 0;

        for (double diem : diemSoMonHoc){
            //1. Cộng dồn để tính tổng
            tongSoDiemMonHoc += diem;

            //2. Tiìm điểm cao nhất
            if (diem > soDiemCaoNhat){
                soDiemCaoNhat = diem;
            }
            if (diem < soDiemThapNhat){
                soDiemThapNhat = diem;
            }
            if (diem >= 5.0){
                soMonDat++; // Đếm số môn có điểm số >= 5.0
            }
        }
        double diemTB = tongSoDiemMonHoc / diemSoMonHoc.length;
        System.out.printf("Điểm trung bình của 5 môn: %.2f\n", diemTB);
        System.out.println("Điểm cao nhất: " + soDiemCaoNhat);
        System.out.println("Điểm thấp nhất: " +soDiemThapNhat);
        System.out.println("Số môn đạt >= 5.0 là: " + soMonDat);


        //bài tập 3: quản lý thông tin của nhân viên.
        //cho phép người dùng nhập thông tin nhân viên, số giờ làm mỗi ngày trong 1 tuần
        //in ra tổng số giờ làm trong tuần, trung bình giờ làm mỗi ngày, và số ngày làm việc có số giờ làm >= 8.

        int[] soGioLam = new int[7];

        for (int i = 0; i < soGioLam.length; i++){
            System.out.println("Nhập số giờ làm ngày " + (i + 1) + " của nhân viên:");
            soGioLam[i] = sc.nextInt();
        }
        int tongSoGioLam = 0;
        int soNgayLamViecLonHon8 = 0;

        for (int gio : soGioLam){
            tongSoGioLam += gio;

            if (gio >= 8){
                soNgayLamViecLonHon8 ++;
            }
        }
        double soGioLamTrungBinh =  tongSoGioLam / soGioLam.length;
        System.out.println("Tổng số giờ làm trong tuần: " + tongSoGioLam);
        System.out.println("Trung bình giờ làm mỗi ngày: " + soGioLamTrungBinh);
        System.out.println("Số ngày làm việc có số giờ lớn hơn 8: " +soNgayLamViecLonHon8);


        // Ex
        int diem = 85;
        if (diem >= 80){
            System.out.println("Học sinh đạt điều kiện");
        } else {
            System.out.println("Học sinh không đạt điều kiện");
        }
        // toán tử 3 ngôi
        // cú pháp: điều kiện đúng ?  "thực hiện logic A có kết quả" : "thực hiện logic B có kết quả";
        // chỉ nên sử dụng khi logic đơn giản !!!

        String ketQua = diem >= 80? "Học sinh đạt điều kiện" : "Học sinh không đạt điều kiện";
        System.out.println(ketQua);

        //ép kiểu dữ liệu: chuyển đổi một giá trị từ kiểu dữ liệu này sang kiểu dữ liệu khác
        //ép kiểu ngầm định: tự động chuyển đổi kiểu dữ liệu nhỏ hơn sang kiểu dữ liệu lớn hơn (của cùng 1 loại dữ liệu)
        //kiểu dữ liệu là số: byte < short < int < long < float < double
        byte so1 = 10;
        int so2 = so1;
        System.out.println("Giá trị của số 2: " + so2);

        //ép kiểu tường minh: tự động chuyển đổi kiểu dữ liệu lớn hơn sang kiểu dự liệu nhỏ hơn ( cùng 1 kiểu dữ liệu)
        double so3 = 3.14;
        int so4 = (int) so3;   //ép kiểu tường mình từ double sang int
        System.out.println("Giá trị của so4: " + so3);

        //ép từ số sang chỗi hoặc ngược lại
        int so5 = 100;
        String string5 = Integer.toString(5); // cách này phổ biến
        String string5_1 = String.valueOf(5);
        System.out.println("Giá trị của string5: " + string5);

        String string6 = "200";
        int so6= Integer.parseInt(string6);  //ép từ chuỗi sang số
        // cú pháp : kiểu dữ liệu cần chuyển.pare kiểu dữ liệu cần chuyển(giá trị cần chuyển)






    }
}
