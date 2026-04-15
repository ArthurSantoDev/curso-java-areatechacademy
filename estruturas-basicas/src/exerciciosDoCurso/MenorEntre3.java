package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class MenorEntre3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número");
        int num1 = sc.nextInt();

        System.out.println("Escreva o segundo número");
        int num2 = sc.nextInt();

        System.out.println("Escreva o terceiro número");
        int num3 = sc.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("O menos destre os tres números é o: " + num1);
        } else if ( num2 < num3) {
            System.out.println("O menos destre os tres números é o: " + num2);
        } else {
            System.out.println("O menos destre os tres números é o: " + num3);
        }

        sc.close();

    }
}
