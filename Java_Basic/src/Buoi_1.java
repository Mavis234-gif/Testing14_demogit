import java.util.Scanner;
public class Buoi_1 {

        //comment code: ctrl + /
        //snippet code: gõ code nhanh
        //main + enter/tab: tạo hàm main nhanh

    public static void main(String[] args) {
        System.out.println("Im New");
        System.out.println("Hello Im Mavis");
        //biến: là một khu vực để lưu trữ dữ liệu trên bộ nhớ
        //cú pháp: <kiểu dữ liệu> <tên biến> = <giá trị>;
        //chuỗi: String
        //số: int ( số nguyên ), float/double ( số thập phân )
        //float: 7-8 số sau dấu phẩy
        //double: 15-16 số sau  dấu phẩy
        //boolean: true/false

        //tạo ra biến tên là hoTen
        String hoTen = "Mavis Nguyễn";
        String diaChi = "Hồ Chí Minh";
        int tuoi = 23;
        System.out.println(hoTen);
        System.out.println(diaChi);
        System.out.println(tuoi);

        Boolean isStudent = true;
        Boolean isLogin = false;
        System.out.println("Họ và Tên: " + hoTen);

        //Scanner: dùng để nhận dữ liệu từ người dùng
        // ví dụ: nhập và in thông tin học sinh, bao  gồm: họ tên, tuổi, trường, lớp
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String fullName = sc.nextLine();    //nhận dữ liệu dạng chỗi

        //tuoi
        System.out.println("Nhập age: ");
        int age = sc.nextInt();     //kiểu  dữ liệu là số

        sc.nextLine();

        //truong
        System.out.println("Nhập trường: ");
        String truong = sc.nextLine();

        //lop
        System.out.println("Nhập lớp: ");
        String lop = sc.nextLine();

        System.out.println("Họ và Tên: " + fullName);
        System.out.println("Nhập tuổi: " + age);
        System.out.println("Nhập trường: " + truong);
        System.out.println("Nhập lớp: " + lop);
        System.out.println("Họ và Tên: " + fullName + ", tuổi: " + age + ", trường: " + truong + ", lớp: " + lop);

        //toán tử
        //1.Toán tử số học: +, -, x, /, %
        int A = 5;
        int B = 10;
        int tinhTong = A + B;
        int tinhHieu = A - B;
        int tinhTich = A * B;
        int tinhThuong = A / B;
        //%: chia lấy dư
        int tinhDu = A % B;
        System.out.println("Tổng: " + tinhTong + ", Hiệu: " + tinhHieu + ", Tích: " + tinhTich + ", Thương: " + tinhThuong + ", Dư: " + tinhDu);

        //2.Toán tử so sánh
        //so sánh: ==
        Boolean result1 = A == B;  //true or false
        System.out.println(result1 );

        //so sánh khác: !=
        Boolean result2 = A != B;
        System.out.println("result2: " + result2);

        //so sánh lớn hơn, bé hơn, lớn hơn bằng, bé hơn bằng
        Boolean result3 = A > B;
        Boolean result4 = A >= B;
        Boolean result5 = A <= B;
        System.out.println("result3: " + result3 + ", result4: " + result4 + ", result5: " + result5);

        String a = "Hello";
        String b = "Hello";
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        String c = new String("Hello");
        System.out.println(System.identityHashCode(c));  //System.identityHashCode: tìm tới vị trí trên String pool
        Boolean result6 = a == b;
        Boolean result7 = a != b;
        boolean result8 = c ==b;
        boolean result9 = b.equals(c);
        System.out.println("Result6: " + result6 + ", Result7: " + result7);
        System.out.println("Result8: " + result8);
        System.out.println("Result9: " + result9);

    }
}