package bai_tap.buoi5;

import java.util.ArrayList;
import java.util.Scanner;

public class quanLySinhVien {
    private static ArrayList<sinhVien> danhSachSinhVien = new ArrayList<>();

    // 1. Thêm sinh viên
    public static void themSinhVien(Scanner sc) {
        sinhVien sv = new sinhVien();
        sv.input(sc);
        danhSachSinhVien.add(sv);
        System.out.println("Thêm sinh viên thành công! ");
    }

    // 2. Hiển thị danh sách
    public static void hienThiDanhSachSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng! ");
        } else {
            for (sinhVien sv : danhSachSinhVien) {
                sv.display();
            }
        }
    }

    // 3. Tìm sinh viên
    public static void timSinhVien(Scanner sc) {
        System.out.println("Nhập ID sinh viên cần tìm: ");
        String id = sc.nextLine();
        boolean found = false;
        for (sinhVien sv : danhSachSinhVien) {
            if (sv.getId().equals(id)) {
                System.out.println("--- Kết quả tìm kiếm ---");
                sv.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào có ID: " + id);
        }
    }

    // 4. Xóa sinh viên
    public static void xoaSinhVien(Scanner sc) {
        System.out.println("Nhập id sinh viên cần xóa: ");
        String id = sc.nextLine();
        boolean found = false;
        for (sinhVien sv : danhSachSinhVien) {
            if (sv.getId().equals(id)) {
                danhSachSinhVien.remove(sv);
                System.out.println("Xóa sinh viên thành công! ");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với id: " + id);
        }
    }
}