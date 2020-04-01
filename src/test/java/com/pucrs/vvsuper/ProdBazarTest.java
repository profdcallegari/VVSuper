package com.pucrs.vvsuper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ProdBazarTest {

    // TESTES ATRIBUTO CODIGO
    // --------------------------------------------------------
    @Test(expected = ProdutoInvalidoException.class)
    public void whenCodigoZero_thenException() throws ProdutoInvalidoException {
        ProdBazar p = new ProdBazar(0, "TesteCodigoZero", 1.0);
    }

    @Test(expected = ProdutoInvalidoException.class)
    public void whenCodigoNegativo_thenException() throws ProdutoInvalidoException {
        ProdBazar p = new ProdBazar(-1, "TesteCodigoZero", 1.0);
    }

    @Test
    public void shouldAllow_Codigo1() {
        try {
            int codigo = 1;
            ProdBazar p = new ProdBazar(codigo, "TesteCodigo1", 1.0);
            assertEquals(codigo, p.getCodigo());
        } catch (ProdutoInvalidoException e) {
            fail("TesteCodigo1");
        }
    }

    @Test
    public void shouldAllow_Codigo1000() {
        try {
            int codigo = 1000;
            ProdBazar p = new ProdBazar(codigo, "TesteCodigo1000", 1.0);
            assertEquals(codigo, p.getCodigo());
        } catch (ProdutoInvalidoException e) {
            fail("TesteCodigo1000");
        }
    }

    @Test
    public void shouldAllow_Codigo9999() {
        try {
            int codigo = 9999;
            ProdBazar p = new ProdBazar(codigo, "TesteCodigo9999", 1.0);
            assertEquals(codigo, p.getCodigo());
        } catch (ProdutoInvalidoException e) {
            fail("TesteCodigo9999");
        }
    }

    @Test(expected = ProdutoInvalidoException.class)
    public void whenCodigo10000_thenException() throws ProdutoInvalidoException {
        ProdBazar p = new ProdBazar(10000, "TesteCodigo10000", 1.0);
    }

    // TESTES ATRIBUTO PRECO ---------------------------------------------------------
    @Test(expected = ProdutoInvalidoException.class)
    public void whenPrecoNegativo_thenException () throws ProdutoInvalidoException {
        ProdBazar p = new ProdBazar(1, "TestePrecoNegativo", -1.0);
    }

    @Test(expected = ProdutoInvalidoException.class)
    public void whenPrecoZero_thenException () throws ProdutoInvalidoException {
        ProdBazar p = new ProdBazar(1, "TestePrecoZero", 0.0);
    }

    @Test
    public void shouldAllow_PrecoPositivo() {
        try {
            double preco = 153.65;
            ProdBazar p = new ProdBazar(1, "TestePrecoPositivo", preco);
            assertEquals(preco, p.getPreco(), 0.01);
        } catch (ProdutoInvalidoException e) {
            fail("TestePrecoPositivo");
        }
    }
    

  

}