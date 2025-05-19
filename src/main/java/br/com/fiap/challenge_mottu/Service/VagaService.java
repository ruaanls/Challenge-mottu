package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.VagaRequest;
import br.com.fiap.challenge_mottu.DTO.VagaResponse;
import br.com.fiap.challenge_mottu.Mapper.VagaMapper;
import br.com.fiap.challenge_mottu.Model.Vagas;
import br.com.fiap.challenge_mottu.Repository.VagaRepository;

public class VagaService
{
    private final VagaRepository vagaRepository;
    private final VagaMapper vagaMapper;

    public VagaService(VagaRepository vagaRepository, VagaMapper vagaMapper) {
        this.vagaRepository = vagaRepository;
        this.vagaMapper = vagaMapper;
    }


}
