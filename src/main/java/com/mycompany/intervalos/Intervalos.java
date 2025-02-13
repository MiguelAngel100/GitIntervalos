/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intervalos;

/**
 *
 * @author miguelangel
 */
public class Intervalos {

    public static void main(String[] args) {
        
    }
    
    public static String ObtenerIntervalo(double k){
        if (k<-4){
            final String A="Intervalo A";
            return A;
        } else if (k>=-4 && k<6){
            return "Intervalo B";
        } else {
            return "Intervalo C";
        }
    }
}
