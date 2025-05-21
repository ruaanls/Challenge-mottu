package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.GalpaoRequest;
import br.com.fiap.challenge_mottu.DTO.GalpaoResponse;
import br.com.fiap.challenge_mottu.Service.GalpaoService;
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
public class GalpaoController
{
    private final GalpaoService galpaoService;

    public GalpaoController(GalpaoService galpaoService) {
        this.galpaoService = galpaoService;
    }

    @PostMapping
    public ResponseEntity<GalpaoResponse>createGalpao(@Valid @RequestBody GalpaoRequest galpaoRequest)
    {
        GalpaoResponse resposta = galpaoService.createGalpao(galpaoRequest);
        return new ResponseEntity<>(resposta, HttpStatus.CREATED);
    }
}
