public class Vagao {
    private int numSerie;
    private String tipo;
    private double capacidade;
    private double comprimentoTesteiras;
    private double comprimentoEngates;
    
    public int getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    public double getComprimentoTesteiras() {
        return comprimentoTesteiras;
    }
    public void setComprimentoTesteiras(double comprimentoEsteiras) {
        this.comprimentoTesteiras = comprimentoEsteiras;
    }
    public double getComprimentoEngates() {
        return comprimentoEngates;
    }
    public void setComprimentoEngates(double comprimentoEngates) {
        this.comprimentoEngates = comprimentoEngates;
    }


    public Vagao(int numSerie) {
        this.numSerie = numSerie;
    }
    public Vagao(int numSerie, double capacidade) {
        this.numSerie = numSerie;
        this.capacidade = capacidade;
    }
    
    public String toString(){
        String str = "";
        str += "\nNumero de Série do Vagão: " + this.numSerie;
        str += "\nTipo do Vagão: " + this.tipo;
        str += "\nCapacidade do Vagão: " + this.capacidade;
        str += "\nComprimento das Testeiras do Vagão: " + this.comprimentoTesteiras;
        str += "\nComprimento dos Engates: " + this.comprimentoEngates;
        return str;
    }

}
