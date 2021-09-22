package com.company;

import java.util.Scanner;

public class Javamethods {
    public static void main(String[] args) {
      Javamethods visit = new Javamethods();
        visit.verVisitors();
    }
    /**
     * Create a method that verify that visitors on the slack channel are coming for testify Trainings.
     * If they write" Testify" then print out a  welcome messsage if not
     * , the user should be shown rejection message. after creating this method, then invoke the created method in your main method
     */
    public void verVisitors() {
        Scanner inputval = new Scanner(System.in);
        String userInput = "testify";
        while(true){
        if (userInput.equalsIgnoreCase("testify")) {
            System.out.println("You are welcome to testify Training Class");
            userInput = inputval.nextLine();
            continue;
        }else if(!userInput.equalsIgnoreCase("testify")){
            System.out.println("You are not welcome to testify training class as you did not write Testify");
break;
        }
    }
}}