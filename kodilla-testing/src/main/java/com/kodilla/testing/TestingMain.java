package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.Calculator.Calculator;


public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator addTest = new Calculator();
        int a = 8;
        int b = 45;
        int resultAdd = addTest.addAB(a,b);

        if (resultAdd==53) {
            System.out.println("Test zdany!");
        }else {
            System.out.println("Błąd w kodzie!");
        }

        Calculator substractTest = new Calculator();

        int resultSubstractAB = substractTest.subtractAB(a,b);

        if (resultSubstractAB==-37) {
            System.out.println("Test zdany!");
        }else {
            System.out.println("Błąd w kodzie!");
        }


    }
}