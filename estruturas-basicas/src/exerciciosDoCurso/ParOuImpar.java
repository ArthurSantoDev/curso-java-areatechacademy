package exerciciosDoCurso;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um numero");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Este numero é par");
        } else {

            System.out.println("O numero é impar");
        }
    }
}
