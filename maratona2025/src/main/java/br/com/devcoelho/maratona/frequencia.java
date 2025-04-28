package br.com.devcoelho.maratona;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Problema D {@summary} -> Desenvolva um algoritmo que identifique e contabilize a frequência de
 * cada elemento único em um fluxo de dados numéricos.
 *
 * @author Gabriel Coelho Soares
 * @since 2025
 */
public class frequencia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int quantity = Integer.valueOf(scanner.nextLine());
    TreeMap<Integer, Integer> result = new TreeMap<>();
    String fullValues = scanner.nextLine();
    int[] valuesSplitted =
        Arrays.stream(fullValues.split(" ")).mapToInt(Integer::parseInt).toArray();

    for (int i = 0; i < valuesSplitted.length; i++) {
      if (i >= quantity) break;
      result.put(valuesSplitted[i], result.getOrDefault(valuesSplitted[i], 0) + 1);
    }

    for (Map.Entry<Integer, Integer> show : result.entrySet()) {
      int value = show.getKey();
      int frequency = show.getValue();

      System.out.println(value + " " + frequency);
    }
  }
}
