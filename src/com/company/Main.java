package com.company;

public class Main {




    public static void main(String[] args) {
        int i = 0;

        for (i = 1;  i <= 100; i++ ) {


            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 11 == 0) {
                System.out.println("Bong");

            } else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzzBang");
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBang");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Bang");
            } else if (i % 11 == 0){
                System.out.println("Bong");
            } else if (i % 13 == 0){
                System.out.println("Fezz");
            }

                else {
                System.out.println(i);
            }

        }


    }
}
