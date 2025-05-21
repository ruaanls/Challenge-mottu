package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.AreaRequest;
import br.com.fiap.challenge_mottu.DTO.AreaResponse;
import br.com.fiap.challenge_mottu.Model.Area;
import br.com.fiap.challenge_mottu.Model.Galpao;
import br.com.fiap.challenge_mottu.Service.AreaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/area")
@Tag(name = "Api-Área")
public class AreaController
{
    private final AreaService areaService;

    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }
    @Operation(summary = "Cria um nova área")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Área criada com sucesso",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Area.class))),
            @ApiResponse(responseCode = "400", description = "Parâmetros informados são inválidos",
                    content = @Content(schema = @Schema()))
    })

    @PostMapping
    public ResponseEntity<AreaResponse>createArea(@Valid @RequestBody AreaRequest areaRequest)
    {
        AreaResponse response = areaService.createArea(areaRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
