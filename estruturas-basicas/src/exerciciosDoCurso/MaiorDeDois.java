package exerciciosDoCurso;

import java.util.Scanner;

public class MaiorDeDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    System.out.println("Escreva um numero");
    int num1 = sc.nextInt();

    System.out.println("Escreva outro numero");
    int num2 = sc.nextInt();

    if (num1 > num2) {
        System.out.println("O maior numero é: " + num1);
    } else if (num2 > num1) {
        System.out.println("O maior numero é: " + num2);
    } else {
        System.out.println("Os numeros são igauis");
    }

    }
}
