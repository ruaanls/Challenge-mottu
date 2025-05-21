package br.com.fiap.challenge_mottu.Service;

import br.com.fiap.challenge_mottu.DTO.MotoRequest;
import br.com.fiap.challenge_mottu.DTO.MotoResponse;
import br.com.fiap.challenge_mottu.Mapper.MotoMapper;
import br.com.fiap.challenge_mottu.Model.Moto;
import br.com.fiap.challenge_mottu.Model.Vagas;
import br.com.fiap.challenge_mottu.Repository.MotoRepository;
import br.com.fiap.challenge_mottu.Repository.VagaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MotoService
{
    private final MotoRepository motoRepository;
    private final MotoMapper motoMapper;
    private final VagaRepository vagaRepository;

    public MotoService(MotoRepository motoRepository, MotoMapper motoMapper, VagaRepository vagaRepository) {
        this.motoRepository = motoRepository;
        this.motoMapper = motoMapper;
        this.vagaRepository = vagaRepository;
    }

    public MotoResponse createMoto(MotoRequest motoRequest)
    {
        Vagas vaga = vagaRepository.findById(motoRequest.getIdVaga()).orElseThrow(()->  new EntityNotFoundException("Vaga não encontrada"));
        Moto moto = motoMapper.requestToMoto(motoRequest);
        moto.setVaga(vaga); // Adiciona um objeto Vaga a uma moto
        vaga.setMoto(moto);
        vaga.setStatus(false); // Atualiza o objeto vaga atrelado a uma moto no banco de dados
        Moto motoSalva = motoRepository.save(moto);
        return motoMapper.motoToResponse(motoSalva);
    }

    public MotoResponse findMoto (Long id)
    {
        Moto moto = motoRepository.findById(id)
                .orElseThrow(()->  new EntityNotFoundException ("Moto não encontrada"));
        return motoMapper.motoToResponse(moto);
    }

    public MotoResponse updateMoto (MotoRequest motoRequest, Long id)
    {
        Moto moto = motoRepository.findById(id)
                .orElseThrow(()->  new EntityNotFoundException ("Moto não encontrada"));
        Vagas vaga = vagaRepository.findById(motoRequest.getIdVaga())
                .orElseThrow(()->  new EntityNotFoundException("Vaga não encontrada"));
        moto.setAno(motoRequest.getAno());
        moto.setModelo(motoRequest.getModelo());
        moto.setPlaca(motoRequest.getPlaca());
        moto.setMarca(motoRequest.getMarca());
        moto.setVaga(vaga);
        motoRepository.save(moto);
        return motoMapper.motoToResponse(moto);

    }

    @Transactional
    public void deleteMoto (Long id)
    {
        Optional<Moto> moto = motoRepository.findById(id);
        if(moto.isPresent())
        {
            motoRepository.delete(moto.get());

        }

    }

    public Page<MotoResponse> findallMotos(Pageable pageable)
    {
        return motoRepository.findAll(pageable)
                .map(moto -> motoMapper.motoToResponse(moto));
    }
}
