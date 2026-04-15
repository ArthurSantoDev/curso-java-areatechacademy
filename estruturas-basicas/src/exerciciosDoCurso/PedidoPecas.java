package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class PedidoPecas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o código da peça 1");
        int codP1 = sc.nextInt();

        System.out.println("Escreva a quantidade de unidades da peça 1");
        int qtdP1 = sc.nextInt();

        System.out.println("Escreva o valor unitário da peça 1");
        double vlrP1 = sc.nextDouble();

        System.out.println("Escreva o código da peça 2");
        int codP2 = sc.nextInt();

        System.out.println("Escreva a quantidade de unidades da peça 2");
        int qtdP2 = sc.nextInt();

        System.out.println("Escreva o valor unitário da peça 2");
        double vlrP2 = sc.nextDouble();

        double vlrTotal = (qtdP1 * vlrP1) + (qtdP2 * vlrP2);

        System.out.printf("VALOR A PAGAR: R$%.2f", vlrTotal);

        sc.close();

    }
}
