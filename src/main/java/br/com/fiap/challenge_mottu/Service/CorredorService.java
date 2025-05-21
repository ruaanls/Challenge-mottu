package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.CorredorRequest;
import br.com.fiap.challenge_mottu.DTO.CorredorResponse;
import br.com.fiap.challenge_mottu.Mapper.CorredorMapper;
import br.com.fiap.challenge_mottu.Model.Area;
import br.com.fiap.challenge_mottu.Model.Corredor;
import br.com.fiap.challenge_mottu.Repository.AreaRepository;
import br.com.fiap.challenge_mottu.Repository.CorredorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CorredorService
{
    private final CorredorRepository corredorRepository;
    private final CorredorMapper corredorMapper;
    private final AreaService areaService;
    private final AreaRepository areaRepository;

    public CorredorService(CorredorRepository corredorRepository, CorredorMapper corredorMapper, AreaService areaService, AreaRepository areaRepository) {
        this.corredorRepository = corredorRepository;
        this.corredorMapper = corredorMapper;
        this.areaService = areaService;
        this.areaRepository = areaRepository;
    }

    public CorredorResponse createCorredor(CorredorRequest corredorRequest)
    {
        Corredor corredor = corredorMapper.requestToCorredor(corredorRequest);
        Area area = areaRepository.findById(corredorRequest.getIdArea())
                .orElseThrow( () -> new EntityNotFoundException("Área não encontrada"));
        corredor.setArea(area);

        area.setCorredores(corredor); // Atualiza automaticamente o objeto área no banco de dados
        Corredor corredorSalvo = corredorRepository.save(corredor);
        return corredorMapper.corredorToResponse(corredorSalvo);

    }
}
