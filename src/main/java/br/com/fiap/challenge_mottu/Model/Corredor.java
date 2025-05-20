package br.com.fiap.challenge_mottu.Model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "corredores")
public class Corredor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area", nullable = false)
    private Area area;
    private String nomeCorredor;
    @OneToMany(mappedBy = "corredor", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
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

    public List<Vagas> getVagasList() {
        return vagasList;
    }

    public void setVagasList(Vagas vagasList) {
        this.vagasList.add(vagasList);
    }
}
