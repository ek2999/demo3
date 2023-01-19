package com.example.demo3;

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

    }

}
