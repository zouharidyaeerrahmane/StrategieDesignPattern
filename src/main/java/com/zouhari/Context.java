package com.zouhari;

public class Context {
    private Strategy strategy = new DefaultStratImp();

    public void effectuerOperation(){
        System.out.println("***********************");
        strategy.OperationStrategy();
        System.out.println("***********************");

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
