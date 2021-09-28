package com.introToOOP;

public class AbstractDev extends AbstractClassA {
    public static void main(String[] args) {

        AbstractDev devUse = new AbstractDev();
        devUse.rememberMe();
        devUse.oAuthButton();
        devUse.homePage();
        devUse.username();
        devUse.password();
        devUse.forgot_password();
        devUse.sign_in();
    }
    @Override
    public void username() {
        System.out.println(" All pages are required to have user name ");
    }

    @Override
    public void password() {
        System.out.println(" All users are required to have valid passwords ");
    }

    @Override
    public void forgot_password() {
        System.out.println(" All users should be able to  reset password when forgotten ");
    }

    @Override
    public void sign_in() {
        System.out.println(" All users have to sign in ");
    }
}
