public class Locomotiva {
    private int numSerie;
    private double capacidadeTracao;
    private double comprimento;
    
    public int getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public double getCapacidadeTracao() {
        return capacidadeTracao;
    }
    public void setCapacidadeTracao(double capacidadeTracao) {
        this.capacidadeTracao = capacidadeTracao;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }


    public Locomotiva(int numSerie) {
        this.numSerie = numSerie;
    }
    public Locomotiva(int numSerie, double capacidadeTracao, double comprimento) {
        this.capacidadeTracao = capacidadeTracao;
        this.comprimento = comprimento;
        this.numSerie = numSerie;
    }

    public String toString(){
        String str = " ";
        str += "\nNumero de serie da locomotiva: " + this.numSerie;
        str += "\nCapacidade de tração da locomotiva: "+ this.capacidadeTracao;
        str += "\nComprimento da locomotiva: " + this.comprimento;
        return str;
    }
    
}
