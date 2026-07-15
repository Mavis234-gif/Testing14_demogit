package bai_tap.buoi5.quan_ly_nhan_vien;

import java.util.ArrayList;
import java.util.Scanner;

public class quanLyNhanVien {
    //thuộc tính
    private ArrayList<nhanVien> danhSachNhanVien = new ArrayList<>();

    //phương thức
    //1. thêm nhân viên
    public void themNhanVien(Scanner sc) {
        System.out.println("Nhập ID nhân viên");
        String id = sc.nextLine();

        //kiểm tra id đã tồn tại hay chưa
        if(timNhanVienTheoId(id) !=null){
            System.out.println("ID đã tồn tại. Vui lòng nhập lại");
            return; //dừng phương thức nếu ID đã tồn tại
        }

        //nếu chưa tồn tại thì thêm mới vào
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Nhập lương theo giờ: ");
        double salaryPerHours = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tổng số giờ làm việc: ");
        double totalWorkingHours = Integer.parseInt(sc.nextLine());
        nhanVien nv = new nhanVien(id, name, age, address, salaryPerHours, totalWorkingHours);
        danhSachNhanVien.add(nv);
        System.out.println("Thêm nhân viên thành công");
    }

    //2. hiển thị danh sách nhân viên
    public void hienThiDanhSachNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống. ");
            return; //dừng phương thức
        }
        for (nhanVien nv : danhSachNhanVien) {
            nv.displayInfo();
        }
    }
    //3.Xóa nhân viên theo Id
    public void xoaNhanVienTheoId(Scanner sc){
        System.out.println("Nhập ID nhân vien cần xóa: ");
        String id = sc.nextLine();
        //đặt cờ hiệu: là chưa tìm thấy = false
        boolean found = false;
        for (nhanVien nv : danhSachNhanVien){
            if (nv.getId().equals(id)){
                danhSachNhanVien.remove(nv);
                System.out.println("Xóa nhân viên thành công!");
                found = true;
                break;
            }
        }
    }

    //4. tìm kiến nhân viên dựa vào id
    public void timNhanVienTheoId(Scanner sc) {
        System.out.println("Nhập ID nhân viên: ");
        String id = sc.nextLine();
        //đặt cờ hiệu: là chưa tìm thấy = false
        boolean found = false;
        for (nhanVien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                nv.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với ID: " + id);
        }
    }

    //tìm nhân viên theo ID
    public nhanVien timNhanVienTheoId(String id) {
        for (nhanVien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                return nv; //trả về nhân viên nếu tìm thấy
            }
        }
        return null; //trả về null nếu không tìm thấy
    }
    //5.Tìm nhân viên có tổng lương cao nhất
    public void timNhanVienCoTongLuongCaoNhat(){
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên trống. ");
            return; //dừng phương thức
        }
        nhanVien maxNV = danhSachNhanVien.get(0);
        //tìm kiếm
        for(nhanVien nv : danhSachNhanVien){
           if (nv.calculateSalary() > maxNV.calculateSalary()){
               maxNV = nv;
           };
        }
        System.out.println("Nhân viên có tổng lương cao nhất");
        maxNV.displayInfo();
    }
    //6.Tìm nhân viên có số giờ làm thấp nhất
    public void timNhanVienCoSoGioLamThapNhat(){
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên rỗng.");
            return; //dừng phương thức
        }

        nhanVien minNV = danhSachNhanVien.get(0);

        //tìm kiếm
        for (nhanVien nv : danhSachNhanVien){
            if (nv.getTotalWorkingHours() < minNV.getTotalWorkingHours()){
                minNV = nv;
            };
        }
        System.out.println("Nhân viên có số giờ làm thấp nhất: ");
        minNV.displayInfo();
    }

    //7.Sắp xếp nhân viên theo tên
    public void sapXepNhanVienTheoTen(){
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên trống.");
            return;
        }
        //sắp xếp theo tên
        //Cú pháp sort trên Arraylist
        //Arraylist.sort( (phần tử 1, phần tử 2) -> {//thực hiện logic so sánh giữa phần tử 1 và phần tử 2)
        //Sẽ -1 nếu phần tử 1 < = phần tử 2
        //Sẽ 0 nếu phần tử 1 = phần tử 2
        //Sẽ 1 nếu phần tử 1 > phần tử 2
        danhSachNhanVien.sort((nhanVien nv1, nhanVien nv2) -> nv1.getName().compareTo(nv2.getName()));
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo tên");
        hienThiDanhSachNhanVien();
    }
    //8.Sắp xếp nhân viên theo số giờ làm
    public void sapXepNhanVienTheoSoGioLam() {
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return;
        }
        //sắp xếp nhân viên theo số giờ làm
        danhSachNhanVien.sort((nhanVien nv1, nhanVien nv2) -> Double.compare(nv1.getTotalWorkingHours(), nv2.getTotalWorkingHours()));
        System.out.println("Danh sách nhân viên theo số giờ làm");
        hienThiDanhSachNhanVien();
    }
    //9.Cập nhật thông tin nhân viên
    public void capNhatThongTinNhanVien(Scanner sc){
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()){
            return;
        }
        //tìm thấy nhân viên cần cập nhật ID hoặc tên để tìm kiếm
        System.out.println("Nhập ID nhân viên cần cập nhật: ");
        String id = sc.nextLine();
        nhanVien nv = timNhanVienTheoId(id); //nv {id, name,...}
        //Kiểm tra có tìm thấy nhân viên hay không
        if (nv == null){
            System.out.println("Không tìm thấy nhân viên với ID: " + id);
            return;
        }
        //Nếu tìm thấy thì cập nhật thông tin
        System.out.println("Nhập tên mới: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi mới: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ mới: ");
        String address = sc.nextLine();
        System.out.println("Nhập lương/giờ mới: ");
        double salaryPerHours = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập tổng số giờ làm mới: ");
        double totalWorkinghours = Double.parseDouble(sc.nextLine());
        //Cập nhật thông tin bằng cách một đối tượng nhân viên mới
        nv = new nhanVien(id, name, age, address, salaryPerHours, totalWorkinghours); //***

        //Cập nhật lại thông tin nhân viên trong danh sách
        for(int i = 0; i < danhSachNhanVien.size(); i++){
            if (danhSachNhanVien.get(i).getId().equals(id)){
                danhSachNhanVien.set(i, nv); // cập nhật thông tin nhân viên taại
                break;
            }
        }
        System.out.println("Cập nhật thông tin nhân viên thành công! ");
    }
        public void capNhatSoGioLamCuaNhanVienDuaVaoID(){

        }
    //11.Hiển thị ra nhân viên có tổng số giờ làm lớn hơn 120 giờ
    public void hienThiNhanVienCoSoGioLamLonHon120Gio(){
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên trống.");
            return;
        }
        System.out.println("Danh sách nhân viên có tổng số giờ làm lớn hơn 120 giờ: ");
        //lưu ý: sẽ tạo ra 1 danh sách mới để lưu trữ
        ArrayList<nhanVien> dsNhanVienCoSoGioLamLonHon120 = new ArrayList<>();
        for (nhanVien nv : danhSachNhanVien){
            if (nv.getTotalWorkingHours() > 120){
                dsNhanVienCoSoGioLamLonHon120.add(nv);
            }

        }
        //duyệt mảng mới để hiển thị ra thông tin nhân viên đạt yêu cầu đề bài
        if (dsNhanVienCoSoGioLamLonHon120.isEmpty()){
            System.out.println("Không có nhân viên nào có tổng số giờ lớn hơn 120 giờ.");
        }else {
            for (nhanVien nv : dsNhanVienCoSoGioLamLonHon120){
                nv.displayInfo();
            }
        }
    }
}


