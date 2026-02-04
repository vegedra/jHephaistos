// jHephaistos - Input Class
//@author Pedro Ivo Rocha, 2025

package com.github.vegedra.io;

import java.util.Scanner;

public class InputManager {
    public static final Scanner scanner = new Scanner(System.in);

    // Construtor
    private InputManager() {}

    // Ler e executar input - int ou double
    public static int readInt(String text) {
        while (true) {
            System.out.print(text);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine(); // limpa enter
                return value;
            }

            System.out.println("Entrada inválida! Digite um número.");
            scanner.nextLine(); // descarta lixo
        }
    }
    public static double readDouble(String text) {
        while (true) {
            System.out.print(text);

            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            }

            System.out.println("Entrada inválida! Digite um número.");
            scanner.nextLine();
        }
    }

    // Pausa o programa
    public static void pause() {
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }

    // Fecha o scanner
    public static void close() {
        scanner.close();
    }
}