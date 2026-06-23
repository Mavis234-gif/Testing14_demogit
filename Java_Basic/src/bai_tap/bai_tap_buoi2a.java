package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi2a {
    public static void main(String[] args){
        // ví dụ: xếp loại học sinh
        // Điểm trung bình < 5: yếu
        // Điểm trung bình >= 5 - < 7: trung bình
        // Điểm trung bình >= 7 - < 8: khá
        // Điểm trung bình >= 8: giỏi
        // Cho nhập họ tên, điểm 3 môn: Toán, Văn, Anh

        //Input:
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String hoTen = sc.nextLine();

        System.out.println("Nhập điểm toán: ");
        double diemToan = sc.nextDouble();

        System.out.println("Nhập điểm Văn: ");
        double diemVan = sc.nextDouble();

        System.out.println("Nhập điểm Anh: ");
        double diemAnh = sc.nextDouble();


        //Process:
        double diemTB = (diemToan + diemVan + diemAnh) / 3;
        String xepLoai = "";

        if (diemTB < 5){
            xepLoai = "Yếu";
        } else if (diemTB >= 5 && diemTB < 7) {
            xepLoai = "Trung Bình";
        } else if (diemTB >= 7 && diemTB <8) {
            xepLoai = "Khá";
        } else if (diemTB >= 8) {
            xepLoai = "Giỏi";
        } else {
            xepLoai = "Điểm không hợp lệ - Vui lòng nhập lại điểm";
        }

        //Output:
        System.out.printf("Học lực " + hoTen + ", Có xếp loại là: %.1f\n ", diemTB);


        //Bài 1: tính tiền điện
        //số điện tiêu thụ <= 50 thì giá điện là 1000đ/kw
        //nếu số điện tiêu thụ <= 100 thì giá điện là 1200đ/kw
        //nếu số điện tiêu thụ > 100 thì giá điện là 1500đ/kw

        //Input:
        System.out.println("Nhập số điện tiêu thụ(kWh: ");
        double soDien = sc.nextDouble();
        double tongTien = 0;

        //Process:
        if (soDien <= 50){
            //Bậc 1:
            tongTien = soDien * 1000;
        } else if (soDien <= 100) {
            // Bậc 2:
            tongTien = soDien * 1200;
        } else {    //else là điều kiện cuối cùng không nằm trong 2 cái trên nên Java tự hiểu
            // Bậc 3:
            tongTien = soDien * 1500;
        }

        //Output:
        System.out.printf("Tổng tiền điện là: %,.1f\n ", tongTien);



        //Bài 2: tính tiền taxi
        //điều kiện cho 1km đầu tiên: là 20000vnd/km
        //từ km thứ 2 - km thứ 5: là 15000vnd/km
        //từ km thứ 5- km thứ 10: 12000vnd/km
        //từ km thứ 10 trở đi: 10000vnd/km


        //Input:
        System.out.println("Nhập số km: ");
        double tongSoKm = sc.nextDouble();
        double total = 0;

        //Process:
        if (tongSoKm <= 1 ){
            //Km đầu tiên
            total = tongSoKm * 20000;
        } else if (tongSoKm <= 5) {
            //km thứ 2- km thứ 5
            total = 20000 + (tongSoKm - 1) * 15000;
        } else if (tongSoKm <= 10) {
            //km thứ 5 - km thứ 10
            total = 20000 + 4 * 15000 + (tongSoKm - 5) * 12000;
        }else if ( tongSoKm > 10) {
            total = 20000 + 4 * 15000 + 5 * 12000 + (tongSoKm - 10) * 10000;
        }

        //Output
        System.out.printf("Tổng số tiền phải trả là: %,.1f\n ", total);
    }
}
