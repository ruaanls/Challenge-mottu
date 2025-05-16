package br.com.fiap.challenge_mottu.DTO;

import br.com.fiap.challenge_mottu.Model.Vagas;

public class MotoResponse
{
    private String placa;
    private String modelo;
    private String marca;
    private int ano;


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}
