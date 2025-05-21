package br.com.fiap.challenge_mottu.DTO;

import br.com.fiap.challenge_mottu.Model.Area;
import jakarta.validation.constraints.*;

import java.util.List;

public class GalpaoRequest
{
    @NotBlank(message = "O galpão não pode ficar sem nome")
    @Size(min = 2, max = 254, message = "O título deve ter entre 2 e 254 caracteres")
    private String nome;
    @NotNull(message = "O logradouro para um galpão é obrigatório")
    private String logradouro;
    @NotNull(message = "É obrigatório um galpão ter número")
    private String numero;
    @NotNull(message = "O galpão precisa estar em um estado")
    private String estado;
    @NotNull(message = "O galpão precisa estar em uma cidade")
    private String cidade;
    @NotNull(message = "O galpão deve ter uma capacidade máxima")

    private int capacidade_max;




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCapacidade_max() {
        return capacidade_max;
    }

    public void setCapacidade_max(int capacidade_max) {
        this.capacidade_max = capacidade_max;
    }
}
