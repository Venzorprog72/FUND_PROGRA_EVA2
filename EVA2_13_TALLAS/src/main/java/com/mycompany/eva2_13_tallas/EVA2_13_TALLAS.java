/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author Venzor
 */
public class EVA2_13_TALLAS {

    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    int Talla;
        System.out.println("Ingresa la talla");
        Talla = captu.nextInt();
        
        switch(Talla){
            case 29:
                System.out.println("small");
                break;
            case 42:
                System.out.println("medium");
                break;
            case 44:
                System.out.println("large");
                break;
            case 48:
                System.out.println("large x");
                break;
                
            default:
                System.out.println("El numero" + Talla + "No es valido");
                
                    
        }
            
        
    }
}
