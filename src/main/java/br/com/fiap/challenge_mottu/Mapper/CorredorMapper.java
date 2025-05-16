package br.com.fiap.challenge_mottu.Mapper;

import br.com.fiap.challenge_mottu.DTO.CorredorRequest;
import br.com.fiap.challenge_mottu.DTO.CorredorResponse;
import br.com.fiap.challenge_mottu.Model.Corredor;

public class CorredorMapper
{
    // TALVEZ PRECISE DO ARRAY DE VAGAS NO CORREDOR MODEL
    public Corredor requestToCorredor (CorredorRequest corredorRequest)
    {
        if(corredorRequest == null)
        {
            return null;
        }

        Corredor corredor = new Corredor();
        corredor.setNomeCorredor(corredor.getNomeCorredor());
        return corredor;
    }

    public CorredorResponse corredorToResponse(Corredor corredor)
    {
        if(corredor == null)
        {
            return null;
        }
        CorredorResponse corredorResponse = new CorredorResponse();
        corredorResponse.setNomeCorredor(corredor.getNomeCorredor());
        return corredorResponse;
    }
}
