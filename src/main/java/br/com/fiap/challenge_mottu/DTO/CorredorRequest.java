package br.com.fiap.challenge_mottu.DTO;

public class CorredorRequest
{
    private Long idArea;
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
