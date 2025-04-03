package org.umeshpractice.exercise_01_RestAssured_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class API_TESTING_001 {
    public static void main(String[] args) {
        // Gherkins Syntax
        // Given() -> Pre Req. - URL, Headers, Auth, Body....
        // When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
        // Then() -> Validation -> 200 oK, firstname == PRAMOD

        //Full url --> http://api.zippopotam.us/IN/560087
        //Base uri --> http://api.zippopotam.us/
        //Base Path -->IN/560087
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pincode : ");
        String pincode = sc.nextLine();

        RestAssured.
                given().baseUri("http://api.zippopotam.us").basePath("/IN/"+pincode).
                when().get().
                then().log().all().statusCode(200);

//      RestAssured.
//               given().baseUri("http://api.zippopotam.us").basePath("IN/560084").
//               when().get().
//               then().log().all().statusCode(400);






    }


}
