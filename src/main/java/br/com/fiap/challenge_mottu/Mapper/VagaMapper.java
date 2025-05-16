package br.com.fiap.challenge_mottu.Mapper;

import br.com.fiap.challenge_mottu.DTO.VagaRequest;
import br.com.fiap.challenge_mottu.DTO.VagaResponse;
import br.com.fiap.challenge_mottu.Model.Vagas;

public class VagaMapper
{
    public Vagas requestToVagas(VagaRequest vagaRequest)
    {
        if(vagaRequest == null)
        {
            return null;
        }

        Vagas vaga = new Vagas();
        vaga.setCodigoVaga(vagaRequest.getCodigoVaga());
        return vaga;
    }

    public VagaResponse vagaToResponse(Vagas vaga)
    {
        if(vaga == null)
        {
            return null;
        }
        VagaResponse vagaResponse = new VagaResponse();
        vagaResponse.setStatus(vagaResponse.isStatus());
        vagaResponse.setCodigoVaga(vaga.getCodigoVaga());
        return vagaResponse;
    }
}
