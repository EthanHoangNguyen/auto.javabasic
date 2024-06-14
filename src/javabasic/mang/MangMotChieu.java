package javabasic.mang;

public class MangMotChieu {
    public static void main(String[] args) {

        //khai báo manger lưu giá trị số nguyên
        int songuyen[] = new int[10];

        //gán giá trị vào mảng
        songuyen[0] = 5; //gán giá trị 5 vào vị trí thứ nhât (mảng bắt đầu từ 0)
        songuyen[1] = 2;
        songuyen[5] = 10;

        // Gán giá trị thông qua FOR
        for (int i = 0; i < songuyen.length; i++){
            songuyen[i] = 5;
        }

        System.out.println(songuyen[5]); //Lấy ra giá tr tại vị trí cụ thể

        //Truy xuất giá trị trong mảng
        for(int i = 0; i < 10; i++){
            System.out.println(songuyen[i]);
        }
    }
}
