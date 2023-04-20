import model.Bolha;
import model.Insercao;
import model.Selecao;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int count;
        int tipoRecebimento;
        int tipoOrdenacao;
        Random gerador = new Random();

        count = Integer.parseInt(JOptionPane.showInputDialog("Quantas posições você deseja ter em seu vetor?"));

        tipoRecebimento = Integer.parseInt(JOptionPane.showInputDialog("Deseja preencher de forma automática ou manual? 1-Automático  0-Manual"));

        int vetor[] = new int[count];
        switch (tipoRecebimento) {
            //forma automática
            case 1 -> {
                for (int i = 0; i < count; i++) {
                    vetor[i] = gerador.nextInt();
                }
            }
            //forma manual
            case 0 -> {
                for (int i = 0; i < count; i++) {
                    vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º elemento do vetor: "));
                }
            }
        }
        tipoRecebimento = Integer.parseInt(JOptionPane.showInputDialog("Parabens, você conseguiu preencher seu vetor!!\n" +
                                                                        "Agora vamos realizar a ordenação.\nSelecione o método desejado:\n" +
                                                                        "1 - Ordenação por inserção\n" +
                                                                        "2 - Ordenação por seleção\n" +
                                                                        "3 - Ordenação por bolha"));

        int vetorCopia[] = vetor.clone();
        System.out.println("--------------Sua Escolha----------------");
        switch (tipoRecebimento){
            case 1 -> {
                Insercao insercao =  new Insercao();

                String inicial = "Vetor sem ordenação = ";
                inicial = inicial + insercao.mostraVetor(vetor);
                System.out.println(inicial + "]");
                long start = System.currentTimeMillis();
                insercao.ordenacao(vetor);
                long tempoFinal = System.currentTimeMillis() - start;

                String resultado = "Vetor ordenado por Inserção = ";
                resultado = resultado + insercao.mostraVetor(vetor);
                System.out.println(resultado + "]");
                System.out.println("Tempo de execução: " + tempoFinal);
            }
            case 2 -> {
                Selecao selecao =  new Selecao();

                String inicial = "Vetor sem ordenação = ";
                inicial = inicial + selecao.mostraVetor(vetor);
                System.out.println(inicial + "]");
                long start = System.currentTimeMillis();
                selecao.ordenacao(vetor);
                long tempoFinal = System.currentTimeMillis() - start;

                String resultado = "Vetor ordenado por Seleção = ";
                resultado = resultado + selecao.mostraVetor(vetor);
                System.out.println(resultado + "]");
                System.out.println("Tempo de execução: " + tempoFinal);
            }
            case 3 -> {
                Bolha bolha =  new Bolha();

                String inicial = "Vetor sem ordenação = ";
                inicial = inicial + bolha.mostraVetor(vetor);
                System.out.println(inicial + "]");
                long start = System.currentTimeMillis();
                bolha.ordenacao(vetor);
                long tempoFinal = System.currentTimeMillis() - start;

                String resultado = "Vetor ordenado por Bolha = ";
                resultado = resultado + bolha.mostraVetor(vetor);
                System.out.println(resultado + "]");
                System.out.println("Tempo de execução: " + tempoFinal);
            }

        }
        int compara = Integer.parseInt(JOptionPane.showInputDialog("Deseja comparar os 3 métodos? Digite 1"));
        if (compara == 1) {
            //metodo inserção
            System.out.println("\nComparando Métodos:");
            System.out.println("--------------Método Inserção----------------");
            Insercao insercao = new Insercao();
            vetor = vetorCopia.clone();
            String inicial = "Vetor sem ordenação = ";
            inicial = inicial + insercao.mostraVetor(vetor);
            System.out.println(inicial + "]");
            long start = System.currentTimeMillis();
            insercao.ordenacao(vetor);
            long tempoFinal = System.currentTimeMillis() - start;

            String resultado = "Vetor ordenado por Inserção = ";
            resultado = resultado + insercao.mostraVetor(vetor);
            System.out.println(resultado + "]");
            System.out.println("Tempo de execução: " + tempoFinal);

            //metodo seleção
            System.out.println("--------------Método Seleção----------------");
            vetor = vetorCopia.clone();
            Selecao selecao = new Selecao();
            inicial = "Vetor sem ordenação = ";
            inicial = inicial + selecao.mostraVetor(vetor);
            System.out.println(inicial + "]");
            long start1 = System.currentTimeMillis();
            selecao.ordenacao(vetor);
            long tempoFinal1 = System.currentTimeMillis() - start1;

            resultado = "Vetor ordenado por Seleção = ";
            resultado = resultado + selecao.mostraVetor(vetor);
            System.out.println(resultado + "]");
            System.out.println("Tempo de execução: " + tempoFinal1);

            //metodo bolha
            System.out.println("--------------Método Bolha----------------");
            vetor = vetorCopia.clone();
            Bolha bolha = new Bolha();
            inicial = "Vetor sem ordenação = ";
            inicial = inicial + bolha.mostraVetor(vetor);
            System.out.println(inicial + "]");
            long start2 = System.currentTimeMillis();
            bolha.ordenacao(vetor);
            long tempoFinal2 = System.currentTimeMillis() - start2;

            resultado = "Vetor ordenado por Bolha = ";
            resultado = resultado + bolha.mostraVetor(vetor);
            System.out.println(resultado + "]");
            System.out.println("Tempo de execução: " + tempoFinal2);
        }
    }
}