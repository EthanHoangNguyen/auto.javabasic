package javabasic.caulenhdieukien;

public class SwitchCase {
    public static void main(String[] args) {
        int number = 20;

        switch (number) {
            case 10:
                System.out.println("10");
                break; // dùng thoát câu lệnh Switch, ko xet các case khác nữa
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }
}
