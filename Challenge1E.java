package com.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge1E {
    private int numberOfDays(int month, int year){
        int remain = 0;
        if(month == 2){
            if((year % 4) == 0){
                return 29;
            }
            else{
                return 28;
            }
        }
        else{
            if(month >= 8){
                remain = 1;
            }
            if((month % 2) == remain){
                return 30;
            }
            else {
                return 31;
            }
        }
    }

    public static void main(String[] args) {
        int month, year;
        Scanner input = new Scanner(System.in);
        Challenge1E test = new Challenge1E();
        List<String> numbers = Arrays.asList(input.nextLine().split(","));
        month = Integer.parseInt(numbers.get(0));
        year = Integer.parseInt(numbers.get(1));
        System.out.println("In " + year + " the month " + month + " has "
        + test.numberOfDays(month, year)  + " days");
        input.close();
    }
}
