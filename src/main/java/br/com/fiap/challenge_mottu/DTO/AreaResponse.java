package br.com.fiap.challenge_mottu.DTO;

import br.com.fiap.challenge_mottu.Model.TipoArea;

import java.util.List;

public class AreaResponse
{
    private Long idArea;
    private String nome;
    private TipoArea tipoArea;
    private int capacidade_max;

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArea getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(TipoArea tipoArea) {
        this.tipoArea = tipoArea;
    }

    public int getCapacidade_max() {
        return capacidade_max;
    }

    public void setCapacidade_max(int capacidade_max) {
        this.capacidade_max = capacidade_max;
    }


}
