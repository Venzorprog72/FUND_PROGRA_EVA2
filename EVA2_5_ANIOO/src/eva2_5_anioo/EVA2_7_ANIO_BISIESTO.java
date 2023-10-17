/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_anioo;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_7_ANIO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int year, resu4, resu100, resu400;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("ingresa el año");
        year = captu.nextInt();
        
        resu4 = year % 4;
        resu100 = year % 100;
        resu400 = year % 400;
        
        if((resu4 == 0 ) && ( (resu100 != 0) || (resu400 == 0)))
            System.out.println("el año " + year + " es bisiesto");
        else 
            System.out.println("el año "+ year + " no es bisiesto");
                
                        
                        
            
        
        
         
            
        
        
        
        
        
    }
    
}
