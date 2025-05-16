package br.com.fiap.challenge_mottu.DTO;

public class VagaRequest
{
    private Long idCorredor;
    private String codigoVaga;
    private boolean status;
    private Long idMoto;

    public Long getIdCorredor() {
        return idCorredor;
    }

    public void setIdCorredor(Long idCorredor) {
        this.idCorredor = idCorredor;
    }

    public String getCodigoVaga() {
        return codigoVaga;
    }

    public void setCodigoVaga(String codigoVaga) {
        this.codigoVaga = codigoVaga;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getIdMoto() {
        return idMoto;
    }

    public void setIdMoto(Long idMoto) {
        this.idMoto = idMoto;
    }
}
