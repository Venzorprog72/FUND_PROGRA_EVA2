/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_29_arreglos;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_29_ARREGLOS {

    public static void main(String[] args) {
       int []arreglo = new int [20];
       
        for (int i = 0; i < 20; i++) {
            //casting: convierto un double a un entero
            arreglo[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("["+arreglo [i]+"[");
            
        }
    }
}
