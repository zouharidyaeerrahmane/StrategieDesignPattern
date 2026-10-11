package com.zouhari;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
       // context.setStrategy(new StratImp1());
        context.effectuerOperation();
        context.setStrategy(new StratImp2());
        context.effectuerOperation();

        }
    }
