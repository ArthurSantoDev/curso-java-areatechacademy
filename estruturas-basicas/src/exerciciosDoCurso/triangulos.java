package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class triangulos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número");
        double a = sc.nextDouble();

        System.out.println("Escreva o segundo número");
        double b = sc.nextDouble();

        System.out.println("Escreva o terceiro número");
        double c = sc.nextDouble();

        double triangulo = a * c / 2;
        double circulo = Math.PI * Math.pow(c, 2);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",
                triangulo, circulo, trapezio, quadrado, retangulo);
        sc.close();

    }
}
