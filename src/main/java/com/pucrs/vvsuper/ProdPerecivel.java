package com.pucrs.vvsuper;

import java.util.Date;

public class ProdPerecivel extends Produto {

    public ProdPerecivel(int codigo, String descricao, double preco, Date dtFab, Date dtVal) throws ProdutoInvalidoException {
        super(codigo, descricao, preco);
    }

    @Override
    public double valorVenda() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}