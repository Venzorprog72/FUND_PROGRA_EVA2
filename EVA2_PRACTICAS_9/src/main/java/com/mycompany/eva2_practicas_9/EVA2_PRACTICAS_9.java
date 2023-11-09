/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practicas_9;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_PRACTICAS_9 {

    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);

        // Solicitar una cadena al usuario
        System.out.print("Introduce una cadena: ");
        String cadena = captu.nextLine();

        // Solicitar al usuario el carácter a buscar
        System.out.print("Introduce el carácter a buscar: ");
        char caracterABuscar = captu.nextLine().charAt(0);

        int contador = 0;

        // Recorrer la cadena y contar las apariciones del carácter
        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);
            if (caracterActual == caracterABuscar) {
                contador++;
            }
        }

        System.out.println("El carácter '" + caracterABuscar + "' aparece " + contador + " veces en la cadena.");

        captu.close();
    }
}
