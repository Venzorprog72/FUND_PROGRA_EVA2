/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practicas_2;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_PRACTICAS_2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número entero positivo
        System.out.print("Ingresa el primer número entero positivo: ");
        int numero1 = scanner.nextInt();

        // Validar si el primer número es positivo
        if (numero1 <= 0) {
            System.out.println("El número ingresado no es positivo. Por favor, ingresa un número positivo.");
            return; // Salir del programa
        }

        // Solicitar el segundo número entero positivo
        System.out.print("Ingresa el segundo número entero positivo: ");
        int numero2 = scanner.nextInt();

        // Validar si el segundo número es positivo
        if (numero2 <= 0) {
            System.out.println("El número ingresado no es positivo. Por favor, ingresa un número positivo.");
            return; // Salir del programa
        }

        // Asegurarse de que el primer número sea menor que el segundo número
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Números pares entre " + numero1 + " y " + numero2 + ":");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
        
        
        
       
        
        
    }
}
