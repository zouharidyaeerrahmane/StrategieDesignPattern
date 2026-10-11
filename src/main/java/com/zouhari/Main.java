package com.zouhari;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> strategyMap = new HashMap<>();
        Strategy strategy;

        while (true) {
            System.out.println("Entrer la strategie Souhaité:");
            String str = scanner.nextLine();
            strategy = strategyMap.get(str);
            if (strategy == null) {
                System.out.println("Creation d'un nouvel objet StrategyImp " +str);
                strategy = (Strategy) Class.forName("com.zouhari.StratImp"+str).getConstructor().newInstance();
                strategyMap.put(str, strategy);
            }

            context.setStrategy(strategy);
            context.effectuerOperation();
        }

        }
    }
