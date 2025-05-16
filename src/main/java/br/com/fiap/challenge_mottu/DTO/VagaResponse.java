package br.com.fiap.challenge_mottu.DTO;

public class VagaResponse
{
    private String codigoVaga;
    private boolean status;
    private MotoResponse motoResponse;

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

    public MotoResponse getMotoResponse() {
        return motoResponse;
    }

    public void setMotoResponse(MotoResponse motoResponse) {
        this.motoResponse = motoResponse;
    }
}
