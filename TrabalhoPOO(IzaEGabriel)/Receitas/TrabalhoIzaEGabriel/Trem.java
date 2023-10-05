public class Trem {
    private Vagao vagoes[];
    private Locomotiva locomotivas[];
    private String prefixo;
    private String dataFormacao;
    private EstacaoFerroviaria estacaoOrigem;
    private EstacaoFerroviaria estacaoDestino;
    
    
    public Vagao[] getVagoes() {
        return vagoes;
    }
    public void setVagoes(Vagao[] vagoes) {
        this.vagoes = vagoes;
    }
    public Locomotiva[] getLocomotivas() {
        return locomotivas;
    }
    public void setLocomotivas(Locomotiva[] locomotivas) {
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


    public Trem(Vagao[] vagoes, Locomotiva[] locomotivas) {
        this.vagoes = vagoes;
        this.locomotivas = locomotivas;
    }
    public Trem(EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino) {
        if(estacaoOrigem != estacaoDestino){
            this.estacaoOrigem = estacaoOrigem;
            this.estacaoDestino = estacaoDestino;
        }else {
            System.out.println("Rota não disponível.");
        }
        
    }
    public Trem(Vagao[] vagoes) {
        this.vagoes = vagoes;
    }
    public Trem(Locomotiva[] locomotivas) {
        this.locomotivas = locomotivas;
    }
    
    public String toString(){
        String str= " ";
        str += "\nPrefixo do trem: " + this.prefixo;
        str += "\nData de formação do trem: " + this.dataFormacao;
        str += "\nEstação de origem do trem: " + this.estacaoOrigem;
        str += "\nEstação de destino do trem: " + this.estacaoDestino;
        return str;
    }

}
