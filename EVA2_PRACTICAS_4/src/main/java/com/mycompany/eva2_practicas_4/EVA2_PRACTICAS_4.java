/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practicas_4;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_PRACTICAS_4 {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Solicitar un número al usuario
            System.out.print("Introduce un número: ");
            int numero = cap.nextInt();

            // Clasificar el número
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }

            // Preguntar al usuario si desea terminar el programa
            System.out.print("¿Deseas terminar el programa? (SI/NO): ");
            String respuesta = cap.next();

            if (respuesta.equalsIgnoreCase("Sí")) {
                continuar = false;
            }
        }

        cap.close();
    }
}
