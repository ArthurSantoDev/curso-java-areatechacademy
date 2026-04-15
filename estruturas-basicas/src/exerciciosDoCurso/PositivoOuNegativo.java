package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um numero");

        double num = sc.nextDouble(); {

        } if (num < 0) {
            System.out.println("Numero negativo");
        } else if (num > 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero Zerado");
        }

        sc.close();


    }
}
