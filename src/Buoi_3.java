import java.util.Arrays;

public class Buoi_3 {
    public static void main(String[] args) {
        int soA = 10;
        int soB = 20;
        // array: mảng, là một cấu trúc dữ liệu dùng để lưu trữ nhiều giá trị cùng kiểu dữ liệu
        // cùng 1 mục đích sử dụng
        // khai báo biến: kiểu dữ liệu tenBien = giá trị;
        // khai báo mảng: kiểu dữ liệu[] tenMang = new kiểu dữ liệu [số luượng phân tử]; -> số lượng phần tử của mảng
        // vị trí của giá trị trong 1 mảng được gọi là index, bắt đầu từ số 0
        int[] mangSo= new int[5];
        mangSo[0] = 1;
        mangSo[1] = 2;
        mangSo[2] = 3;
        mangSo[3] = 4;
        mangSo[4] = 5;
        System.out.println("Giá trị của phần tử có index là: " + mangSo[1]);
        System.out.println("Giá trị của phần tử có index là: " + Arrays.toString(mangSo));

        // khai báo mảng: kiểu dữ liệu[] tenMang = {giá trị 1, giá trị 2,...};
        String[] mangTen = {"Mavis Nguyễn", "Bi Đặng", "Wy péo"};
        mangTen[0] = "Mavis Nguyễn";
        System.out.println("Giá trị của phần tử có index 0 là: " + mangTen[0]);
        System.out.println("Số lượng phần tử của mảng: " + mangTen.length);
                                                               // .length: trả về số lượng phần tử của mảng

        //duyệt mảng: sử dụng vòng lặp for để duyệt qua các phần tử bên trong mảng
        for(int i = 0; i < mangTen.length; i++ ) {
            System.out.println("Phần tử có index " + i + ", là: " + mangTen[i]);

        //for...each
        // cú pháp: for (kiểu dữ liệu tenBien: tenMang){logic sử dụng tenBien}
            for (String ten : mangTen){
                System.out.println("Tên học sinh: " + ten);
            }
        }

    }
}
