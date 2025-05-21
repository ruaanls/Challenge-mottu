package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.VagaRequest;
import br.com.fiap.challenge_mottu.DTO.VagaResponse;
import br.com.fiap.challenge_mottu.Mapper.VagaMapper;
import br.com.fiap.challenge_mottu.Model.Corredor;
import br.com.fiap.challenge_mottu.Model.Vagas;
import br.com.fiap.challenge_mottu.Repository.CorredorRepository;
import br.com.fiap.challenge_mottu.Repository.VagaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
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
        Vagas vagas = vagaMapper.requestToVagas(vagaRequest);
        Corredor corredor = corredorRepository.findById(vagaRequest.getIdCorredor())
                .orElseThrow(() -> new EntityNotFoundException ("Corredor não encontrado"));

        vagas.setCorredor(corredor); // Adiciona o objeto corredor a vagas
        corredor.setVagasList(vagas); // Atualiza o objeto corredor com uma vaga no banco de dados
        Vagas vagaSalva = vagaRepository.save(vagas);
        return vagaMapper.vagaToResponse(vagaSalva);

    }

    public VagaResponse readVaga(Long id)
    {
        Vagas vaga = vagaRepository.findById(id)
                .orElseThrow(()->new EntityNotFoundException ("Vaga não encontrada"));
        return vagaMapper.vagaToResponse(vaga);
    }



}
