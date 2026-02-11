// jHephaistos - Jogar Dados Class
//@author Pedro Ivo Rocha, 2025

package com.github.vegedra.tools;

import com.github.vegedra.io.InputManager;

import java.util.Random;

public class Dado {

    // Variaveis
    Random random = new Random();   // Para criar valores aleatorios
    int numDados;
    int faceDados;
    int total;

    // Construtor
    public Dado() {}

    public void rolarDados() {
        // Reseta total
        total = 0;
        
        // Input
        System.out.print("\nInsira a face dos dados: ");
        faceDados = InputManager.scanner.nextInt();
        
        System.out.print("\nInsira o número de dados para rolar: ");
        numDados = InputManager.scanner.nextInt();

        if (faceDados >= 0 || numDados >= 0) {
            for (int i = 0; i < numDados; i++) {
                // Cria o valor aleatorio
                int roll = random.nextInt(1, faceDados);
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
