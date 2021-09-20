package com.company;

public class ConRelLogTask17 {
    public static void main(String[] args){

        int num = 90;

        //If the number is divisible by 3, print Fizz instead of the number.
        //int num = 35;
        if (num % 3 == 0 && num % 5 == 0) {
            //
            System.out.println("FizzBuzz ");
            //If the number is divisible by 5, print Buzz instead of the number.
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
            //If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.
        }else if (num % 3 == 0)
        {
            System.out.println("Fizz");

        }else {
            System.out.println(num);
        }
           }
}