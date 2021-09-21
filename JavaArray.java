package com.company;

import java.sql.Array;
import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {


        String [] [] Fruits = new String [4][3];
        Fruits [0][0] ="Grapes";
        Fruits [1][0] ="Blueberry";
        Fruits [2][0] ="Blackcurrant";
        Fruits [3][0] ="Kiwi";
        System.out.println(Arrays.deepToString(Fruits));
                 }
}
