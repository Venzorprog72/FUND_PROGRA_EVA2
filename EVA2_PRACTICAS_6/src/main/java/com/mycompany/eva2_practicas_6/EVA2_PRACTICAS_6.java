/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practicas_6;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_PRACTICAS_6 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        // Solicitar un número entero positivo al usuario
        System.out.print("Introduce un número entero positivo: ");
        int numero = captu.nextInt();

        // Validar si el número es positivo
        if (numero < 0) {
            System.out.println("Por favor, ingresa un número entero positivo.");
            captu.close();
            return;
        }

        // Calcular el equivalente en sistema binario
        String binario = Integer.toBinaryString(numero);

        System.out.println("El equivalente en sistema binario de " + numero + " es: " + binario);

        captu.close();
    }
}
