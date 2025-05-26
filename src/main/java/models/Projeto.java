package models;

import jakarta.persistence.*;

@Entity
@Table(name = "projeto")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String nome;

    public Projeto(int id, String nome, String descricao, String dataInicio, String previstaFim) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.previstaFim = previstaFim;
    }

    private String descricao;
    private String dataInicio;
    private String previstaFim;
}
