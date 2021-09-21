package com.company;

public class StringOperations {
    public static void main(String[] args) {

       String word = "DEMOCRACY";
   //length of the word
        word.length();
        System.out.println("*****************Reversing string DEMOCRACY ***********");
        System.out.println(word.length());
        System.out.print(word.charAt(word.length()-1) +"" +word.charAt(word.length()-2)
                     +""+word.charAt(word.length()-3) +"" +word.charAt(word.length()-4)
                     +"" +word.charAt(word.length()-5) +"" +word.charAt(word.length()-6)
                     +"" +word.charAt(word.length()-7) +"" +word.charAt(word.length()-8)
                     +"" +word.charAt(word.length()-9)) ;

        System.out.println("   ");
        System.out.println("************************Getting the word COME from Democracy Reversed*******************");

        System.out.println(word.charAt(word.length()-5) +"" +word.charAt(word.length()-6)
                +"" +word.charAt(word.length()-7) +"" +word.charAt(word.length()-8));

    }
}
