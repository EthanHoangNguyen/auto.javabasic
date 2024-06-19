package javabasic.caulenhdieukien;

public class BaiTapIfElse {

    static int number = 100;
    private static int n;
    static int number1 = n;


    public static void main(String[] args) {
        int n = 200;
        if (n > number){
            System.out.println("Số điểm của bạn đã đủ để qua môn");

        } else {
            System.out.println("Bạn đã trượt");
        }

    }
}
