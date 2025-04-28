package br.com.devcoelho.maratona;

import java.util.*;

/**
 * Problema G {@summary} -> Você recebe uma lista de n elementos e precisa determinar quantos
 * pares (x,y) distintos podem ser formados escolhendo dois elementos diferentes da lista.
 * O resultado é a combinação matemática de n elementos tomados 2 a 2.
 *
 * @author Gabriel Coelho Soares
 * @since 2025
 */
public class distintos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int listSize = scanner.nextInt();
    // O resultado sempre será a soma de todos os valores anteriores ao listSize
    int count = (listSize * (listSize - 1)) / 2;

    // apenas para armazenar, não será necessario
    int[] numbers = new int[listSize];
    for (int i = 0; i < listSize; i++) {
      numbers[i] = scanner.nextInt();
    }

    System.out.println(count);
    scanner.close();
  }
}
