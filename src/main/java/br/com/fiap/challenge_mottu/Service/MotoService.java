package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.MotoResponse;
import br.com.fiap.challenge_mottu.Mapper.MotoMapper;
import br.com.fiap.challenge_mottu.Repository.MotoRepository;

public class MotoService
{
    private final MotoRepository motoRepository;
    private final MotoMapper motoMapper;

    public MotoService(MotoRepository motoRepository, MotoMapper motoMapper) {
        this.motoRepository = motoRepository;
        this.motoMapper = motoMapper;
    }

    public MotoResponse createMoto
}
