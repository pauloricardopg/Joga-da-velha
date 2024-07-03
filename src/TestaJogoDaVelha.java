import java.util.Scanner;

public class TestaJogoDaVelha {
    public static void main(String[] args) throws Exception {
        String jogador1;
        boolean resultadoX = false;
        boolean resultadoY = false;
        boolean confere = false;
        int num;
        int cont = 1;
        Tabuleiro tabuleiro = new Tabuleiro();
          
        Scanner ler = new Scanner(System.in);
        System.out.printf("Jogador 1 informe se vai ficar com x ou o!\n");
        jogador1 = ler.nextLine();
        while(!"x".equals(jogador1) && !"o".equals(jogador1)){
          System.out.printf("Jogador 1 informe se vai ficar com x ou o!\n");
          jogador1 = ler.nextLine();
        }
      
        Jogador jogador = new Jogador(jogador1);
        jogador.peca();
  
        System.out.printf("Jogador 1 ficou com " + jogador.getJogador1() + "!!!!!\n");
        System.out.printf("Jogador 2 ficou com " + jogador.getJogador2() + "!!!!!\n");
  
        tabuleiro.tabela();
        System.out.printf("Tabuleiro:\n");
        tabuleiro.ImprimirTabela();
      
  
          
        while(resultadoX!=true && resultadoY!=true){
          System.out.printf("Informe a posição\n");
          num = ler.nextInt();
          confere = tabuleiro.Conferencia(num);
          
          
          if(confere == true){
            cont++;
          }
          
          
          tabuleiro.jogada(num, cont,jogador.getJogador1(), jogador.getJogador2());
          System.out.printf("Tabuleiro:\n");
          tabuleiro.ImprimirTabela();
          resultadoX=tabuleiro.Verifica(jogador.getJogador1());
          resultadoY=tabuleiro.Verifica(jogador.getJogador2());
          
          
          if(resultadoX == true){
            System.out.printf(jogador.getJogador1() + " foi o vencedor");
            
          }
          else if(resultadoY == true){
            System.out.printf(jogador.getJogador2() + " foi o vencedor");
          }
          else if(cont == 10 && resultadoY == false &&  resultadoX == false){
            System.out.printf("VELHA");
            break;
          }
          
          
        }
      }
}
