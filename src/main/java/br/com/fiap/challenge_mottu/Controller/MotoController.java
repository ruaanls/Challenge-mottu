package br.com.fiap.challenge_mottu.Controller;

import br.com.fiap.challenge_mottu.DTO.MotoRequest;
import br.com.fiap.challenge_mottu.DTO.MotoResponse;
import br.com.fiap.challenge_mottu.Service.MotoService;
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
public class MotoController
{
    private final MotoService motoService;

    public MotoController(MotoService motoService) {
        this.motoService = motoService;
    }

    @PostMapping
    public ResponseEntity<MotoResponse>createMoto(@Valid @RequestBody MotoRequest motoRequest)
    {
        MotoResponse motoResponse = motoService.createMoto(motoRequest);
        return new ResponseEntity<>(motoResponse, HttpStatus.CREATED);
    }

    @PostMapping("/{id}")
    public ResponseEntity<MotoResponse>findMotoById(@PathVariable Long id)
    {
        MotoResponse motoEncontrada = motoService.findMoto(id);
        return new ResponseEntity<>(motoEncontrada,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MotoResponse> updateMoto(@PathVariable Long id, @RequestBody MotoRequest motoRequest)
    {
        MotoResponse motoResponse = motoService.updateMoto(motoRequest, id);
        return new ResponseEntity<>(motoResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMoto(@PathVariable Long id)
    {
        motoService.deleteMoto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Page<MotoResponse>> readAllMotos(@RequestParam(defaultValue = "0") Integer pageNumber)
    {
        Pageable pageable = PageRequest
                .of(pageNumber, 2, Sort.by("placa").ascending());
        return new ResponseEntity<>(motoService.findallMotos(pageable),HttpStatus.OK);
    }


}
