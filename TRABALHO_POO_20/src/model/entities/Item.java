package model.entities;

import java.util.Scanner;

public interface Item {
    
    void reposicaoEstoque(char tamanho);
    
    String getDescricao();


    void Venda(Scanner sc);
}
