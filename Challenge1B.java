package com.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge1B {
    private boolean searchValue(List<String> list , String value){
        for(String listValue : list){
            if(listValue.equals(value)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Challenge1B test = new Challenge1B();
        List<String> list = Arrays.asList(input.nextLine().split(","));
        List<String> values = Arrays.asList(input.nextLine().split(","));
        for(String value : values) {
            System.out.println(value + " = " + test.searchValue(list,value));
        }
        input.close();
    }
}
