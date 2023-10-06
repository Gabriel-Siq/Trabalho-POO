import java.util.ArrayList;

public class LinhaFerroviaria {
    private int numero;
    private double extensao;
    private String descricao;
    private ArrayList<Recursos> recursos = new ArrayList<Recursos>();

   //construtores

    public LinhaFerroviaria(ArrayList<Recursos> recursos) {
        this.recursos = recursos;
    }

   //setget

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

    //tostring

    public String toString(){
        String str = " ";
        str += "\nNúmero da linha: " + this.numero;
        str += "\nExtensão da linha: " + this.extensao;
        str += "\nDescrição da linha: " + this.descricao;
        str += "\nRecursos da linha: " + this.recursos;
        return str;
    }

}
