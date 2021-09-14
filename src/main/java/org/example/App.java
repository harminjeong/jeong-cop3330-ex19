/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    static Scanner in = new Scanner(System.in);
    static double isNumber(){
        int i = 1;
        double input = 0;
        boolean truth = in.hasNextDouble();
        while(i == 1){
            if(truth){
                input = in.nextDouble();
                i = 0;
            }
            else{
                System.out.println("Invalid input!");
                in.next();
                truth = in.hasNextDouble();
            }
        }
        return input;
    }

    public static void main(String[] args) {

        System.out.print("What is your weight (in pounds)? ");
        double weight = isNumber();
        System.out.print("What is your height (in inches)? ");
        double height = isNumber();

        double bmi = Math.round((weight/Math.pow(height, 2))*703);

        System.out.println("Your BMI is "+bmi);
        if(bmi<18.5){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if(18.4<bmi && bmi<25){
            System.out.println("You are within the ideal weight range.");
        }
        else{
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
