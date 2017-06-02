/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johan Herrera
 */
public class ListaSimpleTest {

    public ListaSimpleTest() {
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
     * Test of getCabeza method, of class ListaSimple.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaSimple instance = new ListaSimple();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCabeza method, of class ListaSimple.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Nodo cabeza = null;
        ListaSimple instance = new ListaSimple();
        instance.setCabeza(cabeza);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCont method, of class ListaSimple.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        ListaSimple instance = new ListaSimple();
        int expResult = 0;
        int result = instance.getCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCont method, of class ListaSimple.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        int cont = 0;
        ListaSimple instance = new ListaSimple();
        instance.setCont(cont);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSize method, of class ListaSimple.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ListaSimple instance = new ListaSimple();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setSize method, of class ListaSimple.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        ListaSimple instance = new ListaSimple();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of size method, of class ListaSimple.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListaSimple instance = new ListaSimple();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of isEmpty method, of class ListaSimple.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ListaSimple instance = new ListaSimple();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of add method, of class ListaSimple.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String dato = "";
        ListaSimple instance = new ListaSimple();
        instance.add(dato);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of valoresMenores method, of class ListaSimple.
     */
    @Test
    public void testValoresMenores() {
        System.out.println("valoresMenores");
        ListaSimple instance = new ListaSimple();
        String expResult = "";
        String result = instance.valoresMenores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarLista method, of class ListaSimple.
     */
    @Test
    public void testMostrarLista() {
        System.out.println("mostrarLista");
        ListaSimple instance = new ListaSimple();
        instance.mostrarLista();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of invertirLista method, of class ListaSimple.
     */
    @Test
    public void testInvertirLista() {
        System.out.println("invertirLista");
        ListaSimple instance = new ListaSimple();
        instance.invertirLista();
        // TODO review the generated test code and remove the default call to fail.

    }

}
