/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practicas_7;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_PRACTICAS_7 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int numero;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        do {
            System.out.print("Introduce un número positivo (o cero) o un número negativo para terminar: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                // Actualizar el mínimo y el máximo
                if (numero < minimo) {
                    minimo = numero;
                }
                if (numero > maximo) {
                    maximo = numero;
                }
            }
        } while (numero >= 0);

        if (minimo == Integer.MAX_VALUE || maximo == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron números válidos.");
        } else {
            System.out.println("El número más pequeño es: " + minimo);
            System.out.println("El número más grande es: " + maximo);
        }

        scanner.close();
    }
}
