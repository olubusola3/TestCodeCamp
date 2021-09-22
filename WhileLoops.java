package com.company;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        //logic that takes in input from the user. It keeps printing "try again "until the user enters "testify"
        Scanner putword = new Scanner(System.in);
        String userInput = "Try Again ";

        while (true){
        if(!userInput.equalsIgnoreCase("testify")) {
            System.out.println("Please \"Try Again\" by typing \"testify\" ");
            userInput = putword.nextLine();
           continue;
        }else if(userInput.equalsIgnoreCase("Testify")){
                System.out.println("This word \"testify\" you have entered is the expected word Well done");
                break;
            }
        //break and continue statement


    }
}}
