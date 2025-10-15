// jHephaistos - Calc Class
//@author Pedro Ivo Rocha, 2025

package com.github.vegedra.tools;

import com.github.vegedra.io.InputManager;

public class Calculadora {

    // Variaveis
    double num1;
    double num2;
    char operador;
    double resultado = 0;
    boolean operacaoValida = true;

    // Construtor
    public Calculadora() {}

    public void calculadora() {
        // num1
        System.out.print("\nInsira o primeiro número: ");
        num1 = InputManager.scanner.nextInt();

        // operador
        System.out.print("Insira o operador (+, -, *, /, ^): ");
        operador = InputManager.scanner.next().charAt(0);

        // num2
        System.out.print("Insira o segundo número: ");
        num2 = InputManager.scanner.nextInt();

        switch(operador) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Não pode dividir por zero!");
                    operacaoValida = false;
                }
                else { resultado = num1 / num2; }
            }
            case '^' -> resultado = Math.pow(num1, num2);
            default -> {
                System.out.println("Operação inválida!");
                operacaoValida = false;
            }
        }

        if (operacaoValida) { System.out.print("\nO resultado é: " + resultado); }
    }
}
