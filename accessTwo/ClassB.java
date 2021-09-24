package com.accessTwo;

import com.accessOne.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA Accesslesson = new ClassA();
        Accesslesson.lessonClassOne();

        ClassB AccessB = new ClassB();
        AccessB.lessonClassB();
    }

    private void lessonClassB(){
        System.out.println("This is a private class, cant be acces anywhere asides in this class");
    }

}
