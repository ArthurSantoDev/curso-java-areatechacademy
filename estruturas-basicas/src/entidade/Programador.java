package entidade;

public class Programador extends Pessoa implements Presidenciavel{


    @Override
    public void candidatarPresidente() {

        System.out.println("Candidatar-se a presidente");

    }
}
