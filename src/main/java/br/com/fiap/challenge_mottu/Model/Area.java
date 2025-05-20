package br.com.fiap.challenge_mottu.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "areas")
public class Area
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_galpao", nullable = false)
    private Galpao galpao;
    private String nomeArea;
    private TipoArea tipoArea;
    private int capacidade_max;
    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Corredor> corredores;


    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String nomeArea) {
        this.nomeArea = nomeArea;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Galpao getGalpao() {
        return galpao;
    }

    public void setGalpao(Galpao galpao) {
        this.galpao = galpao;
    }

    public TipoArea getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(TipoArea tipoArea) {
        this.tipoArea = tipoArea;
    }

    public int getCapacidade_max() {
        return capacidade_max;
    }

    public void setCapacidade_max(int capacidade_max) {
        this.capacidade_max = capacidade_max;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(Corredor corredores) {
        this.corredores.add(corredores);
    }
}
