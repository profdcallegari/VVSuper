package com.pucrs.vvsuper;

public class ProdBazar extends Produto{

    private static final double IMPOSTO = 5.25;

    public ProdBazar(int codigo, String descricao, double preco) throws ProdutoInvalidoException {
        super(codigo, descricao, preco);
    }

    @Override
    public double valorVenda() {
        return 0;
    }
}