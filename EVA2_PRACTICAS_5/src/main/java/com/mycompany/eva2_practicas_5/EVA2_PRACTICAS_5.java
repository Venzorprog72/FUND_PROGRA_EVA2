/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practicas_5;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_PRACTICAS_5 {

    public static void main(String[] args) {
       Scanner Ven= new Scanner(System.in);

        // Solicitar la base (primer número entero positivo)
        System.out.print("Introduce la base (número entero positivo): ");
        int base = Ven.nextInt();

        // Validar si la base es positiva
        if (base <= 0) {
            System.out.println("Por favor, ingresa un número entero positivo como base.");
            Ven.close();
            return;
        }

        // Solicitar el exponente (segundo número entero positivo)
        System.out.print("Introduce el exponente (número entero positivo): ");
        int exponente = Ven.nextInt();

        // Validar si el exponente es positivo
        if (exponente <= 0) {
            System.out.println("Por favor, ingresa un número entero positivo como exponente.");
            Ven.close();
            return;
        }

        // Inicializar una variable para almacenar el resultado
        long resultado = 1; // Utilizamos long para manejar números grandes

        // Calcular la potencia utilizando un ciclo
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);

        Ven.close();
    }
}
