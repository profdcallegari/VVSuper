package com.pucrs.vvsuper;

import java.util.List;

public class KitDeProdutos extends Produto {

    private List<Produto> listaDeProdutos;


    public KitDeProdutos(int codigo, String descricao) throws ProdutoInvalidoException {
        super(codigo, descricao, Double.MAX_VALUE);  // Iniciando um kit com valor possível, porém inútil.
    }

    public boolean isValido () {
        return false;
    }

    public boolean adicionarProduto (Produto produto) {
        return false;
    }

    public boolean removerProduto (Produto produto) {
        return false;
    }

    public int getQuantidade () {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double valorVenda() {
        return 0;
    }

}