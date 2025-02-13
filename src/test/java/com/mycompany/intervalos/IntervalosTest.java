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
 *
 * @author miguelangel
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
     * Test of main method, of class Intervalos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Intervalos.main(args);
    }

    /**
     * Test of ObtenerCategoria method, of class Intervalos.
     */
    @Test
    public void testObtenerCategoriaA() {
        System.out.println("ObtenerCategoria");
        int a = -7;
        String expResult = "Intervalo A";
        String result = Intervalos.ObtenerCategoria(a);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testObtenerCategoriaB() {
        System.out.println("ObtenerCategoria");
        int a = -2;
        String expResult = "Intervalo B";
        String result = Intervalos.ObtenerCategoria(a);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testObtenerCategoriaC() {
        System.out.println("ObtenerCategoria");
        int a = 9;
        String expResult = "Intervalo C";
        String result = Intervalos.ObtenerCategoria(a);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testObtenerCategoriaLimA_B() {
        System.out.println("ObtenerCategoria");
        int a = -4;
        String expResult = "Intervalo B";
        String result = Intervalos.ObtenerCategoria(a);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testObtenerCategoriaLimB_C() {
        System.out.println("ObtenerCategoria");
        int a = 6;
        String expResult = "Intervalo C";
        String result = Intervalos.ObtenerCategoria(a);
        assertEquals(expResult, result);
        
    }
}
