/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practicas_8;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_PRACTICAS_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce un carácter alfabético o un espacio en blanco para terminar: ");
            String entrada = scanner.nextLine().trim();

            // Verificar si la entrada es un espacio en blanco para terminar
            if (entrada.equals(" ")) {
                break;
            }

            // Verificar si la entrada es un carácter alfabético
            if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                char caracter = entrada.charAt(0);
                caracter = Character.toLowerCase(caracter); // Convertir a minúsculas para simplificar la comprobación

                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    System.out.println(entrada + " es una vocal.");
                } else {
                    System.out.println(entrada + " es una consonante.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, introduce un carácter alfabético o un espacio en blanco.");
            }
        }

        scanner.close();
    }
}
