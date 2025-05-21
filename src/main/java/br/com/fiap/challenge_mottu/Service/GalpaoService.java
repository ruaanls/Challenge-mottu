package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.GalpaoRequest;
import br.com.fiap.challenge_mottu.DTO.GalpaoResponse;
import br.com.fiap.challenge_mottu.Mapper.GalpaoMapper;
import br.com.fiap.challenge_mottu.Model.Area;
import br.com.fiap.challenge_mottu.Model.Corredor;
import br.com.fiap.challenge_mottu.Model.Galpao;
import br.com.fiap.challenge_mottu.Model.Vagas;
import br.com.fiap.challenge_mottu.Repository.GalpaoRepository;
import org.springframework.stereotype.Service;

@Service
public class GalpaoService
{
    private final GalpaoRepository galpaoRepository;
    private final GalpaoMapper galpaoMapper;

    public GalpaoService(GalpaoRepository galpaoRepository, GalpaoMapper galpaoMapper) {
        this.galpaoRepository = galpaoRepository;
        this.galpaoMapper = galpaoMapper;
    }


    public GalpaoResponse createGalpao(GalpaoRequest galpaoRequest)
    {
        Galpao galpao = new Galpao();
        galpao = galpaoMapper.requestToGalpao(galpaoRequest);
        Galpao galpaoSalvo = galpaoRepository.save(galpao);
        return galpaoMapper.galpaoToResponse(galpaoSalvo);
    }
}
