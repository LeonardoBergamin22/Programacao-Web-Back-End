package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.PlanetaController;

public class Main {

	public static void main(String[] args) {
		PlanetaController planetaController = new PlanetaController();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("+========= Menu ===========+");
			System.out.println("|1. Adicionar planeta      |");
			System.out.println("|2. Exibir lista de planeta|");
			System.out.println("|3. Remover planeta        |");
			System.out.println("|4. Limpar lista           |");
			System.out.println("|0. Sair                   |");
			System.out.println("|Escolha uma opção         |");
			System.out.println("+--------------------------+");
			System.out.println("                            ");

			
			try {
				opcao = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Caracter digitado invalido insira um caractere valido \n");
				scanner.nextLine();
			}
			
			

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do planeta:");
				scanner.nextLine();
				String nome = scanner.nextLine();

				planetaController.adicionarPlaneta(nome);
				System.out.println("Planeta adicionado com sucesso ");
				break;

			case 2:
				System.out.println("Aqui os planetas que ja estão adicionados : ");
				planetaController.exibirListaDePlaneta();
				break;

			case 3:
				System.out.println("Dejeja remover qual planeta: ");
				scanner.nextLine();
				String nomePlaneta = scanner.nextLine();
				planetaController.removerDaListaDePlanetas(nomePlaneta);
				break;

			case 4:
				planetaController.limparLista();
				break;

			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opcao invalida \n");
				break;
			}
		}
	}
}
