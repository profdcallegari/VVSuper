package com.pucrs.vvsuper;

public abstract class Produto {

	private int codigo;			// Intervalo [1; 9999]
	private String descricao;	// Pelo menos 2 caracteres
	private double preco;		// Deve ser positivo

	public Produto(int codigo, String descricao, double preco) throws ProdutoInvalidoException {
		this.codigo = codigo;
		
		this.descricao = descricao;
		
		if (preco > 0.0)
			this.preco = preco;
		else
			throw new ProdutoInvalidoException(preco + " preço inválido. Deve ser positivo.");
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public abstract double valorVenda();

	public String toString() {
		return "";
	}

}
