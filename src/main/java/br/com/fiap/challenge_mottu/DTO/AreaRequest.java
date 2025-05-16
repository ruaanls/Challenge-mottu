package br.com.fiap.challenge_mottu.DTO;

import br.com.fiap.challenge_mottu.Model.TipoArea;

public class AreaRequest
{
    private TipoArea tipoArea;
    private String nomeArea;
    private Long galpaoId;

    public TipoArea getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(TipoArea tipoArea) {
        this.tipoArea = tipoArea;
    }

    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String nomeArea) {
        this.nomeArea = nomeArea;
    }

    public Long getGalpaoId() {
        return galpaoId;
    }

    public void setGalpaoId(Long galpaoId) {
        this.galpaoId = galpaoId;
    }
}
