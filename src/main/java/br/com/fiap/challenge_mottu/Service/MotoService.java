package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.MotoRequest;
import br.com.fiap.challenge_mottu.DTO.MotoResponse;
import br.com.fiap.challenge_mottu.Mapper.MotoMapper;
import br.com.fiap.challenge_mottu.Model.Moto;
import br.com.fiap.challenge_mottu.Model.Vagas;
import br.com.fiap.challenge_mottu.Repository.MotoRepository;
import br.com.fiap.challenge_mottu.Repository.VagaRepository;
import jakarta.persistence.EntityNotFoundException;

public class MotoService
{
    private final MotoRepository motoRepository;
    private final MotoMapper motoMapper;
    private final VagaRepository vagaRepository;

    public MotoService(MotoRepository motoRepository, MotoMapper motoMapper, VagaRepository vagaRepository) {
        this.motoRepository = motoRepository;
        this.motoMapper = motoMapper;
        this.vagaRepository = vagaRepository;
    }

    public MotoResponse createMoto(MotoRequest motoRequest)
    {
        Vagas vaga = vagaRepository.findById(motoRequest.getIdVaga()).orElseThrow(()->  new EntityNotFoundException("Vaga não encontrada"));
        Moto moto = motoMapper.requestToMoto(motoRequest);
        moto.setVaga(vaga); // Adiciona um objeto Vaga a uma moto
        vaga.setMoto(moto);
        vaga.setStatus(false); // Atualiza o objeto vaga atrelado a uma moto no banco de dados
        Moto motoSalva = motoRepository.save(moto);
        return motoMapper.motoToResponse(motoSalva);
    }

    public MotoResponse findMoto (MotoRequest motoRequest)
    {
        Moto moto = motoRepository.findById(motoRequest.getIdVaga())
                .orElseThrow(()->  new EntityNotFoundException ("Moto não encontrada"));
        return motoMapper.motoToResponse(moto);
    }
}
