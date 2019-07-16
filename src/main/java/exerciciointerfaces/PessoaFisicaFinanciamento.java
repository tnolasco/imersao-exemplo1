package exerciciointerfaces;

public class PessoaFisicaFinanciamento
        extends PessoaFisica
//        implements Pessoa --- Normalmente não é usado.
{

    public PessoaFisicaFinanciamento() {
        super("Fixo...");
    }

    public void calcularSalario() {
        System.out.println("Salario da pessoa: "+getNome("Fulano"));
        System.out.println("Salario da pessoa: "+this.getNome("Ciclano"));
        System.out.println("Salario da pessoa: "+super.getNome("Beltrano"));
    }

    @Override
    public String getNome(String nome) {
        return "Fixo";
    }
}
