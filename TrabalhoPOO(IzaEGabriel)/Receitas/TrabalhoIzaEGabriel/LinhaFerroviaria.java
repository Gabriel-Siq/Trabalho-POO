public class LinhaFerroviaria {
    private int numero;
    private double extensao;
    private String descricao;
    private Recursos recursos[];

   
    public LinhaFerroviaria(Recursos[] recursos) {
        this.recursos = recursos;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getExtensao() {
        return extensao;
    }
    public void setExtensao(double extensao) {
        this.extensao = extensao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Recursos[] getRecursos() {
        return recursos;
    }

    
    public void setRecursos(Recursos[] recursos) {
        this.recursos = recursos;
    }

    public String toString(){
        String str = " ";
        str += "Número da linha: " + this.numero;
        str += "Extensão da linha: " + this.extensao;
        str += "Descrição da linha: " + this.descricao;
        str += "Recursos da linha: " + this.recursos;
        return str;
    }

}
