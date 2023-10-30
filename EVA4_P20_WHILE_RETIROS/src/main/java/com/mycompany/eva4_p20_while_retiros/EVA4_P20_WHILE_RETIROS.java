/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva4_p20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA4_P20_WHILE_RETIROS {

    public static void main(String[] args) {
        int canti = 1000;
        Scanner input = new Scanner (System.in);
        
        while (canti > 0){//Mientras haiga dinero puede seguir sacando
            System.out.println("Cuanto deseas retirar?");
            int retiro = input.nextInt();
            canti -= retiro;
            System.out.println("Te quedan" + " " + canti + " " + "de saldo.");
        }
    }
}
