package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class CalcFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o número do funcionário");
        int idFunc = sc.nextInt();

        System.out.println("Escreva o número de horas trabalhadas");
        double hrs = sc.nextDouble();

        System.out.println("Escreva o valor de cada horas");
        double vlrHr = sc.nextDouble();

        double salario = hrs * vlrHr;

        System.out.printf("Número = %d\n", idFunc);
        System.out.printf("SALÁRIO = R$%.2f", salario);

        sc.close();
    }
}