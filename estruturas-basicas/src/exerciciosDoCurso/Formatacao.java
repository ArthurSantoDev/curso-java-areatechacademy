package exerciciosDoCurso;

public class Formatacao {
    public static void main(String[] args) {

        double preco = 130.90;
        int idade = 20;
        String nome = "Arthur";

        System.out.printf("%.3f\n", preco);
        System.out.printf("%.2f\n\n", preco);

        System.out.printf("O preço dessa mercadoria é: %.2f Reais\n", preco);
        System.out.printf("A idade é: %d\n", idade);
        System.out.printf("O nome é: %s\n\n", nome);

        System.out.printf("O preço da mercadoria é R$%.2f e o cliente é %s e ele tem %d anos de idade. \n", preco, nome, idade);

    }
}
