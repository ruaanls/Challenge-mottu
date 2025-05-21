package br.com.fiap.challenge_mottu.DTO;

import br.com.fiap.challenge_mottu.Model.TipoArea;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AreaRequest
{
    @NotNull(message = "A área deve pertencer a um dos dois tipos: NOVA (Motos novas) ou DEFEITO (Motos com defeitos) ")
    private TipoArea tipoArea;
    @NotNull(message = "A área deve ter um nome")
    private String nomeArea;
    @NotNull(message = "A área deve pertencer a um galpão, adicione o id de um galpão já criado")
    private Long galpaoId;
    @NotNull(message = "A área deve ter uma capacidade máxima")
    private int capacidadeMax;

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

    @NotNull(message = "A área deve ter uma capacidade máxima")
    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(@NotNull(message = "A área deve ter uma capacidade máxima") int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }
}
