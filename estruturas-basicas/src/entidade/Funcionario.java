package entidade;

public class Funcionario {

    public double salario = 3000;

    public double SalarioFinal(double bonus){

        return salario - 20 + bonus;

    }

}
