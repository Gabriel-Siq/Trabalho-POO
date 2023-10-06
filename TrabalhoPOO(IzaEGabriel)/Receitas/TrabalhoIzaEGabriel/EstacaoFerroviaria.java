import java.util.ArrayList;

public class EstacaoFerroviaria {
    private ArrayList<LinhaFerroviaria> linhas = new ArrayList<LinhaFerroviaria>();
    private String sigla;
    private String descricao;

    // construtores
    public EstacaoFerroviaria(ArrayList<LinhaFerroviaria> linhas) {
        this.linhas = linhas;
    }
    // getset

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

    public ArrayList<LinhaFerroviaria> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<LinhaFerroviaria> linhas) {
        this.linhas = linhas;
    }

    // tostring

    public String toString() {
        String str = " ";
        str += "\nSigla da estação: " + this.sigla;
        str += "\nDescrição da estação: " + this.descricao;
        str += "\nLinhas da estação: " + this.linhas;
        return str;
    }

}
