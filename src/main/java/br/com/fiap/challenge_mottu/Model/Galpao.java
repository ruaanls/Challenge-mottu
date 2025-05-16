package br.com.fiap.challenge_mottu.Model;

public class Galpao
{
    private Long id;
    private String logradouro;
    private String numero;
    private String estado;
    private String cidade;
    private String nome;
    private int capacidade_max;
    private int capacidade_atual;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade_max() {
        return capacidade_max;
    }

    public void setCapacidade_max(int capacidade_max) {
        this.capacidade_max = capacidade_max;
    }

    public int getCapacidade_atual() {
        return capacidade_atual;
    }

    public void setCapacidade_atual(int capacidade_atual) {
        this.capacidade_atual = capacidade_atual;
    }
}
