package org.algpedia.ordenacao;

public class QuickSort {

  public static void sort(int[] lista) {
    sort(lista, 0, lista.length-1);
  }

  private static void sort(int[] lista, int menor, int maior) {
    if (menor < maior) {
      int indice = separar(lista, menor, maior);

      sort(lista, menor, indice - 1);
      sort(lista, indice + 1, maior);
    }
  }

  private static int separar(int[] lista, int menor, int maior) {
    int pivo = lista[maior];
    int i = menor - 1;

    for (int j = menor; j < maior; j++) {
      if (lista[j] <= pivo ) {
        i++;

        int auxiliar = lista[i];
        lista[i] = lista[j];
        lista[j] = auxiliar;
      }
    }

    int auxiliar = lista[i+1];
    lista[i+1] = lista[maior];
    lista[maior] = auxiliar;

    return i + 1;
  }

}
