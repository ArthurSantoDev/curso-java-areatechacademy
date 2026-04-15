package entities;


import javax.swing.*;

public class Pessoa {

    public double peso;
    public double altura;



    public void imc() {
        double calcImc = peso / (altura * altura);
        String formate = String.format("%.2f", calcImc);

        if (calcImc < 18.5) {

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + formate + ". Voce está abaixo do peso!");

        } else if (calcImc >= 18.6 && calcImc <= 24.9) {

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + formate + ". Voce está no peso idael!");

        } else if (calcImc >= 25 && calcImc <= 29.9) {

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + formate + ". Voce está levemente acima do peso!");

        } else if (calcImc >= 30 && calcImc <= 34.9) {

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + formate + ". Voce está com obesidade grau 1!");

        } else if (calcImc >= 35 && calcImc <= 39.9) {

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + formate + ". Voce está com obesidade grau 2!");

        } else {

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + formate + ". Voce está com obesidade mórbida!");
        }
    }



}
