package main;

import java.util.Scanner;

import controller.ListaDeTarefasController;

public class Principal {

	public static void main(String[] args) {

		ListaDeTarefasController listaDeTarefasController = new ListaDeTarefasController();

		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		while (opcao != 6) {
			System.out.println("+========= Menu ==========+");
			System.out.println("|1. Adicionar tarefas     |");
			System.out.println("|2. Remover uma terefa    |");
			System.out.println("|3. Listar tarefas        |");
			System.out.println("|4. Atualizar terefa      |");
			System.out.println("|5. Limpar lista          |");
			System.out.println("|6. Sair                  |");
			System.out.println("|Escolha uma opção        |");
			System.out.println("+-------------------------+");
			System.out.println("                           ");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Nome da tarefa: ");
				String nomeDaTarefa = scanner.next();
				listaDeTarefasController.adicionarTarefa(nomeDaTarefa);

				break;

			case 2:
				System.out.println("Qual é o nome da tarefa que voce quer remover :");
				String nomeDaTarefaRemovida = scanner.next();
				listaDeTarefasController.removerTarefa(nomeDaTarefaRemovida);
				break;

			case 3:
				listaDeTarefasController.exibirListaDeTarefas();
				break;

			case 4:
				System.out.println("Digite a tarefa que voce quer atualizar");
				scanner.nextLine();
				String nome = scanner.nextLine();
				listaDeTarefasController.atulizarStatus(nome);
				
				break;

			case 5:
				listaDeTarefasController.limparLista();
				break;

			case 6:
				System.out.println("Saindo...");
				break;
				

			default:
				System.out.println("Opcao invalida");
				break;
			}

		}

	}
}
