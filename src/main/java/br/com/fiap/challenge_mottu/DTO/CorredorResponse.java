package br.com.fiap.challenge_mottu.DTO;

import br.com.fiap.challenge_mottu.Model.Vagas;

import java.util.List;

public class CorredorResponse
{
    private Long idCorredor;
    private String nomeCorredor;


    public String getNomeCorredor() {
        return nomeCorredor;
    }

    public void setNomeCorredor(String nomeCorredor) {
        this.nomeCorredor = nomeCorredor;
    }

    public Long getIdCorredor() {
        return idCorredor;
    }

    public void setIdCorredor(Long idCorredor) {
        this.idCorredor = idCorredor;
    }
}
