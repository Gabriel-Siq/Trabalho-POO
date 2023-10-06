import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstacao {
    public static void main(String[] args) {
        int a, b;

        // criação de objetos de TESTE
        Locomotiva locomotivaTesteTrem = new Locomotiva(1111);
        locomotivaTesteTrem.setCapacidadeTracao(1111);
        locomotivaTesteTrem.setComprimento(1111);
        ArrayList<Locomotiva> locomotivasTrem = new ArrayList<Locomotiva>();
        locomotivasTrem.add(locomotivaTesteTrem);
        EstacaoFerroviaria estacaoOrigem = new EstacaoFerroviaria(null);
        estacaoOrigem.setDescricao("Estacao de Origem TESTE");
        estacaoOrigem.setSigla("ORG01");
        EstacaoFerroviaria estacaoDestino = new EstacaoFerroviaria(null);
        estacaoDestino.setDescricao("Estacao de Destino TESTE");
        estacaoDestino.setSigla("DEST01");
        Recursos recursosTeste = new Recursos(locomotivaTesteTrem);
        ArrayList<Recursos> recursosLista = new ArrayList<Recursos>();
        recursosLista.add(recursosTeste);
        LinhaFerroviaria linhaTeste = new LinhaFerroviaria(recursosLista);
        linhaTeste.setDescricao("Linha de teste para o objeto estação ferroviaria");
        linhaTeste.setExtensao(101010);
        linhaTeste.setNumero(202020);
        ArrayList<LinhaFerroviaria> linhaLista = new ArrayList<LinhaFerroviaria>();
        linhaLista.add(linhaTeste);

        // criação de objeto da classe vagão
        Vagao vagao = new Vagao(5555);
        vagao.setTipo("Tipo de vagão teste");
        vagao.setCapacidade(55.5);
        vagao.setComprimentoTesteiras(5.57);
        vagao.setComprimentoEngates(2.5);

        // criação de uma lista de vagoes para teste
        ArrayList<Vagao> listaVagoes = new ArrayList<Vagao>();
        listaVagoes.add(vagao);

        // criação de objeto da classe estação
        EstacaoFerroviaria estacao = new EstacaoFerroviaria(linhaLista);
        estacao.setDescricao("Breve descrição sobre nossa estação de TESTE");
        estacao.setSigla("A1B2C3");

        // criação de objeto da classe linha ferroviaria

        LinhaFerroviaria linhaFerroviariaObj = new LinhaFerroviaria(recursosLista);
        linhaFerroviariaObj.setNumero(1234);
        linhaFerroviariaObj.setExtensao(12.345);
        linhaFerroviariaObj.setDescricao("Breve descrição sobre nossa linha ferroviaria de teste");

        // criação de objeto da classe locomotiva
        Locomotiva locomotiva = new Locomotiva(303030);
        locomotiva.setComprimento(33.3);
        locomotiva.setCapacidadeTracao(30.3);

        // criação de objeto da classe trem
        Trem trem = new Trem(estacaoOrigem, estacaoDestino);
        trem.setDataFormacao("06/12/2005");
        trem.setPrefixo("ABC123");
        trem.setLocomotivas(locomotivasTrem);
        trem.setVagoes(listaVagoes);

        // menu

        
        System.out.print(
                "---------------------------------------------------\nDigite a estrutura que deseja saber as informações: \n---------------------------------------------------\n1 - Estação Ferroviária\n2 - Linhas Ferroviária\n3 - Locomotiva\n4 - Trem\n5 - Vagao\n---------------------------------------------------\nO Número escolhido foi: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        while (a != 0) {
            switch (a) {
                case 1:
                    System.out.println(estacao.toString());
                    break;
                case 2:
                    System.out.println(linhaFerroviariaObj.toString());
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
            if (b == 1) {
                System.out.print(
                        "---------------------------------------------------\nDigite a outra estrutura que deseja saber as informações: \n---------------------------------------------------\n1 - Estação Ferroviária\n2 - Linhas Ferroviária\n3 - Locomotiva\n4 - Trem\n5 - Vagao\n---------------------------------------------------\nO Número escolhido foi: ");
                Scanner sc3 = new Scanner(System.in);
                a = sc3.nextInt();
            } else {
                System.out.println("\nTudo bem, até a próxima :)\n");
                a = 0;
            }
        }
    }
}
