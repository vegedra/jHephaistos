// jHephaistos - Main Class
//@author Pedro Ivo Rocha, 2025

package com.github.vegedra.main;

import com.github.vegedra.io.InputManager;

public class Main {

    // Loop principal
    public static void main(String[] args) {
        // Cria a tela
        Screen screen = new Screen();
        screen.run();
        InputManager.close();
    }
}