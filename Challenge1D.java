package com.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge1D {
    private int moduleOperator(int number1, int number2){
        int temp;
        temp = number1/ number2;
        return number1 - (temp * number2);
    }

    public static void main(String[] args) {
        int number1, number2;
        Scanner input = new Scanner(System.in);
        Challenge1D test = new Challenge1D();
        List<String> numbers = Arrays.asList(input.nextLine().split(","));
        number1 = Integer.parseInt(numbers.get(0));
        number2 = Integer.parseInt(numbers.get(1));
        System.out.println(number1 + " % " + number2 + " = " + test.moduleOperator(number1, number2));
        input.close();
    }
}
