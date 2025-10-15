// jHephaistos - Peso Class
//@author Pedro Ivo Rocha, 2025

package com.github.vegedra.tools;

import com.github.vegedra.io.InputManager;

// Conversor de peso
public class Peso {
    double weight;
    double newWeight;
    int ch;

    public Peso() {}

    public void converterPeso() {
        System.out.println("\nConversor de peso:");
        System.out.println("1) lbs para kgs");
        System.out.println("2) kgs para lbs");

        System.out.print("\nEscolha uma opção: ");

        ch = InputManager.scanner.nextInt();

        if (ch == 1) {
            System.out.print("\nInsira o peso em lbs: ");
            weight = InputManager.scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("O peso em kgs é: %.2f", newWeight);
        } else if (ch == 2) {
            System.out.print("\nInsira o peso em kgs: ");
            weight = InputManager.scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("\nO peso em lbs é: %.2f", newWeight);
        } else {
            System.out.print("\nOpção inválida...");
        }
    }
}