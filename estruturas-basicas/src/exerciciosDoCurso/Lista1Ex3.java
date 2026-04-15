package exerciciosDoCurso;

import java.util.Scanner;

public class Lista1Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva seu nome");

        String nome = sc.next();

        System.out.println("Olá, " + nome);

        sc.close();

    }
}
