package com.challenges;

import java.util.Scanner;

public final class Challenge1A {

    private int factorial(int number) {
        int result = 1;
        for(int i = 1 ; i <= number ; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        Challenge1A test = new Challenge1A();
        int result = test.factorial(number);
        System.out.println(number +"! = " + result);
        input.close();
    }
}
