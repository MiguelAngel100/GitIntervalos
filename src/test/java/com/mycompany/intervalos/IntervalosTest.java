/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.intervalos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A continucion se realiza las pruebas del proyecto, 
 * para asegurarse que funciona correctamente
 * @author miguelangel
 * @version 1.0
 * @since 13-2-2025
 */
public class IntervalosTest {
    
    public IntervalosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test de la clase principal, de la clase intervalos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Intervalos.main(args);
    }

    /**
     * Test del método ObtenerCategoria, de la clase intervalos.
     * comprueba el rango A
     */
    @Test
    public void testObtenerCategoriaA() {
        System.out.println("ObtenerCategoria");
        int a = -7;
        String expResult = "Intervalo A";
        String result = Intervalos.ObtenerIntervalo(a);
        assertEquals(expResult, result);
        
    }
    /**
     * Test del método ObtenerCategoria, de la clase intervalos.
     * comprueba el rango B
     */
    @Test
    public void testObtenerCategoriaB() {
        System.out.println("ObtenerCategoria");
        int a = -2;
        String expResult = "Intervalo B";
        String result = Intervalos.ObtenerIntervalo(a);
        assertEquals(expResult, result);
        
    }
    /**
     * Test del método ObtenerCategoria, de la clase intervalos.
     * comprueba el rango C
     */
    @Test
    public void testObtenerCategoriaC() {
        System.out.println("ObtenerCategoria");
        int a = 9;
        String expResult = "Intervalo C";
        String result = Intervalos.ObtenerIntervalo(a);
        assertEquals(expResult, result);
        
    }
    /**
     * Test del método ObtenerCategoria, de la clase intervalos.
     * comprueba el limite entre rango A y B
     */
    @Test
    public void testObtenerCategoriaLimA_B() {
        System.out.println("ObtenerCategoria");
        int a = -4;
        String expResult = "Intervalo B";
        String result = Intervalos.ObtenerIntervalo(a);
        assertEquals(expResult, result);
        
    }
    /**
     * Test del método ObtenerCategoria, de la clase intervalos.
     * comprueba el limite entre rango B y C
     */
    @Test
    public void testObtenerCategoriaLimB_C() {
        System.out.println("ObtenerCategoria");
        int a = 6;
        String expResult = "Intervalo C";
        String result = Intervalos.ObtenerIntervalo(a);
        assertEquals(expResult, result);
        
    }
}
