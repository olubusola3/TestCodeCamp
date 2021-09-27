package com.introToOOP;

public class EncapClassBtask {

    public static void main(String[] args) {
        //Areasquare = shapelength * shapeBreath

       EncapClassATask len = new EncapClassATask();
       len.setShapelength(8);
       int shapelen = len.getShapelength();
        System.out.println(shapelen);

        len.setShapeBreath(6);
        int shapebrt = len.getShapeBreath();
        System.out.println(shapebrt);


        int Areashape = shapelen * shapebrt;
        System.out.println(Areashape);

        System.out.println("The area of a square of length: "+shapelen+"  and breath "+shapebrt+" is " +Areashape+ "");
   }
}
