package exerciciointerfaces;

import java.util.*;

public class TempoExecucaoColecoes {

    public static void main(String[] args) {
        list();
    }

    private static void list(){

        long inicio = System.currentTimeMillis();

        Collection<Integer> lista = new LinkedHashSet<Integer>();
        for (int i = 0; i < 50000; i++) {
            lista.add(i);
        }
        System.out.println("Adicao: "+ (System.currentTimeMillis() - inicio));

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            it.next();
        }
        System.out.println("Percorrendo: "+ (System.currentTimeMillis() - inicio));

        Iterator<Integer> it2 = lista.iterator();
        while (it2.hasNext()) {
            lista.contains(it2.next());
        }
        System.out.println("Contains: "+ (System.currentTimeMillis() - inicio));

//        System.out.println(System.currentTimeMillis() - inicio);
    }
}
