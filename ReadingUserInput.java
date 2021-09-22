package com.company;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
      /**  I = Prt

        Where:
       P = Principal Amount
                I = Interest Amount
                r = Rate of Interest per year in decimal; r = R/100
        R = Rate of Interest per year as a percent; R = r * 100
        t = Time Period involved in months or years**/

        Scanner userCal = new Scanner(System.in);
        System.out.println("Input Principal Amount ");
        double princ = userCal.nextDouble();

        System.out.println("Input Rate of Interest per year ");
        double rate = userCal.nextDouble();

        System.out.println("Time Period involved ");
        double time = userCal.nextDouble();

        double SimpleInterest = (princ * rate * time)/100;
        System.out.println("This value "+SimpleInterest+" is the simple interest");

    }
}
