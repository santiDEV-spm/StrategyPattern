package com.santidev;

public class Contex {

    private Strategy strategy;

    public Contex(Strategy strategy){
        this.strategy = strategy;
    }

    public double doCalculate(double a, double b){
        return this.strategy.calculate(a,b);
    }

}
