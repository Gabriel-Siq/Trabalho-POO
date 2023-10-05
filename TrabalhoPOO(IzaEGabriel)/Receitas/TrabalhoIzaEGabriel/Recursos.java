public class Recursos {
    private Trem trem;
    private Locomotiva locomotiva;
    private Vagao vagao;
    private LinhaFerroviaria linha;
    
    public Recursos(Vagao vagao2) {
    }
    public Trem getTrem() {
        return trem;
    }
    public void setTrem(Trem trem) {
        this.trem = trem;
    }
    public Locomotiva getLocomotiva() {
        return locomotiva;
    }
    public void setLocomotiva(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
    }
    public LinhaFerroviaria getLinha() {
        return linha;
    }
    public void setLinha(LinhaFerroviaria linha) {
        this.linha = linha;
    }
    public Vagao getVagao() {
        return vagao;
    }
    public void setVagao(Vagao vagao) {
        this.vagao = vagao;
    }


    public String toString() {
        String str = "";

        str += "Trem: " + this.trem;
        str += "Locomotiva: " + this.locomotiva;
        str += "Vagâo: " + this.vagao;
        str += "Linha Ferroviária: " + this.linha;

        return str;
    }
}
