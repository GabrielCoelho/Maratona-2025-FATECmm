package br.com.devcoelho.maratona;

import java.util.*;

/**
 * Problema C {@summary} -> Descrição: Dado um labirinto representado por uma matriz de caracteres,
 * onde '#' representa uma parede e '.' representa um caminho livre, encontre o caminho mais curto
 * do ponto de partida (0, 0) até o ponto de destino (linha - 1, coluna - 1).
 *
 * @author Gabriel Coelho Soares
 * @since 2025
 */
public class labirinto {
  // Movimentos: cima, direita, baixo, esquerda, diagonal superior direita, diagonal inferior
  // direita,
  // diagonal inferior esquerda, diagonal superior esquerda
  static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
  static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rows = scanner.nextInt();
    int cols = scanner.nextInt();
    scanner.nextLine();

    char[][] labirynth = new char[rows][cols];

    for (int i = 0; i < rows; i++) {
      String line = scanner.nextLine();
      for (int j = 0; j < line.length() && j < cols; j++) {
        labirynth[i][j] = line.charAt(j);
      }
    }

    int shortestPath = findShortestPath(labirynth, rows, cols);
    System.out.println(shortestPath);
    scanner.close();
  }

  public static int findShortestPath(char[][] labirinto, int linhas, int colunas) {
    int[][] visited = new int[linhas][colunas];

    for (int i = 0; i < linhas; i++) {
      Arrays.fill(visited[i], -1);
    }

    Queue<int[]> queue = new LinkedList<>();

    if (labirinto[0][0] == '.') {
      queue.add(new int[] {0, 0});
      visited[0][0] = 1;
    } else {
      return -1;
    }

    while (!queue.isEmpty()) {
      int[] actual = queue.poll();
      int x = actual[0];
      int y = actual[1];

      if (x == linhas - 1 && y == colunas - 1) {
        return visited[x][y];
      }

      // Considerar todos os 8 movimentos possíveis (4 cardeais + 4 diagonais)
      for (int i = 0; i < 8; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && nx < linhas && ny >= 0 && ny < colunas) {
          if (labirinto[nx][ny] == '.' && visited[nx][ny] == -1) {
            // Para movimentos diagonais (índices 4-7), o caminho é um pouco mais longo
            if (i >= 4) {
              visited[nx][ny] =
                  visited[x][y] + 1; // Considerar o mesmo peso para diagonais neste caso
            } else {
              visited[nx][ny] = visited[x][y] + 1;
            }
            queue.add(new int[] {nx, ny});
          }
        }
      }
    }

    return -1; // Não há caminho possível
  }
}
