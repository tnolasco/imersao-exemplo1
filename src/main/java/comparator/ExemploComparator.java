package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploComparator {

    public static void main(String[] args) {
        ArrayList<Artista> artistas = new ArrayList<Artista>();
        artistas.add(new Artista(1,"TOM JOBIM"));
        artistas.add(new Artista(3, "JOÃO GILBERTO"));
        artistas.add(new Artista(2, "CHICO BUARQUE"));
        artistas.add(new Artista(4, "CAETANO VELOSO"));
        artistas.add(new Artista(9,"JORGE BEN J)OR"));
        artistas.add(new Artista(8,"ROBERTO CARLOS"));
        artistas.add(new Artista(7,"NOEL ROSA"));
        artistas.add(new Artista(6,"CARTOLA"));
        artistas.add(new Artista(5,"TIM MAIA"));
        artistas.add(new Artista(0, "GILBERTO GIL"));

        System.out.println(artistas);

        Collections.sort(artistas);
        System.out.println(artistas);

        Collections.sort(artistas, new ArtistaComparator());
        System.out.println(artistas);

        Collections.sort(artistas, Collections.reverseOrder(new ArtistaComparator()));
        System.out.println(artistas);

    }
}
