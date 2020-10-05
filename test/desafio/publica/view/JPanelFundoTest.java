/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.publica.view;

import java.awt.Graphics;
import javax.swing.ImageIcon;
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
public class JPanelFundoTest {
    
    public JPanelFundoTest() {
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
     * Test of paintComponent method, of class JPanelFundo.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        JPanelFundo instance = new JPanelFundo();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFundo method, of class JPanelFundo.
     */
    @Test
    public void testGetFundo() {
        System.out.println("getFundo");
        JPanelFundo instance = new JPanelFundo();
        ImageIcon expResult = null;
        ImageIcon result = instance.getFundo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFundo method, of class JPanelFundo.
     */
    @Test
    public void testSetFundo() {
        System.out.println("setFundo");
        ImageIcon fundo = null;
        JPanelFundo instance = new JPanelFundo();
        instance.setFundo(fundo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
