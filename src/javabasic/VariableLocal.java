package javabasic;

public class VariableLocal {

    public void sayHello() {
        int n = 10; //đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }



    public static void main(String[] args) {

        String name = "Phương"; //Biến cục bộ
        VariableLocal bienlocal = new VariableLocal();
        bienlocal.sayHello();
    }
}
