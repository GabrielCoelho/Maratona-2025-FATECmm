package br.com.devcoelho.maratona;

import java.util.*;

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
