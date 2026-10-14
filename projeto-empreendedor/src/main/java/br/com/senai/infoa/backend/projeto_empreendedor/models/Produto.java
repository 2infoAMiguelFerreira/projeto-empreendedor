package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="produto")

public class Produto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="preco")
    private float preco;

    @Column(name="data_fabricacao")
    private LocalDate data_fabricacao;

    // construtores
    //#region

    public Produto() {
    }

    public Produto(Integer id, String nome, float preco, LocalDate data_fabricacao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.data_fabricacao = data_fabricacao;
    }


    //#endregion

    // getters e setters
    //#region

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public LocalDate getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(LocalDate data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    //#endregion
}
