package com.pucrs.vvsuper;

public class ProdEletrodomestico extends Produto {

    private String tensao; // "110v", "220v", "bivolt"

    public ProdEletrodomestico(int codigo, String descricao, double preco, String tensao) throws ProdutoInvalidoException {
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