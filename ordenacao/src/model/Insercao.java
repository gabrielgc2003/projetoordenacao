package model;

public class Insercao {
    public void ordenacao(int vetor []){

      int elemento;
      for (int i = 1; i < vetor.length; i++){
          elemento = vetor[i];
          int j = i - 1;
          for (; (j >= 0) && (vetor[j] > elemento); j--){
              vetor[j + 1] = vetor[j];
          }
          vetor[j + 1] = elemento;
      }

    }
    public String mostraVetor(int vetor[]){
        String mensagem = "[";
        for (int i = 0; i < vetor.length; i++){
            if (i == 0){
                mensagem = mensagem + (" " + vetor[i]);
            }
            else {
                mensagem = mensagem + (", " + vetor[i]);
            }
        }
        return mensagem;
    }
}
