package org.algpedia.ordenacao;

import java.util.Arrays;

public class InsertionSort {

  public static int[] sort(final int[] lista) {
    int[] listaOrdenada = Arrays.copyOf(lista, lista.length);

    for (int i = 1; i < listaOrdenada.length; i++) {
      int chave = listaOrdenada[i];
      int j = i - 1;

      while (j >= 0 && listaOrdenada[j] > chave) {
        listaOrdenada[j + 1] = listaOrdenada[j];
        j = j - 1;
      }
      listaOrdenada[j + 1] = chave;
    }

    return listaOrdenada;
  }

}
