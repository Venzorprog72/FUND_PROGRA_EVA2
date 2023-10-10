/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_if2;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_2_IF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val2;
        int val1;
        
        Scanner captu = new Scanner (System.in);
        
        System.out.println("ingrese el valor 1:");
        val1 = captu.nextInt(); 
        System.out.println("ingrese el valor 2:");
        val2 = captu.nextInt();
        
        if (val1 > val2)
            System.out.println("el valor mas grande es:" + val1); 
        
        else {
           
        if (val1 == val2)
                System.out.println("ambos valores son iguales");
        else
                System.out.println("el valor mas grande es"+ val2);
          
            
                
                }
                    
                  
                      
            
        
        
        
        
        
        
        
    }
    
}
