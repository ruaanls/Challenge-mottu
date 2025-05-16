package br.com.fiap.challenge_mottu.DTO;

import java.util.List;

public class GalpaoResponse
{
    private String nome;
    private String logradouro;
    private int numero;
    private List<CorredorResponse> corredores;

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<CorredorResponse> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<CorredorResponse> corredores) {
        this.corredores = corredores;
    }
}
