package com.tasks.task1;

/**
 * Created by Aliaksandr_Hlekau on 4/13/2017.
 */

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int res = 0;
        int v1;
        int v2;
        double res1 = 0.00;
        boolean isDouble = false;


        System.out.println("Please enter the first value");
        while (!input.hasNextInt()) {
            System.out.println("Please, enter valid integer");
            input.next();

        }
        v1 = input.nextInt();


            System.out.println("Please enter the operator");



        String soper = input.next();
        while (soper.length() > 1) {
            System.out.println("Please, enter one + - / or * symbol");
            soper = input.next();


        }
        char oper = soper.charAt(0);


            while (oper != '+' && oper != '-' && oper != '/' && oper != '*') {
                System.out.println("Please, enter valid operator out of + - / or *");
                oper = input.next().charAt(0);
                System.out.println(oper);


        }

            System.out.println("Please enter the second value");
        while (!input.hasNextInt()) {
            System.out.println("Please, enter valid integer");
            input.next();
        }
            v2 = input.nextInt();

            // public static int calculate(String oper, int v1, int v2 ) {

            switch (oper) {
                case '+':
                    res = v1 + v2;
                    break;
                case '-':
                    res = v1 - v2;
                    break;
                case '*':
                    res = v1 * v2;
                    break;
                case '/':
                    if (v1 % v2 != 0) {
                        isDouble = true;
                        res1 = (float) v1 / v2;

                    } else {
                        res = v1 / v2;
                    }
                    break;

            }


            if (isDouble == false) {
                System.out.println("The result of the operation is " + v1 + " " + oper + " " + v2 + " = " + res);

            } else {
                System.out.println("The result of the operation is " + v1 + " " + oper + " " + v2 + " = " + res1);
            }

        }
    }



