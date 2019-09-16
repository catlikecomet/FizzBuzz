package com.company;

public class Main {
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


    }
    public static void main(String[] args) {
       fizzbuzz();












        /*for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(three);
            }

            if (i % 5 == 0) {
                System.out.println(nums+five);
            }
            if (i % 7 == 0) {
                System.out.println(nums+sev);
            }
            if (i % 11 == 0) {
                System.out.println(nums+elvn);
            }
            if (i % 13 == 0) {
                System.out.println(nums+thirt);
            }

        }
    }
}*/




















        /*for (i = 1; i <= 256; i++) {

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
        /*for (i = 1;  i <= 100; i++ ) {


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


    }*/


    }
}
