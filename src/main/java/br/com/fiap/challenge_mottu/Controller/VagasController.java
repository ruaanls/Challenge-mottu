package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.VagaRequest;
import br.com.fiap.challenge_mottu.DTO.VagaResponse;
import br.com.fiap.challenge_mottu.Service.VagaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vagas")
public class VagasController
{
    private final VagaService vagaService;

    public VagasController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @PostMapping
    public ResponseEntity<VagaResponse>createVagas(@Valid @RequestBody VagaRequest vagaRequest)
    {
        VagaResponse response = vagaService.createVaga(vagaRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
