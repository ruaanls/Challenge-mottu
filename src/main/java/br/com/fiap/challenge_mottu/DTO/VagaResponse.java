package br.com.fiap.challenge_mottu.DTO;

public class VagaResponse
{
    private String codigoVaga;
    private boolean status;
    private Long id_moto;
    private String corredor;

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

    public Long getId_moto() {
        return id_moto;
    }

    public void setId_moto(Long id_moto) {
        this.id_moto = id_moto;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }
}
