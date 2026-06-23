public class Buoi_5 {
    public static void main(String[] args) {
            // 4 tính chất cu oop: tính đóng gói, tính kế thừa, tính đa hình, tính trừu tượng

        //tính đóng gói
        student st1 = new student("Mavis Nguyen", 20, "CNTT19");
        String name = st1.getName();
        System.out.println("Họ tên: " + name);

        //tính kế thừa
        giamDoc gd1 = new giamDoc("Mavis",35,"Phòng kinh doanh","Giám đốc");
        gd1.thongTinNhanVien();
    }
}

//tính đóng gói: chỉ cho phép truy cập các thuộc tính của đối tượng thông qua phương thức
class student {
    // thuộc tính
    private String name;
    private int age;
    private String lop;

    //constructor
    public student (String name, int age, String lop){
        this.name = name;
        this.age = age;
        this.lop = lop;
    }

    //tạo ra phương thức để truy cập vào thuộc tính
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getLop(){
        return lop;
    }

    //Có 3 cách gán giá trị cho thuộc tính
    //1. gán trược tiếp vào trong class(không sử dụng)
    //2. gán trực tiếp khi tạo đối tượng(constructor) (phổ biến nhất)
    //3. gán thông qua phương thức setter (sử dụng phương thức có giá trị trả về)



}

//tính kế thừa: cho phép tạo lớp mới từ lớp đã tồn tại và kế thừa toàn bộ phương thuộc tính và phương thức của lớp cha
class nhanVien{
    //thuộc tính
    public String name;
    private int age;
    private String phongBan;

    //constructor
    public nhanVien(String name, int age, String phongBan){
        this.name = name;
        this.age = age;
        this.phongBan = phongBan;
    }
    //phương thức
    public void thongTinNhanVien(){
        System.out.println("Đây là nhân viên");
    }
}

class giamDoc extends nhanVien{
    //thuộc tính
    private String chucVu;

    //constructor
    public giamDoc(String name, int age, String phongBan, String chucVu){
        //super: dùng để gọi constructor của lớp cha, phải được đặt ở dòng đầu tiên của constructor của lớp con
        super(name, age, phongBan);
        this.chucVu = chucVu;
    } //gọi constructor của lớp cha để khởi tạo

    //phương thức
//    public void thongTinGiamDoc(){
//        System.out.println("Đây là giám đốc");
//    }
    //sử dụng lại phương thức của lớp cha và ghi đè phương thức
    @Override
    public void thongTinNhanVien(){
        System.out.println("Đây là giám đốc");
    }
}

//tính đa hình: một hành động/phương thức đều có nhiều cách thực hiện khác nhau sử @Overrider để ghi đè
//tính trừu tượng: chỉ cần khai báo các phương thức mà k cần triển khai chi tiết, việc triển khai để lớp con
//tính diện tích của 1 hình trong hình học
abstract class hinhHoc{
    //thuộc tính
    public String tenHinh;
    public int canhA;
    public int canhB;

    //constructor
    public hinhHoc(String tenHinh, int canhA, int canhB){
        this.tenHinh = tenHinh;
        this.canhA = canhA;
        this.canhB = canhB;}

    //phương thức
        abstract public int tinhDienTich(); //phương thức trừu tượng

}
    class hinhChuNhat extends hinhHoc{
    //constructor
        public hinhChuNhat(String tenHinh, int canhA, int canhB){
            super(tenHinh, canhA, canhB);
        }

        //triển khai phương thức trừu tượng
        @Override
        public int tinhDienTich(){
            return canhA * canhB;
        }
    }

    class hinhVuong extends hinhHoc{
    //constructor
        public hinhVuong(String tenHinh, int canhA, int canhB){
            super(tenHinh, canhA, canhB);
        }

        //triển khai phương thức trừu tượng
        @Override
        public int tinhDienTich(){
            return canhA * canhA;
        }
    }

