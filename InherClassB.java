package com.introToOOP;

public class InherClassB extends InherClassA {

    public static void main(String[] args) {

     InherClassB  childduty = new InherClassB();
     childduty.childRespects();
     childduty.childHonor();
     childduty.parLove();
     childduty.parCare();
     childduty.parListen();

    }
      public void childRespects(){
          System.out.println("Children are to respect their parents");
      }
        public void childHonor(){
            System.out.println("Children are to honor their parents");

        }
    }
