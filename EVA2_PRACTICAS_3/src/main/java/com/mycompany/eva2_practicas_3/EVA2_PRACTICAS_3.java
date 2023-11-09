/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practicas_3;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_PRACTICAS_3 {

    public static void main(String[] args) {

        Scanner captu = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Introduce un número entero: ");
        int numero = captu.nextInt();

        // Validar si el número ingresado es positivo
        if (numero < 1) {
            System.out.println("Ingresa un número entero positivo.");
        } else {
            int sumatoria = 0;

            // Calcular la sumatoria de los números desde 1 hasta el número ingresado
            for (int i = 1; i <= numero; i++) {
                sumatoria += i;
            }

            System.out.println("La sumatoria de los números desde 1 hasta " + numero + " es: " + sumatoria);
        }

        captu.close();
    }
}
