/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculartienda;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jorda
 */
public class CalcularTiendaTest {
    
    public CalcularTiendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularPrecioFinal method, of class CalcularTienda.
     */
    @Test
    public void testCalcularPrecioFinal() {
        System.out.println("calcularPrecioFinal");
        double precioUnitario = 0.0;
        int cantidad = 0;
        CalcularTienda instance = new CalcularTienda();
        double expResult = 0.0;
        double result = instance.calcularPrecioFinal(precioUnitario, cantidad);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPrecioConIVA method, of class CalcularTienda.
     */
    @Test
    public void testCalcularPrecioConIVA() {
        System.out.println("calcularPrecioConIVA");
        double precioFinal = 0.0;
        CalcularTienda instance = new CalcularTienda();
        double expResult = 0.0;
        double result = instance.calcularPrecioConIVA(precioFinal);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
