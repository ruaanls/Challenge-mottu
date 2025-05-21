package br.com.fiap.challenge_mottu.Mapper;

import br.com.fiap.challenge_mottu.DTO.AreaRequest;
import br.com.fiap.challenge_mottu.DTO.AreaResponse;
import br.com.fiap.challenge_mottu.Model.Area;
import org.springframework.stereotype.Component;

@Component
public class AreaMapper
{
    public Area requestToArea(AreaRequest areaRequest)
    {
        if(areaRequest == null)
        {
            return null;
        }

        Area area = new Area();
        area.setNomeArea(areaRequest.getNomeArea());
        area.setTipoArea(areaRequest.getTipoArea());
        area.setCapacidade_max(areaRequest.getCapacidadeMax());

        return area;
    }

    public AreaResponse areaToResponse(Area area)
    {
        if(area == null)
        {
            return null;
        }
        AreaResponse areaResponse = new AreaResponse();
        areaResponse.setNome(area.getNomeArea());
        areaResponse.setTipoArea(area.getTipoArea());
        areaResponse.setCapacidade_max(area.getCapacidade_max());
        areaResponse.setIdArea(area.getId());
        return areaResponse;
    }
}
