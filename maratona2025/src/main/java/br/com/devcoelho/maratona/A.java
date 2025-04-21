package br.com.devcoelho.maratona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Problema A {@summary} -> Soma de números pares Escreva um programa que receba um número inteiro
 * positivo N como entrada. Em seguida, receba N números inteiros e calcule a soma de todos os
 * números pares.
 *
 * @author Gabriel Coelho Soares
 * @since 2025
 */
public class A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    Integer numberQuantity = Integer.valueOf(scanner.nextLine());
    int num;
    if (numberQuantity > 0 && numberQuantity <= 100) {
      String numericalString = scanner.nextLine();
      int[] numericValues =
          Arrays.stream(numericalString.split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int i = 0; i < numericValues.length; i++) {
        if (numericValues[i] % 2 == 0) {
          numbers.add(numericValues[i]);
        }
      }
    }

    int sum = 0;
    for (Integer n : numbers) {
      sum += n;
    }

    System.out.println(sum);
    scanner.close();
  }
}
