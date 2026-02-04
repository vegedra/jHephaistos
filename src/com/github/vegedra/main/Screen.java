package com.github.vegedra.main;

import com.github.vegedra.io.InputManager;
import com.github.vegedra.tools.Calculadora;
import com.github.vegedra.tools.Dado;
import com.github.vegedra.tools.Peso;
import com.github.vegedra.tools.Temperatura;

// Lida com as telas
public class Screen {

    private boolean running = true;

    private Calculadora calc = new Calculadora();
    private Peso peso = new Peso();
    private Temperatura temp = new Temperatura();
    private Dado dado = new Dado();

    // Roda a tela
    public void run() {
        while (running) {
            menu();
        }
    }

    // Mostra o menu inicial
    private void menu() {
        System.out.println("\njHephaistos 0.1.0 by Pedro Ivo");
        System.out.println("\n=== MENU ===");
        System.out.println("1) Calculadora");
        System.out.println("2) Converter peso");
        System.out.println("3) Converter temperatura");
        System.out.println("4) Rolar dados");
        System.out.println("5) Sair");

        int choice = InputManager.readInt("\nEscolha uma opção: ");

        // Input
        switch (choice) {
            case 1 -> calc.calculadora();
            case 2 -> peso.converterPeso();
            case 3 -> temp.converterTemp();
            case 4 -> dado.rolarDados();
            case 5 -> running = false;
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        InputManager.pause();
    }
}