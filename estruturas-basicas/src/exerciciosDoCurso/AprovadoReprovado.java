package exerciciosDoCurso;

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva sua nota");

        double nota = sc.nextDouble();

                if (nota >= 7.0 && nota <= 10.0) {
                    System.out.println("APROVADO!");
                } else if (nota < 7.0 && nota >= 0) {
                    System.out.println("REPROVADO!");
                } else {
                    System.out.println("Nota não permitida");
            }

                sc.close();
        }
    }
