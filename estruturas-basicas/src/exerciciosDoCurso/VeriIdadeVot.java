package exerciciosDoCurso;

import java.util.Scanner;

public class VeriIdadeVot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva sua idade");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Já pode votar");
        } else {
            System.out.println("Ainda não pode votar");
        }
        sc.close();

    }
}
