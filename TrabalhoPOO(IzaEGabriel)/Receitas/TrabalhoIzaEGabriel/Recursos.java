import java.util.ArrayList;

public class Recursos {
    private Trem trem;
    private Locomotiva locomotiva;
    private Vagao vagao;
    private LinhaFerroviaria linha;

    // construtores

    public Recursos(Vagao vagao) {
        this.vagao = vagao;
    }

    public Recursos(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
    }

    public Recursos(Trem trem) {
        this.trem = trem.
    }

    // getset

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

}
