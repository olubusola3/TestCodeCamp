package com.introToOOP;

public class SubKeyWord {
    String name = "Delta";
    String anotherName;


    // THIS  https://i.imgur.com/aRkRDPa.png You have a class with a method print Name.
    // write a code in the print Name method that will print the instance member which is
    // "Delta" and whatever name the user enter when invoking the method   //
    public SubKeyWord(){
              this("Delta", "Tayo");
    }

    public SubKeyWord(String name, String anotherName){
        System.out.println("Print whatever name the user enters");

    }

    public static void main(String[] args) {
        SubKeyWord words = new SubKeyWord();
        //words.printName("Tayo");

    }

      // public void printName(String name){
        //    System.out.println("This is the name expected: "+ this.name);



    }

