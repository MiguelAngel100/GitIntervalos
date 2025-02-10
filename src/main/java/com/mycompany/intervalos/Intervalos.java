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
    
    public static String ObtenerCategoria(int a){
        if (a<-4){
            final String A="Intervalo A";
            return A;
        } else if (a>=-4 && a<6){
            return "Intervalo B";
        } else {
            return "Intervalo C";
        }
    }
}
