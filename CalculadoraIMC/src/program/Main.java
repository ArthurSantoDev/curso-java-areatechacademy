package program;

import entities.Pessoa;

import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Pessoa pessoa = new Pessoa();

        Scanner sc = new Scanner(System.in);

        pessoa.peso = Double.parseDouble(JOptionPane.showInputDialog("Escreva seu peso"));

        pessoa.altura = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua altura"));

        pessoa.imc();



    }

}