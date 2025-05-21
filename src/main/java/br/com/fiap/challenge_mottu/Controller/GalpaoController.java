package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.GalpaoRequest;
import br.com.fiap.challenge_mottu.DTO.GalpaoResponse;
import br.com.fiap.challenge_mottu.Model.Galpao;
import br.com.fiap.challenge_mottu.Service.GalpaoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/galpao")
@Tag(name = "Api-Galpão")
public class GalpaoController
{
    private final GalpaoService galpaoService;

    public GalpaoController(GalpaoService galpaoService) {
        this.galpaoService = galpaoService;
    }

    @Operation(summary = "Cria um novo galpão")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Galpão criado com sucesso",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = Galpao.class))),
            @ApiResponse(responseCode = "400", description = "Parâmetros informados são inválidos",
            content = @Content(schema = @Schema()))
    })
    @PostMapping
    public ResponseEntity<GalpaoResponse>createGalpao(@Valid @RequestBody GalpaoRequest galpaoRequest)
    {
        GalpaoResponse resposta = galpaoService.createGalpao(galpaoRequest);
        return new ResponseEntity<>(resposta, HttpStatus.CREATED);
    }
}
