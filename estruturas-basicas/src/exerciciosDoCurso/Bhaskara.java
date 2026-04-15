package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número");
        double a = sc.nextDouble();

        System.out.println("Escreva o segundo número");
        double b = sc.nextDouble();

        System.out.println("Escreva o terceiro número");
        double c = sc.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (a == 0 || delta < 0.0){

            System.out.println("Impossivel calcular");

        } else {

        double raiz = Math.sqrt(delta);

        double x1 = (-b + raiz) / (2 * a);

        double x2 = (-b - raiz) / (2 * a);

        System.out.printf("A raiz 1 é %.5f \n", x1);

        System.out.printf("A raiz 2 é %.5f \n", x2);

        }

        sc.close();

    }
}
