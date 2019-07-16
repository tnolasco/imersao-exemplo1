package exerciciointerfaces;

public abstract class PessoaFisica implements Pessoa {

    private String sobrenome;

    public PessoaFisica(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public abstract void calcularSalario();

    @Override
    public String getNome(String nome) {
        return nome;
    }

}
