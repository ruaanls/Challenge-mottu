package br.com.fiap.challenge_mottu.Mapper;

import br.com.fiap.challenge_mottu.DTO.GalpaoRequest;
import br.com.fiap.challenge_mottu.DTO.GalpaoResponse;
import br.com.fiap.challenge_mottu.Model.Galpao;
import org.springframework.stereotype.Component;

@Component
public class GalpaoMapper
{
    public Galpao requestToGalpao(GalpaoRequest galpaoRequest)
    {
        if(galpaoRequest == null)
        {
            return null;
        }
        Galpao galpao = new Galpao();
        galpao.setNome(galpaoRequest.getNome());
        galpao.setCidade(galpaoRequest.getCidade());
        galpao.setEstado(galpaoRequest.getEstado());
        galpao.setCapacidade_max(galpaoRequest.getCapacidade_max());
        galpao.setLogradouro(galpaoRequest.getLogradouro());
        galpao.setNumero(galpaoRequest.getNumero());
        return galpao;
    }

    public GalpaoResponse galpaoToResponse(Galpao galpao)
    {
        if(galpao == null)
        {
            return null;
        }

        GalpaoResponse galpaoResponse = new GalpaoResponse();
        galpaoResponse.setLogradouro(galpao.getLogradouro());
        galpaoResponse.setNome(galpao.getNome());
        galpaoResponse.setNumero(galpao.getNumero());
        galpaoResponse.setIdGalpao(galpao.getId());
        galpaoResponse.setCapacidadeMax(galpao.getCapacidade_max());
        return galpaoResponse;
    }
}
