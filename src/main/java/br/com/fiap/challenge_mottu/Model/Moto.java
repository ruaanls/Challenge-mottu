package br.com.fiap.challenge_mottu.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "motos")
public class Moto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_moto;
    private String placa;
    private String modelo;
    private String marca;
    private int ano;


    public Long getId_moto() {
        return id_moto;
    }

    public void setId_moto(Long id_moto) {
        this.id_moto = id_moto;
    }

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
