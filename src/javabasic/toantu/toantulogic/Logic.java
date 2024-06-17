package javabasic.toantu.toantulogic;

public class Logic {

    public static void main(String[] args) {
        String message1 = "Login successful";
        String message2 = "Login successfully";
        int number1 = 10;
        int number2 = 20;
        int number3 = 10;

        //toan tu và &&
    /*
     _ Chỉ đúng khi tất cả các điều kện đều đúng, ngược lại False
     _ Dùng để kết hợp các điều kiện laại với nhau theo kiểu tất cả đều đúng.
     */
        System.out.println((message1 == message2) && (number1 <= number3));

        //Toán tử Hoặc
    /*
    _ Toán tử Hoặc sẽ đúng khi chỉ cần 1 trong các điều kiện đúng, ngược lại chỉ False khi tất cả đều sai
    _ Dùng để kết hợp caác đi kiện lại với nhau (trên cùng 1 loại điêu kiện)
     */
        System.out.println((message1 == message2) || (number1 <= number2));
    }
}