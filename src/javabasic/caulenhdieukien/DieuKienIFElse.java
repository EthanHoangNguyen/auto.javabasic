package javabasic.caulenhdieukien;

public class DieuKienIFElse {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
        String message = "Add category successful";

        if((number1 < number2) && message.equals("Add success")){
            System.out.println("Thỏa điều kiện");
        }

        if((number1 < number2) && message.equals("Add success")) {
            System.out.println("Thỏa điều kiện");
        }else {
            System.out.println("Không thỏa điều kiện");
        }

    }
}
