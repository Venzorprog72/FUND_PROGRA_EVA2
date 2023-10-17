/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        
        
        Scanner captu = new Scanner (System.in);
        
        System.out.println("ingrese la calificacion") ;
        califa = captu.nextInt();
        
        //vamos a evaluar
        //califa = 0 
        if((califa >=0) && (califa <= 100)){
            System.out.println("la calificacion " + califa + " es valida!!");
            if (califa >= 70)
                System.out.println("acreditas!!");
            else 
                System.out.println("no acreditas!!");
        }else 
            System.out.println("la calificacion "+ califa + " no es valida!!");
        
        
        
        
        
        
        
        
        
    }
    
}
