/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author IngAl
 */
public class EVA2_12_CALIFAS_EUA {

    public static void main(String[] args) {
        
        Scanner captu = new Scanner(System.in);
        int califa;
        System.out.println("Ingresa la calificacion");
        califa = captu.nextInt();
        
        if ((califa >= 0)&& (califa <=100))
        System.out.println("El numero" + califa + "Es valido");
        
        if (califa >= 90)
        System.out.println("A");
        else if ((califa>=80)&&(califa<=89))
            System.out.println("B");   
        else if ((califa>=70)&&(califa<=79))
            System.out.println("C");   
        else if ((califa>=60)&&(califa<=69))
            System.out.println("D");   
        else if (califa<=59)
            System.out.println("F");   
        
        
                
        else 
            System.out.println("no es valido");
                
       
    } 
    
            
}
