package br.com.fiap.challenge_mottu.Model;

public enum TipoArea
{
    SEMDEFEITO("Motos Sem defeito"),
    COMDEFEITO("Motos com defeito");

    private String descricao;


    TipoArea(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
