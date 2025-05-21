package br.com.fiap.challenge_mottu.Mapper;

import br.com.fiap.challenge_mottu.DTO.VagaRequest;
import br.com.fiap.challenge_mottu.DTO.VagaResponse;
import br.com.fiap.challenge_mottu.Model.Vagas;
import org.springframework.stereotype.Component;

@Component
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
        vaga.setStatus(false);
        vaga.setMoto(null);
        return vaga;
    }

    public VagaResponse vagaToResponse(Vagas vaga)
    {
        if(vaga == null)
        {
            return null;
        }
        VagaResponse vagaResponse = new VagaResponse();
        vagaResponse.setIdVaga(vaga.getId());
        vagaResponse.setStatus(vagaResponse.isStatus());
        vagaResponse.setCodigoVaga(vaga.getCodigoVaga());
        if(vaga.getMoto() != null)
        {
            vagaResponse.setId_moto(vaga.getMoto().getId_moto());
        }
        vagaResponse.setCorredor(vaga.getCorredor().getNomeCorredor());
        return vagaResponse;
    }
}
