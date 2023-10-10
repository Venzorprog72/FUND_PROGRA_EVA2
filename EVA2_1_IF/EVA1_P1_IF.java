/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_p1_if;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA1_P1_IF {

    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int calificacion;
        
        System.out.println("Ingrese la calificacion");
        calificacion = captu.nextInt();
        if (calificacion >= 70){ //if (expresion a evaluar)
            //Este bloque si es verdad se va a ejecutar.
            //Las llaves se usan son ,as de una instruccion.
            //Dentro del if, si es una sola, no se usan.
            System.out.println("Aprobado. Viajamos a Cancun.");//Pertenece al if
            System.out.println("Felicidades!!");//No pertenece al if
        }else // else ------ si no.
            //Este bloque se ejecuta cuando es falso.
            System.out.println("No acreditado: a picar piedra.");
        System.out.println("Fin del programa");
        
        
    }
}
