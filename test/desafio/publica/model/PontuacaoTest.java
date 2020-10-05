/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.publica.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PICHAU
 */
public class PontuacaoTest {
    
    public PontuacaoTest() {
   
        
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
     * Test of getContador method, of class Pontuacao.
     */
    @Test
    public void testGetContador() {
        System.out.println("getContador");
        int expResult = 0;
        int result = Pontuacao.getContador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContador method, of class Pontuacao.
     */
    @Test
    public void testSetContador() {
        System.out.println("setContador");
        int contador = 0;
        Pontuacao.setContador(contador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPontos method, of class Pontuacao.
     */
    @Test
    public void testGetPontos() {
        System.out.println("getPontos");
        Pontuacao instance = new Pontuacao();
        int expResult = 0;
        int result = instance.getPontos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPontos method, of class Pontuacao.
     */
    @Test
    public void testSetPontos() {
        System.out.println("setPontos");
        int pontos = 0;
        Pontuacao instance = new Pontuacao();
        instance.setPontos(pontos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogo method, of class Pontuacao.
     */
    @Test
    public void testGetJogo() {
        System.out.println("getJogo");
        Pontuacao instance = new Pontuacao();
        int expResult = 0;
        int result = instance.getJogo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJogo method, of class Pontuacao.
     */
    @Test
    public void testSetJogo() {
        System.out.println("setJogo");
        int jogo = 0;
        Pontuacao instance = new Pontuacao();
        instance.setJogo(jogo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecordeMinimo method, of class Pontuacao.
     */
    @Test
    public void testGetRecordeMinimo() {
        System.out.println("getRecordeMinimo");
        Pontuacao instance = new Pontuacao();
        int expResult = 0;
        int result = instance.getRecordeMinimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecordeMaximo method, of class Pontuacao.
     */
    @Test
    public void testGetRecordeMaximo() {
        System.out.println("getRecordeMaximo");
        Pontuacao instance = new Pontuacao();
        int expResult = 0;
        int result = instance.getRecordeMaximo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecordeMinimo method, of class Pontuacao.
     */
    @Test
    public void testSetRecordeMinimo() {
        System.out.println("setRecordeMinimo");
        int recordeMinimo = 0;
        Pontuacao instance = new Pontuacao();
        instance.setRecordeMinimo(recordeMinimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecordeMaximo method, of class Pontuacao.
     */
    @Test
    public void testSetRecordeMaximo() {
        System.out.println("setRecordeMaximo");
        int recordeMaximo = 0;
        Pontuacao instance = new Pontuacao();
        instance.setRecordeMaximo(recordeMaximo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximo method, of class Pontuacao.
     */
    @Test
    public void testGetMaximo() {
        System.out.println("getMaximo");
        Pontuacao instance = new Pontuacao();
        int expResult = 0;
        int result = instance.getMaximo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaximo method, of class Pontuacao.
     */
    @Test
    public void testSetMaximo() {
        System.out.println("setMaximo");
        int maximo = 0;
        Pontuacao instance = new Pontuacao();
        instance.setMaximo(maximo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinimo method, of class Pontuacao.
     */
    @Test
    public void testGetMinimo() {
        System.out.println("getMinimo");
        Pontuacao instance = new Pontuacao();
        int expResult = 0;
        int result = instance.getMinimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinimo method, of class Pontuacao.
     */
    @Test
    public void testSetMinimo() {
        System.out.println("setMinimo");
        int minimo = 0;
        Pontuacao instance = new Pontuacao();
        instance.setMinimo(minimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximo_ method, of class Pontuacao.
     */
    @Test
    public void testGetMaximo_() {
        System.out.println("getMaximo_");
        int expResult = 0;
        int result = Pontuacao.getMaximo_();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaximo_ method, of class Pontuacao.
     */
    @Test
    public void testSetMaximo_() {
        System.out.println("setMaximo_");
        int maximo_ = 0;
        Pontuacao.setMaximo_(maximo_);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinimo_ method, of class Pontuacao.
     */
    @Test
    public void testGetMinimo_() {
        System.out.println("getMinimo_");
        int expResult = 0;
        int result = Pontuacao.getMinimo_();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinimo_ method, of class Pontuacao.
     */
    @Test
    public void testSetMinimo_() {
        System.out.println("setMinimo_");
        int minimo_ = 0;
        Pontuacao.setMinimo_(minimo_);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarContarRecorde method, of class Pontuacao.
     */
    @Test
    public void testOrdenarContarRecorde() {
        Pontuacao pontuacao = new Pontuacao();
        pontuacao.ordenarContarRecorde(50);
        assertEquals(50, pontuacao.getMinimo());
    }
    
}
