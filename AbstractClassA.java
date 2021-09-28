package com.introToOOP;

public abstract class AbstractClassA {

    //username field, password field, forgot password field, and sign-in button while other elements
    // like remember me checkbox, continue to home Page, OAuth button will not be applicable to all login pages

    public abstract void username();
    public abstract void password();
    public abstract void forgot_password();
    public abstract void sign_in();

    public void rememberMe(){
        System.out.println(" Remember me on sign in");

        }
    public void homePage(){
        System.out.println(" Take me to home page");

        }
    public void oAuthButton(){
        System.out.println(" Make it optional for me to use this");

        }
}
