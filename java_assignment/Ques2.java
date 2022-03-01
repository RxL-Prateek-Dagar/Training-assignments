package com.company;


import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        ArrayList<String> empName =new ArrayList<String>();
        empName.add("rakesh");
        empName.add("ramesh");
        empName.add("suresh");
        System.out.println(empName);
        empName.add(0,"amar");
        System.out.println(empName);

        System.out.println(empName.get(3));


        empName.remove(1);
        System.out.println(empName);
        empName.remove(String.valueOf("ramesh"));
        System.out.println(empName);

        empName.set(1,"rajesh");
        System.out.println(empName);

        System.out.println(empName.size());



    }
}
