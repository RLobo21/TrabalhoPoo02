package model.entities;

import java.util.Scanner;

public class Acessorio extends Peca implements Item {

	
	public Acessorio() {
		super();
	}

	public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	@Override
	public void Venda(Scanner sc) {
		System.out.println();
	    System.out.println("Informe a quantidade de itens: ");
	    int x = sc.nextInt();
	    if (x > this.getQuantidade()) { 
	        System.out.println("Quantidade insuficiente no estoque!");
	    } else {
	        this.setQuantidade(this.getQuantidade() - x); 
	        System.out.println("Venda realizada com sucesso!");
	        reposicaoEstoque();
	    }
	}

	@Override
	public void reposicaoEstoque(char tamanho) {
		// TODO Auto-generated method stub
		
	}

}
