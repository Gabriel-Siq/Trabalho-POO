import java.util.Scanner;

public class TestaEstacao {
    public static void main (String [] args){
        int a, b;


        EstacaoFerroviaria estacaoOrigem = new EstacaoFerroviaria();
        estacaoOrigem.setDescricao("Estacao de Origem");
        
        EstacaoFerroviaria estacaoDestino = new EstacaoFerroviaria();
        estacaoDestino.setDescricao("Estacao de Destino");

        Vagao vagao = new Vagao(1542);
        vagao.setTipo("Grande");
        vagao.setCapacidade(56.8);
        vagao.setComprimentoTesteiras(5.67);
        vagao.setComprimentoEngates(2.5);

        Recursos recurso = new Recursos(vagao);
      //recurso.setLinha(adiconar quando a linha for criada);

        EstacaoFerroviaria estacao = new EstacaoFerroviaria();
        estacao.setDescricao("Terminal Papicu");
        estacao.setSigla("A9HB4");
        //set do atributo com vetor
        

        //LinhaFerroviaria linhaFerroviaria = new LinhaFerroviaria(); (lance do vetor)
        //linhaFerroviaria.setNumero(6);
        //linhaFerroviaria.setExtensao(56,6);
        //linhaFerroviaria.setDescricao("Linha Azul");


      Locomotiva locomotiva = new Locomotiva(64057);
      locomotiva.setComprimento(58.6);
      locomotiva.setCapacidadeTracao(87.8);


      Trem trem = new Trem(estacaoOrigem, estacaoDestino);
      trem.setDataFormacao("06/12/2005");
      trem.setPrefixo("AD58F");
      //faltando a parte de array vagoes e locomotiva (criar o vtor obj)









        System.out.print("---------------------------------------------------\nDigite a estrutura que deseja saber as informações: \n---------------------------------------------------\n1 - Estação Ferroviária\n2 - Linhas Ferroviária\n3 - Locomotiva\n4 - Trem\n5 - Vagao\n---------------------------------------------------\nO Número escolhido foi: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        while(a != 0){
            switch(a){
                case 1:
                System.out.println(estacao.toString());
                break;
                case 2:
                //naocriada
                break;
                case 3:
                System.out.println(locomotiva.toString());
                break;
                case 4:
                System.out.println(trem.toString());
                break;
                case 5:
                System.out.println(vagao.toString());
                break;
                default:
                System.out.println("\nO Numero eh invalido :(");
                a = 0;
            }
            System.out.print("\nDeseja saber mais informações sobre as estruturas?\n1 - Sim\n2 - Não\n\nEscolha: ");
            Scanner sc2 = new Scanner(System.in);
            b = sc2.nextInt();
            if(b == 1){
                System.out.print("---------------------------------------------------\nDigite a outra estrutura que deseja saber as informações: \n---------------------------------------------------\n1 - Estação Ferroviária\n2 - Linhas Ferroviária\n3 - Locomotiva\n4 - Trem\n5 - Vagao\n---------------------------------------------------\nO Número escolhido foi: ");
                Scanner sc3 = new Scanner(System.in);
                a = sc3.nextInt();
            }else {
                System.out.println("\nTudo bem, até a próxima :)\n");
                a = 0;
            }
        }
    }
}
