/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12califaseua;

import java.util.Scanner;

/**
 *
 * @author IngAl
 */
public class EVA2_10_Carreras{

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
      String carrera;
      Scanner input = new Scanner(System.in);
     System.out.println("Introduce la abreviacion de tu carrera");
     carrera = input.nextLine();
     
     switch (carrera){
         case "ISC" -> System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
            // TERMINA EJECUCION DE SWITCH
         case "INF" -> System.out.println("INFORMATICA");
         case "LA" -> System.out.println("LICENCIATURA EN ADMINISTRACION");
        case "ARQ" -> System.out.println("}ARQUITECTURA");
        case "IND" -> System.out.println("INGENIERA INDUSTRIAL");
        case "IDI" -> System.out.println("INGENIERA EN DISEÑO INDUSTRIAL");
        case "IGE" -> System.out.println("}INGENIERA EN GESTION EMPRESARIAL");
            
        default -> // Siempre al final
            {
            }
            
            
                         
     }
        // Siempre al final
            }
 
}
