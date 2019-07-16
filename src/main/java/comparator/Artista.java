package comparator;

public class Artista implements Comparable<Artista>{

    public Artista(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    private Integer id;
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Artista o) {
        int compareTo = this.nome.compareTo(o.nome);
        return compareTo;
    }
}
