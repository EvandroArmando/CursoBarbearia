/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Evandro Armando
 */
public class ClienteIT {
    
    public ClienteIT() {
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
     * Test of getEndereco method, of class Cliente.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Cliente instance = null;
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Cliente.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "";
        Cliente instance = null;
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class Cliente.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Cliente instance = null;
        String expResult = "";
        String result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCep method, of class Cliente.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        String cep = "";
        Cliente instance = null;
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
