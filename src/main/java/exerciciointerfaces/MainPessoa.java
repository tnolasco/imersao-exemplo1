package exerciciointerfaces;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa p = new PessoaFisicaFinanciamento();
        ((PessoaFisicaFinanciamento) p).calcularSalario();

    }
}
