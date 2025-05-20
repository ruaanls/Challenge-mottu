package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.AreaRequest;
import br.com.fiap.challenge_mottu.DTO.AreaResponse;
import br.com.fiap.challenge_mottu.Mapper.AreaMapper;
import br.com.fiap.challenge_mottu.Model.Area;
import br.com.fiap.challenge_mottu.Model.Galpao;
import br.com.fiap.challenge_mottu.Repository.AreaRepository;
import br.com.fiap.challenge_mottu.Repository.GalpaoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AreaService
{
    private final GalpaoService galpaoService;
    private final GalpaoRepository galpaoRepository;
    private final AreaRepository areaRepository;
    private final AreaMapper areaMapper;

    public AreaService(GalpaoService galpaoService, GalpaoRepository galpaoRepository, AreaRepository areaRepository, AreaMapper areaMapper) {
        this.galpaoService = galpaoService;
        this.galpaoRepository = galpaoRepository;
        this.areaRepository = areaRepository;
        this.areaMapper = areaMapper;
    }

    public AreaResponse createArea(AreaRequest areaRequest)
    {
        Galpao galpao = galpaoRepository.findById(areaRequest.getGalpaoId())
                .orElseThrow(() -> new EntityNotFoundException("Galpão com ID " + areaRequest.getGalpaoId() + " não encontrado."));
        Area area = areaMapper.requestToArea(areaRequest);
        area.setGalpao(galpao);
        galpao.setAreas(area);
        Area areaSalva = areaRepository.save(area);
        // Se fosse no oracle teriamos que sobreescrever
        return areaMapper.areaToResponse(areaSalva);
    }

}
