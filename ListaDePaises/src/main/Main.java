package main;

import java.util.Scanner;

import paiscontroller.PaisController;

public class Main {

	public static void main(String[] args) {
		PaisController paisController = new PaisController();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("+========= Menu ==========+");
			System.out.println("|1. Adicionar pais        |");
			System.out.println("|2. Exibir lista de paises|");
			System.out.println("|3. Remover pais          |");
			System.out.println("|4. Limpar lista          |");
			System.out.println("|0. Sair                  |");
			System.out.println("|Escolha uma op��o        |");
			System.out.println("+-------------------------+");
			System.out.println("                           ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do pais:");
				scanner.nextLine();
				String nome = scanner.nextLine();

				System.out.println("Digite a capital do pais " + nome + ":");
				String capital = scanner.nextLine();

				paisController.adicionarPais(nome, capital);
				System.out.println("Pais adicionado com sucesso ");
				break;

			case 2:
				System.out.println("Aqui os paises que ja est�o adicionados : ");
				paisController.exibirListaDePaises();
				break;
				
			case 3:
				System.out.println("Degeja remover qual pais: ");
				scanner.nextLine();
				String nomePais = scanner.nextLine();
				paisController.removerDaListaDePaises(nomePais);
				break;
				
			case 4:
				paisController.limparLista();
				
				break;

			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opi��o invalida");
				break;
			}
		}
	}
}