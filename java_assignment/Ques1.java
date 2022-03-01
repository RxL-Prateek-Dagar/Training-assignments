package com.company;
import java.util.*;


public class Ques1 {

    public static void main (String[] args) {
        Stack<String> placeName =new Stack<String>();

        placeName.push("Delihi");
        placeName.push("New Delihi");
        placeName.push("Goa");
        placeName.push("Mumbai");
        placeName.push("Noida");
        System.out.println(placeName);

        System.out.println(placeName.peek());
        placeName.pop();

        System.out.println(placeName.peek());
        System.out.println(placeName);

        placeName.push("Gurugram");
        System.out.println(placeName.peek());
        System.out.println(placeName);

    }





    public static void main (String[] args) {
        Queue<String> qName = new LinkedList<String>();

            qName.offer("address");
            qName.offer("name");
            qName.offer("location");
            qName.offer("ID");
            System.out.println(qName);

            System.out.println(qName.peek());

            qName.poll();
            System.out.println(qName);



    }
    }



