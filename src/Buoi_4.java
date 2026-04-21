import java.util.ArrayList;
import java.util.Collections;
    public class Buoi_4 {
        public static void main(String[] args) {
            //arraylist: là một cấu trúc dữ liệu
            //có thể thay đổi kích thước trong quá trình thực thi chương trình
            //cú pháp: Arraylist<kiểu dữ liệu> tenArraylist = new Arraylist<>();

            //ví dụ: mảng điện thoại: iphone, samsung, xiaomi, oppo, realme

            ArrayList<String> mangDienThoai = new ArrayList<>();

            //thêm phần tử vào Arraylist: sử dụng phuongw thức add()
            //cú pháp: tenArraylist.add(giá trị);
            mangDienThoai.add("iphone");
            mangDienThoai.add("samsung");
            mangDienThoai.add("xiaomi");
            mangDienThoai.add("oppo");
            mangDienThoai.add("realme");
            System.out.println("Giá trị của mảng điện thoại: " + mangDienThoai);

            //thêm vào vị trí cụ thể: sử dụng phương thức add(index, giá trị);
            mangDienThoai.add(1, "nokia"); //
            System.out.println("Giá trị của mảng điện thoại sau khi thêm nokia vào index 1: " + mangDienThoai);

            //cập nhật giá trị trong mảng: sử dụng phương thức set(index, giá trị);
            mangDienThoai.set(3,"huawei");
            System.out.println("Giá trị cuủa mảng điện thoại sau khi cập nhật giá trị index: " +mangDienThoai);

            //xóa phần tử của mảng: sử dụng phương thức remove(index);
            mangDienThoai.remove(4);
            System.out.println("Giá trị của mảng điện thoại sau khi xóa index: " + mangDienThoai);


            //duyệt mảng
            for (String dienThoai : mangDienThoai){
                System.out.println("Tên điện thoại: " + dienThoai);
            }

            //CRUD cho Arraylist: Create, Read, Update, Delete


            //đếm số lượng phần tử bên trong mảng: sử dụng phương thức size();
            int soLuong = mangDienThoai.size();
            System.out.println("Số lượng phần tử bên trong mảng: " + soLuong);

            ArrayList<Integer> mangSo = new ArrayList<>();
            mangSo.add(5);
            mangSo.add(2);
            mangSo.add(8);
            mangSo.add(1);

            //sắp xếp phần tử maảng: sử dụng phương thức sort();

            Collections.sort(mangSo);   //sắp xêp theo thứ tự tăng dần
            System.out.println("Giá trị của mảng điện thoại sau khi sắp xếp: " + mangSo);

            //sau khi sắp xếp tăng dần rồi đảo ngược mảng: sử dụng phương thức reverse();
            Collections.reverse(mangSo);
            System.out.println("Giá trị của mảng điện thoại sau khi sắp xếp theo thứ tự giảm dần: " + mangSo);

            //tìm kiếm phần tử trong mảng: sử dụng phương thức contains();
            boolean ketQua = mangDienThoai.contains("iphone"); //true hoặc false
            boolean ketQua2 = mangDienThoai.contains(2);
            System.out.println("Kết quả tìm kiếm phần tử iphone trong mảng: " + ketQua);
            System.out.println("Kết quả tìm kiến phần tử 2 trong mảng số: " + ketQua2);

        }
    }

