package br.com.devcoelho.maratona;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problema E - {@summary} Dada uma matriz que representa o templo submerso, onde cada célula contém
 * um número inteiro representando a quantidade de moedas de ouro naquela câmara, determine a
 * quantidade máxima de moedas que podem ser coletadas em um caminho da entrada (canto superior
 * esquerdo) até a câmara do tesouro (canto inferior direito), movendo-se apenas para a direita ou
 * para baixo.
 *
 * @author Gabriel Coelho Soares
 * @since 2025
 */
public class E {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String dimensionsLine = scanner.nextLine();
    int[] dimensions =
        Arrays.stream(dimensionsLine.split(" ")).mapToInt(Integer::parseInt).toArray();

    int rows = dimensions[0];
    int columns = dimensions[1];

    int[][] temple = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      String rowLine = scanner.nextLine();
      temple[i] = Arrays.stream(rowLine.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    System.out.println(resolveBestPath(temple));

    scanner.close();
  }

  private static int resolveBestPath(int[][] temple) {
    int rows = temple.length;
    int columns = temple[0].length;

    int[][] dinamicPath = new int[rows][columns];

    dinamicPath[0][0] = temple[0][0];
    for (int j = 1; j < columns; j++) {
      dinamicPath[0][j] = dinamicPath[0][j - 1] + temple[0][j];
    }
    for (int i = 1; i < rows; i++) {
      dinamicPath[i][0] = dinamicPath[i - 1][0] + temple[i][0];
    }
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < columns; j++) {
        dinamicPath[i][j] = temple[i][j] + Math.max(dinamicPath[i - 1][j], dinamicPath[i][j - 1]);
      }
    }

    // printMatrix(temple);
    // printMatrix(dinamicPath);

    return dinamicPath[rows - 1][columns - 1];
  }

  private static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
  }
}
