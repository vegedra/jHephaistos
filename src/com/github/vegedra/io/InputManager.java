// jHephaistos - Input Class
//@author Pedro Ivo Rocha, 2025

package com.github.vegedra.io;

import java.util.Scanner;

public class InputManager {
    public static final Scanner scanner = new Scanner(System.in);

    // Construtor
    private InputManager() {}

    // Pausa o programa
    public static void pause() {
        System.out.println("\n\nPressione Enter para continuar.");

        // Limpa qualquer Enter que ficou no buffer
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        // Aguarda o usuario apertar Enter
        scanner.nextLine();
    }

    // Encerra o scanner
    public static void close() {
        scanner.close();
    }
}