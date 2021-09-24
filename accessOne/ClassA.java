package com.accessOne;

import com.accessTwo.ClassB;

public class ClassA {

    public static void main(String[] args) {
        ClassA lesson = new ClassA();
        lesson.lessonClassOne();
        lesson.lessonClassTwo();

        /**trying to access class B in class A but becomes unavailable as soon as class be became private
        ClassB AccessB = new ClassB();
        AccessB.lessonClassB();**/
    }
    public void lessonClassOne(){
        System.out.println("This is my first method, it is the access modifier class");
    }

    public void lessonClassTwo(){
        System.out.println("This is my second method is the access modifier class");
    }

}
