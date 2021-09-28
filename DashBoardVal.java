package com.introToOOP;

public class DashBoardVal implements InterFacesTaskB {
    public static void main(String[] args) {
            DashBoardVal valLog = new DashBoardVal();
            valLog.username();
            valLog.password();
            valLog.login();
    }

    @Override
    public void username() {
        System.out.println("User has typed in correct username");
           }

    @Override
    public void password() {
        System.out.println("User has typed in correct Password that matched username");


    }

    @Override
    public void login() {
        System.out.println("Login to the home Page or dashboard page is successful");


    }
}
