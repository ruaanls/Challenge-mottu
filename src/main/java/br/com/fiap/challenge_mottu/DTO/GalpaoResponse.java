package br.com.fiap.challenge_mottu.DTO;

import java.util.List;

public class GalpaoResponse
{
    private Long idGalpao;
    private String nome;
    private String logradouro;
    private String numero;
    private int capacidadeMax;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Long getIdGalpao() {
        return idGalpao;
    }

    public void setIdGalpao(Long idGalpao) {
        this.idGalpao = idGalpao;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }
}
