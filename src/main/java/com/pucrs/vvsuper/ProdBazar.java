package com.pucrs.vvsuper;

public class ProdBazar extends Produto{

    public static final double IMPOSTO = 5.25;

    public ProdBazar(int codigo, String descricao, double precoCusto) throws ProdutoInvalidoException {
        super(codigo, descricao, precoCusto);
    }

    @Override
    public double valorVenda() {
        return 0;
    }
}