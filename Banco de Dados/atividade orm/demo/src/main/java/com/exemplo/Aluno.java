package com.exemplo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricula;
    
    @Column(name="nomeAluno")
    private String nome;

    @Column(name="turmaAluno")
    private int turma;

    public Aluno(String nome, int turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    
}