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
public class PontuacaoTableModelTest {
    
    public PontuacaoTableModelTest() {
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
     * Test of getColumnName method, of class PontuacaoTableModel.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        PontuacaoTableModel instance = new PontuacaoTableModel();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class PontuacaoTableModel.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        PontuacaoTableModel instance = new PontuacaoTableModel();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class PontuacaoTableModel.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        PontuacaoTableModel instance = new PontuacaoTableModel();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class PontuacaoTableModel.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        PontuacaoTableModel instance = new PontuacaoTableModel();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarLinha method, of class PontuacaoTableModel.
     */
    @Test
    public void testAdicionarLinha() {
        System.out.println("adicionarLinha");
        Pontuacao pontuacao = null;
        PontuacaoTableModel instance = new PontuacaoTableModel();
        instance.adicionarLinha(pontuacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirLinha method, of class PontuacaoTableModel.
     */
    @Test
    public void testExcluirLinha() {
        System.out.println("excluirLinha");
        int linha = 0;
        PontuacaoTableModel instance = new PontuacaoTableModel();
        instance.excluirLinha(linha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
