package com.company;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

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

        for (int i = 1; i <= 256; i++) {
         /*String[] fizzbuzz = {"Fizz", "Fezz", "Buzz", "Bang", "Bong"};
         List<String> list = Arrays.asList("Fizz", "Fezz", "Buzz", "Bang", "Bong");*/
            List<String> fizzbuzz = new ArrayList<>();
            List<String> buzzfizz = new ArrayList<>();
            fizzbuzz.add("Fizz");
            fizzbuzz.add("Fezz");
            fizzbuzz.add("Buzz");
            fizzbuzz.add("Bang");
            fizzbuzz.add("FezzBong");

            String output = "";

            if (i % 3 == 0) output += fizzbuzz.get(0);
            if (i % 13 == 0) output += fizzbuzz.get(1);
            if (i % 5 == 0) output += fizzbuzz.get(2);
            if (i % 7 == 0) output += fizzbuzz.get(3);
            if (i % 11 == 0 && i % 13 == 0) output += fizzbuzz.get(4);
            else if (i % 11 == 0) output = "Bong";
            if (output.isEmpty()) output += i;


            /*if (i % 7 == 0 && i % 17 == 0) output += fizzbuzz.get(1);
            if (i % 5 == 0 && i % 17 == 0) output += fizzbuzz.get(2);
            if (i % 13 == 0 && i % 17 == 0) output += fizzbuzz.get(3);
            if (i % 3 == 0 && i % 17 == 0) output += fizzbuzz.get(4);*/

            System.out.println(output);}




        }
    }






