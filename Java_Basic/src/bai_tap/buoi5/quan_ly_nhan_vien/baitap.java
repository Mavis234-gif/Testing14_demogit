package bai_tap.buoi5.quan_ly_nhan_vien;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        //bài tập quản lý nhân viên với menu
        //1. thêm nhân viên
        //2. hiển thị danh sách nhân viên
        //3. xóa nhân viên dựa vào id
        //4. tìm kiếm nhân viên dựa vào id
        //5. tìm nhân viên có tổng lương cao nhất
        //6. tìm nhân viên có số giờ làm thấp nhất
        //7. sắp xếp nhân viên theo tên
        //8. sắp xếp nhân viên theo số giờ làm
        //9. cập nhật thông tin nhân viên dựa vào id
        //10. cập nhật số giờ làm của nhân viên dựa vào id
        //11. hiển thị ra nhân viên có tổng số giờ làm lớn hơn 120 giờ
        //12. hiển thị ra nhân viên có tổng số giờ làm nhỏ hơn 80 giờ
        //13. thoát khỏi chương trình
        //nhân viên = {id, name, age, address, salaryPerHours, totalWorkingHours
        Scanner sc = new Scanner(System.in);
        quanLyNhanVien qlnv = new quanLyNhanVien();
        int choice;
        //do...while
        do{
            System.out.println("----MENU QUẢN LÝ NHÂN VIÊN----");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Hiển thị danh sách nhân viên");
            System.out.println("3.Xóa nhân viên theo ID");
            System.out.println("4.Tìm kiếm nhân viên theo ID");
            System.out.println("5.Tìm nhân viên có tổng lương cao nhất");
            System.out.println("6.Tìm nhân viên có số giờ làm thấp nhất");
            System.out.println("7.Sắp xếp nhân viên theo tên");
            System.out.println("8.Sắp xếp nhân viên theo số giờ làm");
            System.out.println("9.Cập nhật thông tin nhân viên dựa vào id");
            System.out.println("10.Cập nhật số giờ làm của nhân viên dựa vào id");
            System.out.println("11.Hiển thị ra nhân viên có tổng số giờ làm lớn hơn 120 giờ");
            System.out.println("12.Hiển thị ra nhân viên có tổng số giờ làm nhỏ hơn 80 giờ");
            System.out.println("13.Thoát khỏi chương trình");
            System.out.println("Vui lòng chọn chức năng");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    qlnv.themNhanVien(sc);
                    break;
                case 2:
                    qlnv.hienThiDanhSachNhanVien();
                    break;
                case 3:
                    qlnv.xoaNhanVienTheoId(sc);
                    break;
                case 4:
                    qlnv.timNhanVienTheoId(sc);
                    break;
                case 5:
                    qlnv.timNhanVienCoTongLuongCaoNhat();
                    break;
                case 6:
                    qlnv.timNhanVienCoSoGioLamThapNhat();
                    break;
                case 7:
                    qlnv.sapXepNhanVienTheoTen();
                    break;
                case 8:
                    qlnv.sapXepNhanVienTheoSoGioLam();
                    break;
                case 9:
                    qlnv.capNhatThongTinNhanVien(sc);
                    break;
                case 11:
                    qlnv.hienThiNhanVienCoSoGioLamLonHon120Gio();
                    break;
                case 13:
                    System.out.println("Thoát khỏi chương trình. Hẹn gặp lại! ");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại! ");
            }
        }while(choice != 13);
    }
}
