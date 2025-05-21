package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.CorredorRequest;
import br.com.fiap.challenge_mottu.DTO.CorredorResponse;
import br.com.fiap.challenge_mottu.Service.CorredorService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/corredor")
public class CorredorController
{
    private final CorredorService corredorService;

    public CorredorController(CorredorService corredorService) {
        this.corredorService = corredorService;
    }

    @PostMapping
    public ResponseEntity<CorredorResponse>createCorredor(@Valid @RequestBody CorredorRequest corredorRequest)
    {
        CorredorResponse response = corredorService.createCorredor(corredorRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
