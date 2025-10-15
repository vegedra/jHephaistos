// jHephaistos - Temp Class
//@author Pedro Ivo Rocha, 2025

package com.github.vegedra.tools;

import com.github.vegedra.io.InputManager;

// Conversor de temperatura
public class Temperatura {
    double temp;
    double newTemp;
    String unidade;

    public Temperatura() {}

    public void converterTemp() {
        System.out.print("\nInsira a temperatura: ");
        temp = InputManager.scanner.nextDouble();

        System.out.print("converter para (C)elsius ou (F)ahrenheit?: ");
        unidade = InputManager.scanner.next().toUpperCase();

        // Calcula usando operador ternario
        newTemp = (unidade.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;

        System.out.printf("\nA temperatura convertida é: %.1f°%s", newTemp, unidade);
    }
}
