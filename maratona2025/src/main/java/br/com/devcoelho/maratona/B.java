package br.com.devcoelho.maratona;

import java.util.Scanner;

/**
 * Problema B {@summary} -> Encontrando o maior palíndromo Um palíndromo é uma palavra ou frase que
 * é lida da mesma forma da esquerda para a direita e da direita para a esquerda. Escreva um
 * programa que receba uma string como entrada e encontre o maior palíndromo dentro dessa string
 *
 * @author Gabriel Coelho Soares
 * @since 2025
 */
public class B {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String entryString = scanner.nextLine();

    String bigPalindromeInEntryString = findBiggestPalindrome(entryString);
    System.out.println(bigPalindromeInEntryString);
    scanner.close();
  }

  public static String findBiggestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";

    if (isPalindrome(s)) return s;

    String biggestPalindrome = "";

    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j <= s.length(); j++) {
        String substring = s.substring(i, j);
        if (isPalindrome(substring) && substring.length() > biggestPalindrome.length()) {
          biggestPalindrome = substring;
        }
      }
    }
    return biggestPalindrome;
  }

  private static boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
      if (s.charAt(start) != s.charAt(end)) {
        return false;
      }
      start += 1;
      end -= 1;
    }

    return true;
  }
}
