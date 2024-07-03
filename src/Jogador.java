public class Jogador {
    private String jogador1;
    private String jogador2;

    public Jogador(String jogador1){
        this.jogador1 = jogador1;
    }

    public String getJogador1(){
        return jogador1;
    }

    public String getJogador2(){
        return jogador2;
    }

    public void peca(){
        if ("x".equals(jogador1)){
            jogador2 = "o";
        }
        else if("o".equals(jogador1)){
            jogador2 = "x";
        }
    }
}
