package com.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge1C {
    private int sumList(List<Integer> list){
        int result = 0;
        for(int value : list){
            result += value;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        Challenge1C test = new Challenge1C();
        for(String number: Arrays.asList(input.nextLine().split(","))){
                list.add(Integer.parseInt(number));
        }
        System.out.println("Sum = " + test.sumList(list));
        input.close();
    }
}
