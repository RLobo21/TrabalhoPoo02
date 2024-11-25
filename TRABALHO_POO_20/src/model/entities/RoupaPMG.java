package model.entities;

import java.util.Scanner;

public class RoupaPMG implements Item {
	private String descricao;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
	private int estoqueMinimo;
	private int estoqueMaximo;

	public RoupaPMG() {

	}

	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
			int estoqueMaximo) {
		super();
		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeP() {
		return quantidadeP;
	}

	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}

	public int getQuantidadeM() {
		return quantidadeM;
	}

	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}

	public int getQuantidadeG() {
		return quantidadeG;
	}

	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
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

	@Override
	public void reposicaoEstoque(char ch) {
		if (ch == 'p' || ch == 'P') {
			if (this.quantidadeP < this.estoqueMinimo) {
				this.quantidadeP = this.estoqueMaximo;
			}
		} else if (ch == 'm' || ch == 'M') {
			if (this.quantidadeM < this.estoqueMinimo) {
				this.quantidadeM = this.estoqueMaximo;
			}
		} else if (ch == 'g' || ch == 'G') {
			if (this.quantidadeG < this.estoqueMinimo) {
				this.quantidadeG = this.estoqueMaximo;
			}
		}
	}

	public void Venda(Scanner sc) {
		System.out.println();
	    System.out.print("Informe o tamanho da roupa (P, M ou G): ");
	    char ch = Character.toUpperCase(sc.next().charAt(0)); 

	    boolean vendaRealizada = false; 

	    switch (ch) {
	        case 'P':
	            if (this.quantidadeP < this.estoqueMinimo) {
	                reposicaoEstoque(ch);
	                System.out.println("Estoque de P foi reposto.");
	            } else {
	                this.quantidadeP -= 1;
	                System.out.println("Venda realizada para tamanho P.");
	                vendaRealizada = true;
	            }
	            break;
	        case 'M':
	            if (this.quantidadeM < this.estoqueMinimo) {
	                reposicaoEstoque(ch);
	                System.out.println("Estoque de M foi reposto.");
	            } else {
	                this.quantidadeM -= 1;
	                System.out.println("Venda realizada para tamanho M.");
	                vendaRealizada = true;
	            }
	            break;
	        case 'G':
	            if (this.quantidadeG < this.estoqueMinimo) {
	                reposicaoEstoque(ch);
	                System.out.println("Estoque de G foi reposto.");
	            } else {
	                this.quantidadeG -= 1;
	                System.out.println("Venda realizada para tamanho G.");
	                vendaRealizada = true;
	            }
	            break;
	    }
	}

}
