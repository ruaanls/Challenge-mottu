package br.com.fiap.challenge_mottu.Mapper;

import br.com.fiap.challenge_mottu.DTO.MotoRequest;
import br.com.fiap.challenge_mottu.DTO.MotoResponse;
import br.com.fiap.challenge_mottu.Model.Moto;

public class MotoMapper
{
    public Moto requestToMoto(MotoRequest motoRequest)
    {
        if(motoRequest == null)
        {
            return null;
        }
        Moto moto = new Moto();
        moto.setPlaca(motoRequest.getPlaca());
        moto.setAno(motoRequest.getAno());
        moto.setMarca(motoRequest.getMarca());
        moto.setModelo(motoRequest.getModelo());
        return moto;
    }

    public MotoResponse motoToResponse(Moto moto)
    {
        if(moto == null)
        {
            return null;
        }
        MotoResponse motoResponse = new MotoResponse();
        motoResponse.setAno(moto.getAno());
        motoResponse.setMarca(moto.getMarca());
        motoResponse.setModelo(moto.getModelo());
        motoResponse.setPlaca(moto.getPlaca());
        return motoResponse;
    }
}
