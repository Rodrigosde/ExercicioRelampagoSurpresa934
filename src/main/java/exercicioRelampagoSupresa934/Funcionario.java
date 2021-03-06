package exercicioRelampagoSupresa934;

public class Funcionario {

    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getPaisAlocacaoFuncionario(){
        if (alocacao.getEmpresa().getGrupo().getSede() == null)
            return "País não informado";
        return alocacao.getEmpresa().getGrupo().getSede().getNomePais();
    }
    public String getEscolaridadeFuncionario(){
        return escolaridade.getDescricao();
    }
}