package org.umeshpractice.exercise_01_RestAssured_Basics;

public class API_TESTING_002 {
          //NO Design Pattern

    public void Step1{
        System.out.println("Step1");
    }
    public void Step2{
        System.out.println("Step2");
    }
    public void Step3{
        System.out.println("Step3");
    }

    //Non Chaining Pattern / Simple Pattern
    public static void main(String[] args) {
        API_TESTING_002 ndp = new API_TESTING_002();
        ndp.Step1();
        ndp.Step2();
        ndp.Step3();
    }
}
