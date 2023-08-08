package view;


import java.util.List;
import java.util.Scanner;
import controller.AlunoController;
import model.Aluno;

public class AlunoView {
    private AlunoController alunoController;
    private Scanner scanner;

    public AlunoView() {
        alunoController = new AlunoController();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao = -1;
        while (opcao != 0) {
        	
            System.out.println("==== Menu ====");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            System.out.print("                   ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do aluno: ");
                    System.out.print("                   ");
                    int id = scanner.nextInt();
                    System.out.print("Digite o nome do aluno: ");
                    System.out.print("                   ");
                    String nome = scanner.next();
                    System.out.print("Digite a idade do aluno: ");
                    System.out.print("                   ");
                    int idade = scanner.nextInt();
                    alunoController.adicionarAluno(id, nome, idade);
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opicao invalida.");
                    break;
            }
        }
    }

    public void listarAlunos() {
        List<Aluno> alunos = alunoController.listarAlunos();
        if (alunos.isEmpty()) {
            System.out.println("Nao ha alunos cadastrados.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println("ID: " + aluno.getId() + ", Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
            }
        }
    }
}
