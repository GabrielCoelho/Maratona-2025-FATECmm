package br.com.devcoelho.maratona;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problema F {@summary} -> Você tem uma lista de inteiros e precisa determinar quantos números
 * na lista são múltiplos de 3. O programa deve receber o tamanho da lista, seguido pelos números,
 * e retornar a contagem de múltiplos de 3.
 *
 * @author Gabriel Coelho Soares
 * @since 2025
 */
public class multiplos {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String _listLength = scanner.nextLine();
    int count = 0;
    int[] arrayEntry =
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    for (int value : arrayEntry) {
      if (value % 3 == 0) count++;
    }

    System.out.println(count);

    scanner.close();
  }
}
