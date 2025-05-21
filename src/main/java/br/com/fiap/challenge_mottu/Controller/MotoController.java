package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.MotoRequest;
import br.com.fiap.challenge_mottu.DTO.MotoResponse;
import br.com.fiap.challenge_mottu.Model.Galpao;
import br.com.fiap.challenge_mottu.Model.Moto;
import br.com.fiap.challenge_mottu.Service.MotoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/moto")
@Tag(name = "Api-Moto")
public class MotoController
{
    private final MotoService motoService;

    public MotoController(MotoService motoService) {
        this.motoService = motoService;
    }

    @Operation(summary = "Cria uma nova moto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Moto criada com sucesso e atrelada a uma vaga",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Moto.class))),
            @ApiResponse(responseCode = "400", description = "Parâmetros informados são inválidos",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    public ResponseEntity<MotoResponse>createMoto(@Valid @RequestBody MotoRequest motoRequest)
    {
        MotoResponse motoResponse = motoService.createMoto(motoRequest);
        return new ResponseEntity<>(motoResponse, HttpStatus.CREATED);
    }

    @Operation(summary = "Encontra uma moto pelo ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Moto encontrada com sucesso",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Moto.class))),
            @ApiResponse(responseCode = "400", description = "Parâmetros informados são inválidos",
                    content = @Content(schema = @Schema()))
    })

    @PostMapping("/{id}")
    public ResponseEntity<MotoResponse>findMotoById(@PathVariable Long id)
    {
        MotoResponse motoEncontrada = motoService.findMoto(id);
        return new ResponseEntity<>(motoEncontrada,HttpStatus.OK);
    }

    @Operation(summary = "Atualiza as informações de uma moto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Moto atualizada com sucesso",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Moto.class))),
            @ApiResponse(responseCode = "400", description = "Parâmetros informados são inválidos",
                    content = @Content(schema = @Schema()))
    })

    @PutMapping("/{id}")
    public ResponseEntity<MotoResponse> updateMoto(@PathVariable Long id, @RequestBody MotoRequest motoRequest)
    {
        MotoResponse motoResponse = motoService.updateMoto(motoRequest, id);
        return new ResponseEntity<>(motoResponse, HttpStatus.OK);
    }
    @Operation(summary = "Apagar uma moto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Moto deletada com sucesso",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Moto.class))),
            @ApiResponse(responseCode = "400", description = "Parâmetros informados são inválidos",
                    content = @Content(schema = @Schema()))
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMoto(@PathVariable Long id)
    {
        motoService.deleteMoto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(summary = "Ler todas as motos em paginação")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Motos apresentadas com sucesso",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Moto.class))),
            @ApiResponse(responseCode = "400", description = "Parâmetros informados são inválidos",
                    content = @Content(schema = @Schema()))
    })

    @GetMapping
    public ResponseEntity<Page<MotoResponse>> readAllMotos(@RequestParam(defaultValue = "0") Integer pageNumber)
    {
        Pageable pageable = PageRequest
                .of(pageNumber, 2, Sort.by("placa").ascending());
        return new ResponseEntity<>(motoService.findallMotos(pageable),HttpStatus.OK);
    }


}
