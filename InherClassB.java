package com.introToOOP;

public class InherClassB extends InherClassA {

    public static void main(String[] args) {
     InherClassA fatherclass = new InherClassA();
     fatherclass.parLove();
     fatherclass.parListen();
     fatherclass.parCare();

     InherClassB  childduty = new InherClassB();
     childduty.childRespects();
     System.out.println(childduty);

     childduty.childHonor();
     System.out.println(childduty);

    }
      public void childRespects(){
          System.out.println("Children are to respect their parents");
      }
        public void childHonor(){
            System.out.println("Children are to honor their parents");

        }
    }
