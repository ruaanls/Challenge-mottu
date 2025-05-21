package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.VagaRequest;
import br.com.fiap.challenge_mottu.DTO.VagaResponse;
import br.com.fiap.challenge_mottu.Model.Galpao;
import br.com.fiap.challenge_mottu.Model.Vagas;
import br.com.fiap.challenge_mottu.Service.VagaService;
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
@RequestMapping("/vagas")
@Tag(name = "Api-Vagas")
public class VagasController
{
    private final VagaService vagaService;

    public VagasController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @Operation(summary = "Cria uma nova vaga")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Vaga criada com sucesso",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Vagas.class))),
            @ApiResponse(responseCode = "400", description = "Parâmetros informados são inválidos",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    public ResponseEntity<VagaResponse>createVagas(@Valid @RequestBody VagaRequest vagaRequest)
    {
        VagaResponse response = vagaService.createVaga(vagaRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
