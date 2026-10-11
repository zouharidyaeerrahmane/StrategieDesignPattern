package com.zouhari;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Entrer la strategie Souhaité:");
            String str = scanner.nextLine();
            Strategy strategy = (Strategy) Class.forName("com.zouhari.StratImp"+str).newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();
        }

        }
    }
