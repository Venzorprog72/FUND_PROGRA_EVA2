/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_27_arreglos;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA2_27_ARREGLOS {

    public static void main(String[] args) {
        //declaramos un arreglo que almacena 1o enteros 
        //acceso a los arreglos es aleatorio.
        //se accede a los valores a traves de un INDICE 
        //los valores almacenados tienen una direccion 
        //el primer elemento esta en la posicion 0
        // el ultimo en ala posicion N -1, donde N es el tamaño
        // del arreglo
        
       int [] arregloEnteros = new int [10];
       //acceder valores en un arreglo
       arregloEnteros [0] = 100;
       arregloEnteros [1] = 200;
       arregloEnteros [2] = 300;
       arregloEnteros [3] = 400;
       arregloEnteros [4] = 500;
       arregloEnteros [5] = 600;
       arregloEnteros [6] = 700;
       arregloEnteros [7] = 800;
       arregloEnteros [8] = 900;
       arregloEnteros [9] = 1000;
       
        System.out.println("Valor en posición 0:" + arregloEnteros [0]);
        
        String[] arregloCade = new String [5];
        arregloCade [0] = "Hola";
        arregloCade [1] = "Messi";
        arregloCade [2] = "Puro chinipas";
        arregloCade [3] = "El uriel belico";
        arregloCade [4] = "Venzorcito";
        
        //Usar cuando usamos muchos datos del mismo tipo 
       
    }
}
