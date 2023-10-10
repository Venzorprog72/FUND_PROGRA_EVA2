/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_3_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        int residuo;
        
        
        Scanner captu = new Scanner (System.in);
        
        System.out.println("introduce el valor");
        valor = captu.nextInt();
        
        residuo = valor % 2;
        
        if(residuo == 0)
            System.out.println("el numeo es par");
        
        else 
            System.out.println("el numero es impar");
        
        
    }
    
}
