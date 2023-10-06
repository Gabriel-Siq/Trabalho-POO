import java.util.ArrayList;

public class Trem {
    private ArrayList<Vagao> vagoes = new ArrayList<Vagao>();
    private ArrayList<Locomotiva> locomotivas = new ArrayList<Locomotiva>();
    private String prefixo;
    private String dataFormacao;
    private EstacaoFerroviaria estacaoOrigem;
    private EstacaoFerroviaria estacaoDestino;

    // construtores

    public Trem(ArrayList<Vagao> vagoes, ArrayList<Locomotiva> locomotivas) {
        if (vagoes.size() + locomotivas.size() > 150) {
            System.out.println("Um trem nao pode possuir mais de 150 recursos!");
        } else {
            this.vagoes = vagoes;
            this.locomotivas = locomotivas;
        }
    }

    public Trem(EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino) {
        if (estacaoOrigem != estacaoDestino) {
            this.estacaoOrigem = estacaoOrigem;
            this.estacaoDestino = estacaoDestino;
        } else {
            System.out.println("Rota não disponível.");
        }

    }

    // getset
    

    public ArrayList<Vagao> getVagoes() {
        return vagoes;
    }
    public void setVagoes(ArrayList<Vagao> vagoes) {
        this.vagoes = vagoes;
    }

    public ArrayList<Locomotiva> getLocomotivas() {
        return locomotivas;
    }
    public void setLocomotivas(ArrayList<Locomotiva> locomotivas) {
        this.locomotivas = locomotivas;
    }

    public String getPrefixo() {
        return prefixo;
    }
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataFormacao() {
        return dataFormacao;
    }

    public void setDataFormacao(String dataFormacao) {
        this.dataFormacao = dataFormacao;
    }

    public EstacaoFerroviaria getEstacaoOrigem() {
        return estacaoOrigem;
    }

    public void setEstacaoOrigem(EstacaoFerroviaria estacaoOrigem) {
        this.estacaoOrigem = estacaoOrigem;
    }

    public EstacaoFerroviaria getEstacaoDestino() {
        return estacaoDestino;
    }

    public void setEstacaoDestino(EstacaoFerroviaria estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }

    // tostring

    public String toString() {
        String str = " ";
        str += "\nPrefixo do trem: " + this.prefixo;
        str += "\nData de formação do trem: " + this.dataFormacao;
        str += "\nEstação de origem do trem: " + this.estacaoOrigem;
        str += "\nEstação de destino do trem: " + this.estacaoDestino;
        str += "\nVagoes do trem: " + this.vagoes;
        str += "\nLocomotivas do trem: " + this.locomotivas;
        return str;
    }

}
