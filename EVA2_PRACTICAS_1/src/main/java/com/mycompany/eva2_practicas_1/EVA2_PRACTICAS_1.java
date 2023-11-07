/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practicas_1;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_PRACTICAS_1 {

    public static void main(String[] args) {
        int nume;
        int nume2;       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
     nume  = input.nextInt();
        System.out.println("Intruduce un segundo numero");
        nume2 = input.nextInt();
        
        
        for (int i = nume; i <= nume2; i++){
        System.out.println(i);
        
    }
    
        
    }
}
