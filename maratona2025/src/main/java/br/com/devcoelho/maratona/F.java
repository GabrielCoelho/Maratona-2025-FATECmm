package br.com.devcoelho.maratona;

import java.util.Arrays;
import java.util.Scanner;

public class F {

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
