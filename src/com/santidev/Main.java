package com.santidev;

public class Main {

    public static void main(String[] args) {

        Contex contex = new Contex(new Addition());
        double result = contex.doCalculate(4,2);
        System.out.println("Addition: " + result);

        contex = new Contex(new Subtraction());
        result = contex.doCalculate(4,2);
        System.out.println("Subtraction: " + result);

    }
}
