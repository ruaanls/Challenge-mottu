package br.com.fiap.challenge_mottu.DTO;

import jakarta.validation.constraints.NotNull;

public class CorredorRequest
{
    @NotNull(message = "Um corredor precisa estar atrelado a uma área. Adicione o id da área referente a esse corredor")
    private Long idArea;
    @NotNull(message = "Toda área precisa ter um nome de corredor")
    // CRIAR REGEX AQUI NO FUTURO
    private String nome_corredor;

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getNome_corredor() {
        return nome_corredor;
    }

    public void setNome_corredor(String nome_corredor) {
        this.nome_corredor = nome_corredor;
    }
}
