package com.introToOOP;

public class OverRidingChild extends OverRidingParent {
    public static void main(String[] args) {

        OverRidingChild childme = new OverRidingChild();
        childme.parLove("Love", 3);
        childme.parListen(true);

    }

    public void parLove(String type, int number) {
        System.out.println("Children should also love their parents");

    }

    public void parListen(boolean condition) {
        System.out.println("Children listen to their parents also");
    }
}
