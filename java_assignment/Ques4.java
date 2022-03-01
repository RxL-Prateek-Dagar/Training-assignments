package com.company;
import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
//        ArrayList<Integer> lis =new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(4);
        list1.add(1);
        list1.add(56);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(56);
        list2.add(8);
        list2.add(2);
        list2.add(4);
        list2.add(3);

        System.out.println(list1);
        System.out.println(list2);
        list1.retainAll(list2);
        System.out.println(list1);


    }
}
