package models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tarefa")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String descricao;
    private String prioridade;
    private LocalDate dataVencimento;
    private String status;
    private LocalDate dataConclusao;

    public Tarefa(int id, String nome, String descricao, String prioridade, String dataVencimento, String status, String dataConclusao) {};



}
