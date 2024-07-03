import java.util.Scanner;

public class Tabuleiro {
  int i;
  private String[][] tabela = new String[3][3];

  Scanner ler = new Scanner(System.in);

  public void tabela(){
      for(int linha = 0 ; linha < 3 ; linha = linha+1){
        for(int coluna = 0; coluna < 3 ; coluna = coluna+1){
              i++;
              tabela[linha][coluna]=String.valueOf(i);
          
          }
        }
    }

    public void ImprimirTabela(){
      for(int linha=0 ; linha < 3 ; linha++){
              for(int coluna=0; coluna < 3 ; coluna++){
               
                System.out.printf(tabela[linha][coluna] + " ");
                  
              }
              System.out.println();

  

      }        
}
public void jogada(int num, int vez, String jogador1, String jogador2){
    String numStr;
    numStr = Integer.toString(num);

  
    if(vez%2 == 0){
    for(int linha = 0 ; linha < 3 ; linha = linha+1){
        for(int coluna = 0; coluna < 3 ; coluna = coluna+1){
              if(numStr.equals(tabela[linha][coluna])){
                tabela[linha][coluna] = jogador1;    
              }
              
              }   
          }
        }
      
   
   else if(vez%2 == 1){
    for(int linha = 0 ; linha < 3 ; linha = linha+1){
        for(int coluna = 0; coluna < 3 ; coluna = coluna+1){
              if(numStr.equals(tabela[linha][coluna])){
                tabela[linha][coluna] = jogador2;
                
              }   
          }
        }
      }
   
   
   }

public boolean Verifica(String j1){
  if(tabela[0][0] == j1 && tabela[0][1]== j1 && tabela[0][2]== j1){
    return true;
  }
  else if(tabela[1][0] == j1 && tabela[1][1]== j1 && tabela[1][2]== j1){
    return true;
  }
  else if(tabela[2][0] == j1 && tabela[2][1]== j1 && tabela[2][2]== j1){
    return true;
  }
  else if(tabela[0][0] == j1 && tabela[1][0]== j1 && tabela[2][0]== j1){
    return true;
  }
  else if(tabela[0][1] == j1 && tabela[1][1]== j1 && tabela[2][1]== j1){
    return true;
  }
  else if(tabela[0][2] == j1 && tabela[1][2]== j1 && tabela[2][2]== j1){
    return true;
  }
  else if(tabela[0][0] == j1 && tabela[1][1]== j1 && tabela[2][2]== j1){
    return true;
  }
  else if(tabela[0][2] == j1 && tabela[1][1]== j1 && tabela[2][0]== j1){
    return true;
  }
  return false;
}

public boolean Conferencia(int num){
  String numStr;
  numStr = Integer.toString(num);
  for(int linha = 0 ; linha < 3 ; linha = linha+1){
        for(int coluna = 0; coluna < 3 ; coluna = coluna+1){
              if(numStr.equals(tabela[linha][coluna])){
                return true;
                
              }   
          }
        }
  return false;
}


  
}

