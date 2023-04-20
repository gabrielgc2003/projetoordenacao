package model;

public class Selecao {
    public void ordenacao(int vetor []){
        int n = vetor.length;
        for (int i = 0; i < n-1; i++){
            int posI = i;
            for (int j = i + 1; j < n; j++){
                if (vetor[j] < vetor[posI]){
                    posI = j;
                }
            }
            int aux = vetor[posI];
            vetor[posI] = vetor[i];
            vetor[i] = aux;
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
