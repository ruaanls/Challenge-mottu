package br.com.fiap.challenge_mottu.DTO;

import br.com.fiap.challenge_mottu.Model.Vagas;

import java.util.List;

public class CorredorResponse
{
    private String nomeCorredor;
    private List<VagaResponse> vagas;

    public String getNomeCorredor() {
        return nomeCorredor;
    }

    public void setNomeCorredor(String nomeCorredor) {
        this.nomeCorredor = nomeCorredor;
    }

    public List<VagaResponse> getVagas() {
        return vagas;
    }

    public void setVagas(List<VagaResponse> vagas) {
        this.vagas = vagas;
    }
}
