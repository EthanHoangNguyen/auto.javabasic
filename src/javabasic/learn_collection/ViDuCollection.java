package javabasic.learn_collection;

import java.util.*;

public class ViDuCollection {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.println("\t" + arrayList + "\n");

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.println("\t" + linkedList + "\n");

        Set<Integer> integerSet = new HashSet<>(); //Hashset thì ko lưu theo thứ tự


    }
}
