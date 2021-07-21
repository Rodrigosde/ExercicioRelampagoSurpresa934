package exercicioRelampagoSupresa934;

public class Escolaridade {
    private String descricao;

    public Escolaridade(String descricao) {
        if (descricao != null)
            this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null)
        this.descricao = descricao;
    }
}
