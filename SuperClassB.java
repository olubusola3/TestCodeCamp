package com.introToOOP;

public class SuperClassB extends SuperClassA {
    String name = "Anderson";

    public static void main(String[] args) {

        SuperClassB classB = new SuperClassB();
        classB.Printname();

    }

    public void Printname(){
        System.out.println("Class B name is " + super.name);
    }
}
