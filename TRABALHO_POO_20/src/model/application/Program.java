package model.application;

import java.util.Scanner;

import model.entities.Acessorio;
import model.entities.Item;
import model.entities.RoupaPMG;
import model.entities.RoupaTamanhoUnico;

public class Program {
	public static void main(String[] args) {

		Item[] itens = new Item[5];

		itens[0] = new RoupaPMG("Camiseta", 10, 5, 3, 2, 10);
		itens[1] = new RoupaPMG("Saia", 4, 7, 5, 1, 8);
		itens[2] = new Acessorio("Cinto", 20, 5, 30);
		itens[3] = new Acessorio("Pulseira", 15, 3, 20);
		itens[4] = new RoupaTamanhoUnico("Saída de Praia", 12, 3, 25);

		Scanner sc = new Scanner(System.in);
		int opcao;

		do {

			
			for (int i = 0; i < itens.length; i++) {
				System.out.println(i + " - " + itens[i].getDescricao());
			}
			System.out.println("5 - Sair do sistema");
			
			System.out.println();
			System.out.print("Escolha um item (digite o número correspondente):");

			opcao = sc.nextInt();

			if (opcao >= 0 && opcao < 5) {

				itens[opcao].Venda(sc);

				itens[opcao].reposicaoEstoque(' ');
			}

		} while (opcao != 5);

		System.out.println("\nEstoque final dos produtos:");
		for (int i = 0; i < itens.length; i++) {
			System.out.println(itens[i].getDescricao() + " - Estoque P: " + ((RoupaPMG) itens[i]).getQuantidadeP()
					+ ", M: " + ((RoupaPMG) itens[i]).getQuantidadeM() + ", G: "
					+ ((RoupaPMG) itens[i]).getQuantidadeG());
		}
		sc.close();
	}
}
