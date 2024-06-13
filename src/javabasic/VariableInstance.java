package javabasic;

public class VariableInstance {

    //Biến toàn cục
    String name = "Phương";
    int age = 30;
    String address = "Hà Nội";

    public void getInfo1() {


    }

    public static void main(String[] args) {

        VariableInstance BienToanCuc = new VariableInstance ();
        System.out.println("Name: " + BienToanCuc.name);


    }
}
