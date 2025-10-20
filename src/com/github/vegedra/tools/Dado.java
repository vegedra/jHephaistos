// jHephaistos - Jogar Dados Class
//@author Pedro Ivo Rocha, 2025

package com.github.vegedra.tools;

import com.github.vegedra.io.InputManager;

import java.util.Random;

public class Dado {

    // Variaveis
    Random random = new Random();   // Para criar valores aleatorios
    int numDados;
    int total = 0;

    // Construtor
    public Dado() {}

    public void rolarDados() {

        // Input
        System.out.print("\nInsira o número de dados para rolar: ");
        numDados = InputManager.scanner.nextInt();

        if (numDados > 0) {
            for (int i = 0; i < numDados; i++) {
                // Cria o valor aleatorio de 1 a 7
                int roll = random.nextInt(1, 7);
                System.out.println("Você rolou: " + roll);
                total += roll;
            }
            System.out.print("\nTotal: " + total);
        }
        else {
            System.out.println("Valor inválido.");
        }
    }
}
