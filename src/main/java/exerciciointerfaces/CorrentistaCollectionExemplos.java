package exerciciointerfaces;

import java.util.ArrayList;

public class CorrentistaCollectionExemplos {

    public static void main(String[] args) {

        Correntista c1 = new Correntista(1, "Gilberto");
        Correntista c2 = new Correntista(2, "Fulano");

        ArrayList<Correntista> correntistas = new ArrayList<>();
        correntistas.add(c1);
        correntistas.add(c2);

        Correntista busca = new Correntista(2, "Fulano");
        Correntista encontrado = correntistas.get(correntistas.indexOf(busca));

        System.out.println(encontrado);

        System.out.println(busca);
        System.out.println(c2.equals(busca));

    }

}
