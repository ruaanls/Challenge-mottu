package br.com.fiap.challenge_mottu.DTO;

import java.util.Map;

public class ApiErrorResponse
{
    private String erro; // Campo "Erro"
    private Map<String, String> motivo; // Campo "Motivo" será um mapa de campo -> mensagem

    public ApiErrorResponse(String erro, Map<String, String> motivo) {
        this.erro = erro;
        this.motivo = motivo;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public Map<String, String> getMotivo() {
        return motivo;
    }

    public void setMotivo(Map<String, String> motivo) {
        this.motivo = motivo;
    }
}
