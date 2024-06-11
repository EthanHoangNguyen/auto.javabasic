package phuongthuc;

public class TinhToan {
    public static int cong2songuyen(int number1, int number2){
        return number1 + number2;
    }
    public static int tich2songuyen(int number3, int number4) {
        return number3 * number4;
    }
    static void welcome(String name) {
        System.out.println("Xin chào" + name);
    }

    public static void main(String[] args) {
        System.out.println(cong2songuyen(20,40));
        System.out.println(tich2songuyen(14,24));

    }
}
