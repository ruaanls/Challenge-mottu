package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.CorredorRequest;
import br.com.fiap.challenge_mottu.DTO.CorredorResponse;
import br.com.fiap.challenge_mottu.Model.Corredor;
import br.com.fiap.challenge_mottu.Model.Galpao;
import br.com.fiap.challenge_mottu.Service.CorredorService;
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
@RequestMapping("/corredor")
@Tag(name = "Api-Corredor")
public class CorredorController
{
    private final CorredorService corredorService;

    public CorredorController(CorredorService corredorService) {
        this.corredorService = corredorService;
    }

    @Operation(summary = "Cria um novo corredor")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Corredor criado com sucesso",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Corredor.class))),
            @ApiResponse(responseCode = "400", description = "Parâmetros informados são inválidos",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    public ResponseEntity<CorredorResponse>createCorredor(@Valid @RequestBody CorredorRequest corredorRequest)
    {
        CorredorResponse response = corredorService.createCorredor(corredorRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
