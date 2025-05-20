package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.VagaRequest;
import br.com.fiap.challenge_mottu.DTO.VagaResponse;
import br.com.fiap.challenge_mottu.Mapper.VagaMapper;
import br.com.fiap.challenge_mottu.Model.Vagas;
import br.com.fiap.challenge_mottu.Repository.CorredorRepository;
import br.com.fiap.challenge_mottu.Repository.VagaRepository;

public class VagaService
{
    private final VagaRepository vagaRepository;
    private final VagaMapper vagaMapper;
    private final CorredorRepository corredorRepository;

    public VagaService(VagaRepository vagaRepository, VagaMapper vagaMapper, CorredorRepository corredorRepository) {
        this.vagaRepository = vagaRepository;
        this.vagaMapper = vagaMapper;
        this.corredorRepository = corredorRepository;
    }


}
