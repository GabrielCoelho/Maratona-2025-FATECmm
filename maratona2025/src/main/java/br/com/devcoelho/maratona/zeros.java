package br.com.devcoelho.maratona;

import java.util.Locale;
import java.util.Scanner;

public class zeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();

    int n = scanner.nextInt();

    double discriminant = b * b - 4 * a * c;

    if (discriminant <= 0 || a == 0) {
      System.out.println("Sem solucao");
    } else {
      double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

      if (root1 > root2) {
        double temp = root1;
        root1 = root2;
        root2 = temp;
      }

      double h = (root2 - root1) / n;
      double area = 0;

      for (int i = 1; i < n; i++) {
        double x = root1 + i * h;
        double y = a * x * x + b * x + c;
        area += Math.abs(y) * h;
      }

      System.out.printf(Locale.US, "%.2f\n", area);
    }

    scanner.close();
  }
}
