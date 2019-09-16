package com.company;

import java.util.Scanner;

public class Main {

    /*static void input() {
        Scanner Usernum = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int user = Usernum.nextInt();
        System.out.println("Number chosen: "+user);

    }
    static void fizzbuzz() {
        int i = 0;
        String three = "Fizz";
        String five = "Buzz";
        String sev = "Bang";
        String elvn = "Bong";
        String thirt = "Fezz";
        for (i = 1; i <= 256; i++) {

            if (i % 3 == 0) {
                System.out.println(three);
            } else if (i % 5 == 0) {
                System.out.println(five);
            } else if (i % 7 == 0) {
                System.out.println(sev);
            } else if (i % 11 == 0) {
                System.out.println(elvn);
            } else if (i % 13 == 0) {
                System.out.println(thirt);
            } else {
                System.out.println(i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(three+five);
            } else if (i % 3 ==0 && i % 7 == 0) {
                System.out.println(three+sev);
            } else if (i % 3 == 0 && i % 11 == 0) {
                System.out.println(elvn);
            } else if (i % 3 == 0 && i % 13 == 0) {
                System.out.println(three+thirt);
            }
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(five+sev);
            } else if ( i % 5 == 0 && i % 11 == 0) {
                System.out.println(elvn);
            } else if ( i % 5 == 0 && i % 13 == 0) {
                System.out.println(thirt+five);
            }
            if (i % 7 == 0 && i % 11 == 0){
                System.out.println(elvn);
            } else if (i % 7 == 0 && i % 13 == 0) {
                System.out.println(thirt+sev);
            }
            if (i % 11 == 0 && i % 13 == 0){
                System.out.println(thirt+elvn);
            }

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
                System.out.println(three+five+sev);
            }else if (i % 3 == 0 && i % 5 == 0 && i % 11 == 0) {
                System.out.println(elvn);
            }else if (i % 3 == 0 && i % 5 == 0 && i % 13 == 0) {
                System.out.println(three+thirt+five);
            }else if (i % 3 == 0 && i % 5 == 0 && i % 17 == 0) {
                System.out.println(five+three);
            } else if (i % 3 == 0 && i % 7 == 0 && i % 11 == 0){
                System.out.println(elvn);
            }else if (i % 3 == 0 && i % 7 ==0 && i % 13 == 0){
                System.out.println(three+thirt+sev);
            } else if (i % 3 == 0 && i % 11 == 0 && i % 13 == 0)
                System.out.println(thirt+elvn);
        }

        if (i % 5 == 0 && i % 7 == 0 && i % 11 == 0){
            System.out.println(elvn);
        } else if (i % 5 == 0 && i % 7 == 0 && i % 13 == 0) {
            System.out.println(thirt+five+sev);
        } else if (i % 5 == 0 && i % 11 == 0 && i % 13 == 0) {
            System.out.println(thirt+elvn);
        }


    }*/

    public static void main(String[] args) {
        //fizzbuzz();

        int i = 0;
        String three = "Fizz";
        String five = "Buzz";
        String sev = "Bang";
        String elvn = "Bong";
        String thirt = "Fezz";


        for (i = 1; i <= 100; i++) {
            boolean hasenteredrule = false;

            if (i % 3 == 0) {
                System.out.println(three);
                hasenteredrule = true;
            }

            if (i % 5 == 0) {
                System.out.println(five);
                hasenteredrule = true;
            }
            if (i % 7 == 0) {
                System.out.println(sev);
                hasenteredrule = true;
            }
            if (i % 11 == 0) {
                System.out.println(elvn);
                hasenteredrule = true;
            }
            if (i % 13 == 0) {
                System.out.println(thirt);
                hasenteredrule = true;
            }
            if (hasenteredrule == false) {
                System.out.println(i);

            }
        }
    }
}

