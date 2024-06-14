package javabasic.learn_collection;

import java.util.ArrayList;

public class ViDuArrayList {
    public static void main(String[] args) {

        //khai báo array list
        ArrayList<String> arrayList = new ArrayList<>();

        //thêm phần tử vào arrayList
        arrayList.add("Selenium");
        arrayList.add("Playwright");
        arrayList.add("Selenium");
        arrayList.add("Cypress");
        arrayList.add("Selenium");
        arrayList.add("Selenium");
        arrayList.add("Selenium");

        arrayList.add(1, "Katalon");
        arrayList.add(3, "Katalon");

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //Khai báo thêm arraylist thứ 2
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");

        arrayList.addAll(arrayList2);

        System.out.println("---------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //remove một phần tử trong arrayList
        arrayList.remove("Selenium");
        arrayList.remove(1);

        System.out.println("---------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //Remove có điều kiện
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).equals("Selenium")){
                arrayList.remove(i);
            }
        }
        System.out.println("---------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
