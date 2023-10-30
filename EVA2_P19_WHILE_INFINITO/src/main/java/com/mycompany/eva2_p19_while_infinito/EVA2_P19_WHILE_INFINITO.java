/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P19_WHILE_INFINITO {

    public static void main(String[] args) {
        int nume = 100;
        int captu = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("Adivina que numero es el numero secreto.");
        
        while (true){
            System.out.println("Introduce un numero:");
            captu = input.nextInt();
            if (captu == nume)
                System.out.println("Adivinaste!!!");
                break;
        }
    }
}
