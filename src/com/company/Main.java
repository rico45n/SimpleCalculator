package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner osnv = new Scanner(System.in);
        double firstPer;
        double secondPer;
        char simvoli;
        double result;
        System.out.println("Here is a simple calculator ");

        System.out.println("Enter the first value ");
        firstPer = osnv.nextDouble();

        System.out.println("Select an action (+)(-)(*)(/) ");
        simvoli = osnv.next().charAt(0);

        System.out.println("Enter the second value ");
        secondPer = osnv.nextDouble();

        switch (simvoli){
            case '+':
                result = firstPer + secondPer;
                System.out.println("Result:" + result);
                break;

            case '-':
                result = firstPer - secondPer;
                System.out.println("Result:" + result);
                break;

            case '*':
                result = firstPer * secondPer;
                System.out.println("Result:" + result);
                break;

            case '/':
                result=firstPer/secondPer;
                System.out.println("Result:" + result);
                break;

            default:
                System.out.println("Error");
        }
    }
}
