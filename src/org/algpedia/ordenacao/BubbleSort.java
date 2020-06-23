package org.algpedia.ordenacao;

import java.util.Arrays;

public class BubbleSort {

  /**
   * Esse método implementa o algoritmo de ordenação bubblesort.
   * O método recebe uma lista de inteiros e retornará uma nova
   * lista de inteiros ordenada.
   * Importante ressaltar, que a lista recebida não será modificada.
   * @param lista lista de inteiros
   * @return lista de inteiros ordenada
   */
  public static int[] sort(final int[] lista) {
    // Inicializa uma nova lista de inteiros com o conteúdo da lista recebida
    //como parâmetro de entrada. Essa nova lista servirá de retorno do método.
    int[] listaOrdenada = Arrays.copyOf(lista, lista.length);

    // Percorre todos os elementos da lista
    for (int i = 0; i < listaOrdenada.length; i++) {
      // Percorre todos os elementos que estão à frente da posição i
      for (int j = i + 1; j < listaOrdenada.length; j++) {
        // Compara o valor da posição i com todos os valores que estão à frente.
        // Se o valor comparado é menor, troca o valor da posição i com o de posição j
        if (listaOrdenada[j] < listaOrdenada[i]) {
          // Uma variável auxiliar é criada para armazena o valor da posição i, pois ela
          // será sobreescrita.
          int auxiliar = listaOrdenada[i];
          listaOrdenada[i] = listaOrdenada[j];
          listaOrdenada[j] = auxiliar;
        }
      }
    }

    return listaOrdenada;
  }

}
