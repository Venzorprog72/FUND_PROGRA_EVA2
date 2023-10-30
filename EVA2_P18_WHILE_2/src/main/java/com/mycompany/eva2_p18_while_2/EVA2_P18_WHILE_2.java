/*\
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p18_while_2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P18_WHILE_2 {

    public static void main(String[] args) {
        int nume = 100;
        int captu = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("Adivina que numero es el numero secreto.");
        
        while (captu != nume){
            System.out.println("Introduce el numero:");
            captu = input.nextInt();
            if (captu == nume)
                System.out.println("Adivinaste!!!");
        }

    }
}
