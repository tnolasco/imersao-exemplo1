package exerciciointerfaces;

import java.util.Objects;

public class Correntista {

    private int numero;
    private String nome;

    public Correntista(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return this.numero == ((Correntista)obj).getNumero();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correntista that = (Correntista) o;
        return numero == that.numero &&
                Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nome);
    }

    @Override
    public String toString() {
        return "Hash: : "+this.hashCode() +", Numero: "+this.numero + ", Nome: "+this.nome;
    }
}
