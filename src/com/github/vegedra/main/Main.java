// jHephaistos - Main Class
//@author Pedro Ivo Rocha, 2025

package com.github.vegedra.main;

import com.github.vegedra.io.InputManager;
import com.github.vegedra.tools.Calculadora;
import com.github.vegedra.tools.Peso;
import com.github.vegedra.tools.Temperatura;

public class Main {

    // Se o programa está rodando
    static boolean running = true;
    static boolean sair = false;

    public static void main(String[] args) {
        while (running) {
            menu();
            if (!sair) { InputManager.pause(); }
        }
        // Se parar de rodar, fecha
        InputManager.close();
    }

    public static void menu() {
        // Objetos
        Calculadora calc = new Calculadora();
        Peso peso = new Peso();
        Temperatura temp = new Temperatura();

        System.out.println("\njHephaistos 0.1.0 by Pedro Ivo");
        System.out.println("\n=== MENU ===");
        System.out.println("1) Calculadora");
        System.out.println("2) Converter peso");
        System.out.println("3) Converter temperatura");
        System.out.println("4) Sair");
        System.out.print("\nEscolha uma opção: ");

        int ch = InputManager.scanner.nextInt();

        // Switch mais moderno, sem ":" e 'break;'
        switch (ch) {
            case 1 -> calc.calculadora();
            case 2 -> peso.converterPeso();
            case 3 -> temp.converterTemp();
            case 4 -> { sair = true; running = false; }
            default -> { System.out.println("Opção inválida"); menu(); }
        }
    }
}