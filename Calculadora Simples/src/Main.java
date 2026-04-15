import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("--- CALCULADORA JAVA ---\n");

        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.println("\nEscolha um operador, se deseja fazer uma soma: '+', subtração: '-', multiplicação: '*', divisão: '/' ? ");
        String operator = sc.next();

        System.out.println("\nDigite o segundo número: ");
        double num2 = sc.nextDouble();

        double result;

        System.out.println("\n------------------------");

        switch (operator) {

            case "+":
                result = (num1 + num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case "-":
                result = (num1 - num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case "*":
                result = (num1 * num2);
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero!");
                } else {
                    result = (num1 / num2);
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;

            default:
                System.out.println("Operador ou numero não reconhecido, operação invalida");
                    break;
                }

                sc.close();
    }
}





/*
Locale.setDefault(Locale.US);

Scanner sc = new Scanner(System.in);

        System.out.println("--- CALCULADORA JAVA ---\n");

        System.out.println("Digite o primeiro numero: ");
double num1 = sc.nextDouble();

        System.out.println("\nEscolha um operador, se deseja fazer uma soma: '+', subtração: '-', multiplicação: '*', divisão: '/' ? ");
String operator = sc.next();

        System.out.println("\nDigite o segundo número: ");
double num2 = sc.nextDouble();

        System.out.println("\n------------------------");

        if (Objects.equals(operator, "+")) {
double result = (num1 + num2);
            System.out.println(num1 + " + " + num2 + " = " + result);

        } else if (Objects.equals(operator, "-")) {
double result = (num1 - num2);
            System.out.println(num1 + " - " + num2 + " = " + result);

        } else if (Objects.equals(operator, "*")) {
double result = (num1 * num2);
            System.out.println(num1 + " * " + num2 + " = " + result);

        } else if (Objects.equals(operator, "/")) {
        if (num2 == 0) {
        System.out.println("Erro: Não é possível dividir por zero!");
            } else {
double result = (num1 / num2);
                System.out.println(num1 + " / " + num2 + " = " + result);
            }

                    } else {
                    System.out.println("Operador não reconhecido, operação invalida");
        }

                sc.close();
 */