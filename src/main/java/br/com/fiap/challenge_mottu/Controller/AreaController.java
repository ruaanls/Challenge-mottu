package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.AreaRequest;
import br.com.fiap.challenge_mottu.DTO.AreaResponse;
import br.com.fiap.challenge_mottu.Service.AreaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/area")
public class AreaController
{
    private final AreaService areaService;

    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @PostMapping
    public ResponseEntity<AreaResponse>createArea(@Valid @RequestBody AreaRequest areaRequest)
    {
        AreaResponse response = areaService.createArea(areaRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
