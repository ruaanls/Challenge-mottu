package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.VagaRequest;
import br.com.fiap.challenge_mottu.DTO.VagaResponse;
import br.com.fiap.challenge_mottu.Mapper.VagaMapper;
import br.com.fiap.challenge_mottu.Model.Corredor;
import br.com.fiap.challenge_mottu.Model.Vagas;
import br.com.fiap.challenge_mottu.Repository.CorredorRepository;
import br.com.fiap.challenge_mottu.Repository.VagaRepository;
import jakarta.persistence.EntityNotFoundException;

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

    public VagaResponse createVaga (VagaRequest vagaRequest)
    {
        Corredor corredor = corredorRepository.findById(vagaRequest.getIdCorredor()).orElseThrow(() -> new EntityNotFoundException ("Corredor não encontrado"));
        Vagas vagas = vagaMapper.requestToVagas(vagaRequest);
        vagas.setMoto(null);
        vagas.setStatus(true);
        vagas.setCorredor(corredor);
        corredor.setVagasList(vagas);
        Vagas vagaSalva = vagaRepository.save(vagas);
        return vagaMapper.vagaToResponse(vagaSalva);

    }



}
