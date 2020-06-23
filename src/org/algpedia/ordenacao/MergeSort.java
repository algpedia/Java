package org.algpedia.ordenacao;

public class MergeSort {

  public static int[] sort(final int[] lista) {

    // Se a lista tiver tamanho 1 ou menor, ela já está ordenada
    if (lista.length <= 1) {
      return lista;
    }

    // Verifica qual é o elemento que representa o meio da lista.
    // Para isso verificamos o tamanho da lista e dividimos por 2.
    int meio = lista.length / 2;

    // Cria duas novas listas
    int[] parte1 = new int[meio];
    int[] parte2 = new int[lista.length - meio];

    // Preenche a primeira lista
    for (int i = 0; i < meio; i++) {
      parte1[i] = lista[i];
    }

    // Preenche a segunda lista
    for (int i = meio; i < lista.length; i++) {
      parte2[i - meio] = lista[i];
    }

    // Aqui é realizada a recursão de cada uma das listas.
    // A condição de parada da recursão está na lista 8.
    // Se a lista possui menos do que 2 elementos, ela retorna ela mesmo.
    int[] lista1 = sort(parte1);
    int[] lista2 = sort(parte2);

    // As duas listas são juntadas e a nova lista é retornada.
    return juntaOrdenados(lista1, lista2);
  }

  private static int[] juntaOrdenados(int[] lista1, int[] lista2) {
    // Instancia uma nova lista que será o retorno da função
    int[] lista = new int[lista1.length + lista2.length];

    int index_lista1 = 0;
    int index_lista2 = 0;
    int k = 0;

    // Vai adicionando no resultado o menor elemento de cada iteracao
    while (index_lista1 < lista1.length && index_lista2 < lista2.length) {

      if (lista1[index_lista1] <= lista2[index_lista2]) {
        lista[k++] = lista1[index_lista1++];
      } else {
        lista[k++] = lista2[index_lista2++];
      }
    }

    // Adiciona o que restou da primeira lista
    while (index_lista1 < lista1.length) {
      lista[k++] = lista1[index_lista1++];
    }

    // Adiciona o que restou da segunda lista
    while (index_lista2 < lista2.length) {
      lista[k++] = lista2[index_lista2++];
    }

    return lista;
  }

}
