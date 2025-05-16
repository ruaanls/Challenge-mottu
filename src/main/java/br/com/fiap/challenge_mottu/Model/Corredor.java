package br.com.fiap.challenge_mottu.Model;

import java.util.List;

public class Corredor
{
    private Long id;
    private Area area;
    private String nomeCorredor;
    private List<Vagas> vagasList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getNomeCorredor() {
        return nomeCorredor;
    }

    public void setNomeCorredor(String nomeCorredor) {
        this.nomeCorredor = nomeCorredor;
    }
}
