package comparator;

import java.util.Comparator;

public class ArtistaComparator implements Comparator<Artista> {

    @Override
    public int compare(Artista o1, Artista o2) {
        return  o1.getId().compareTo(o2.getId());
//        return o1.getNome().compareTo(o2.getNome());
    }
}
