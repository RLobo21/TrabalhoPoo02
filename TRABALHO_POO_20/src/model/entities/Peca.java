package model.entities;

import java.util.Scanner;

public abstract class Peca {
	
	private String descricao;
	private int quantidade;
	private int estoqueMinimo;
	private int estoqueMaximo;
	
	public Peca() {
	}
	
	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}
	
	public abstract void Venda(Scanner sc);

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}
	
	public void reposicaoEstoque() {
		if (this.quantidade<this.estoqueMinimo) {
			this.quantidade=this.estoqueMaximo;
		}else {
			
		}
	}
	

}
