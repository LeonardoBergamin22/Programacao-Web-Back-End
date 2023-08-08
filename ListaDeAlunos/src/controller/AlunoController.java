package controller;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoController {
    private List<Aluno> alunos;

    public AlunoController() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(int id, String nome, int idade) {
        Aluno aluno = new Aluno(id, nome, idade);
        alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }
}
