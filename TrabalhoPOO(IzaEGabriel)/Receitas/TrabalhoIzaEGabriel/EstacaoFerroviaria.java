public class EstacaoFerroviaria {
    private LinhaFerroviaria linhas[];
    private String sigla;
    private String descricao;

    
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LinhaFerroviaria[] getLinhas() {
        return linhas;
    }
    public void setLinhas(LinhaFerroviaria[] linhas) {
        this.linhas = linhas;
    }

    public String toString(){
        String str= " ";
        str += "\nSigla da estação: " + this.sigla;
        str += "\nDescrição da estação: " + this.descricao;
        str += "\nLinhas da estação: " + this.linhas;
        return str;
    }

}
