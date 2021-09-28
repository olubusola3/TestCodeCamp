package com.introToOOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepTask30 {

            public static void main(String[] args) {
            try {
                System.out.println("Input your age");
                Scanner putAge = new Scanner(System.in);
                int myAge = putAge.nextInt();
                System.out.println("Your age is " + myAge);


            } catch (InputMismatchException Inputnotcorrect){
                System.out.println("I am expecting you to enter  a number for age and not alphabets");
                System.out.println(Inputnotcorrect);}

        }
    }




