package com.example.demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Object o = new Scanner(System.in);
//
//        ((Scanner) o).nextInt(); //приведение типа
//
//        Scanner scanner = null;
//
//        if (o instanceof Scanner) scanner = (Scanner) o; //проверим что объект принадлежит классу
//
//        if (scanner != null) {
//            scanner.nextInt();
//        }
//
//       // ((String) o).length();
//
//
//        Object o1 = new String();

        Object[] objects = {10, "Hello", 3.14};

        for(Object o:objects){
            if(o instanceof String) {
                String s = (String) o;
                System.out.println(s);
            }
        }

        ArrayList<Integer> numbers = new ArrayList();

        for (int i=0; i<10; i++) {

            numbers.add(i*10);

        }

        int sum = 0;
        for (Integer o : numbers) {
//        for (Object o : numbers) {
//            sum = sum + (Integer) o;
//            System.out.println((Integer) o);
            sum = sum + o;
        }

        System.out.println(sum);

        ArrayList<String> listHello = new ArrayList<>();
        listHello.add("Hello");
        listHello.add("Hi");

        ArrayList<String> listBye = new ArrayList<>();
        listBye.add("Good bye");
        listBye.add("Bye");

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(listHello);
        list.add(listBye);

        for(ArrayList<String> spisok:list) {
            for (String s : spisok)
            System.out.println(s);
        }


    }

}
