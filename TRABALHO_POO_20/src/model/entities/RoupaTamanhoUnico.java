package model.entities;

import java.util.Scanner;

public class RoupaTamanhoUnico extends Peca implements Item {

    
    public RoupaTamanhoUnico() {
        super();
    }

    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void Venda(Scanner sc) {
    	System.out.println();
        if (this.getQuantidade() <= 0) {
            reposicaoEstoque();
            System.out.println("Estoque em reposição!");
        } else {
            this.setQuantidade(this.getQuantidade() - 1);
            System.out.println("Venda realizada com sucesso!");
        }
    }

	@Override
	public void reposicaoEstoque(char tamanho) {
		
	}

}
