/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intervalos;

/**
 * En este proyecto se crea un método en el que,
 * segun el número pasado al método, se obtiene uno de los 3 posibles rangos
 * @author miguelangel
 * @version 3.0.2
 * @since 13-02-2025
 */


public class Intervalos {

    public static void main(String[] args) {
        
    }
    
    /**
     * En este método se recibe un número de tipo double 
     * y devuelve uno de los distintos rangos
     * @param k
     * @return A, "Intervalo B", "Intervalo C"
     */
    public static String ObtenerIntervalo(double k){
        if (k<-4){
            final String A="Intervalo A";
            return A;
        } else if (k>=-4 && k<6){
            return "Intervalo B";
        } else if (k>6) {
            
            return "Intervalo C";
        } else {
            return "j";
        }
    }
}
