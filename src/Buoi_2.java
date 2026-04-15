public class Buoi_2 {
    public static void main(String[] args) {
        //toán tử gán: "="
        String ngay = "Thứ 2: 06.04.2026";
        int soA = 10;
        soA += 5; //tương đương với soA = soA + 5
        System.out.println("soA: " + soA);
        soA -= 3; //tương đương với soA = soA -3
        System.out.println("soA: "  + soA);
        soA *= 2; //tương đương với soA = soA * 2
        System.out.println("soA: " + soA);
        soA /= 4; //tương đương với soA = soA / 4
        System.out.println("soA: " + soA);

        //toán tử logic: &&, ||, ! ( đối với toán tử logic chỉ sử dụng biến với kiêểu dữ liệu là Boolean )
        // &&: Kết hợp tất cả các điều kiện của logic ( gọi là và )
        Boolean logicA = true;
        Boolean logicB = true;
        Boolean logicC = true;
        Boolean result1 = logicA && logicB && logicC;
        System.out.println("Result1: " + result1);

        // ||: (gọi là hoặc ) hoặc logicA hoặc logicB
        Boolean logicD = false;
        Boolean logicE = false;
        Boolean logicF = true;
        Boolean result2 = logicD || logicE || logicF;
        System.out.println("Result2: " + result2);

        // !: (phủ định) đảo ngược giá trị của biến logic
        Boolean logicG = true;
        Boolean result3 = !logicG;
        System.out.println("Result3: " + result3);

        // if else statement:
        //if (điều kiện không đúng) {logicA} else {logicB}
        int soBuoiNghi = 4;
        float diemTB = 8;
        Boolean isQuaMon = diemTB >= 5 && soBuoiNghi <= 4;
        if (isQuaMon){
            //logic A
            System.out.println("Sinh viên đã qua môn");
        } else {
            //logic B
            System.out.println("Sinh viên chưa qua môn");
        }

        //if else if statement:
        // if ( điều kiện A đúng ) {logic A} else if ( điều kiện B đúng) {logic B} else {logic C}

        //switch case statement:
        // switch ( điều kiện cần kiểm tra ) ( mỗi case đều phải có break !!! )
        // case giá trị 1: thực hiện logic 1; break;
        // case giá trị 2: thực hiện logic 2; break;
        // default: thực hiện logic mặc đinh; break; ( chỉ xảy ra default khi k có giá trị nào khớp với điều kiện cần kiểm tra)


        int soC = 2;
        switch (soC) {
            case 1:
                System.out.println("Số C là số 1");
                break;
            case 2:
                System.out.println("Số C là số 2");
                break;
            case 3:
                System.out.println("Số C là số 3");
                break;
            default:
                System.out.println("Số C không phải 1, 2 hoặc là 3");
                break;
        }

        //Vòng lặp: while
        //Cú pháp: while ( điều kiện đúng ) { thực hiện logic }
        // (miễn là điều kiện luôn đúng thì vòng lặp sẽ tiếp tục thực hiện logci)

        int soD = 2;
        while (soD <=3) {
            System.out.println("SoD: " + soD);
            soD++;

        }

        int soE = 1;
        while (soE <= 5) {
            System.out.println("SoE: " + soE);
            soE ++;  //soE++ (sau khi thực hiện logic phía trên thì soE sẽ tăng lên 1 đơn vị) (-- là ngược lại)
                     //-> hậu tố
        }


        // Vòng lặp do...while
        // Cú pháp: do {thực hiện logic} while{điều kiện chính};


        int soF = 1;
        do {
            System.out.println("soF: " + soF);
            soF++;
        }while (soF <= 3);    // điều kện bên trong = false -> vòng lặp sẽ dừng

        // vòng lặp for (*)
        // cú pháp: for (giá trị khởi tạo; điều kiện đúng; giá trị thay đổi) { thực hiện logic }
        // lưu ý: dùng khi biết được số lần lặp cụ thể

        for (int i = 1; i <5; i++ ) {
            System.out.println("i: " + i);

        }
    }
}

