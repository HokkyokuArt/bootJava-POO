package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class ProdutoMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informar os dados do produto:");
        System.out.println("\nNome:");
        String nome = sc.nextLine();
        System.out.println("\nQuantidade:");
        int quantidade = sc.nextInt();
        System.out.println("\nPreço:");
        double valor = sc.nextDouble();

        Produto celular = new Produto(nome, valor, quantidade);

        System.out.printf("\n\nNome: %s ", celular.nome);
        System.out.printf("\nQuantidade: %d", celular.quantidade);
        System.out.printf("\nPreço: R$ %.2f ", celular.valorUnitario);

        System.out.printf("\nImposto: R$ %.2f", celular.valorImposto());
        System.out.printf("\nTotal em estoque: R$ %.2f", celular.valorEstoque());

        sc.close();
    }
}
