package exerciciointerfaces;

public class TesteTrycatch {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            comtry(1, i);
        }
        long tempo = System.currentTimeMillis() - inicio;
        System.out.println(String.format("tempo: %d", tempo));
    }

    private static void comtry(int a, int b) {
        try {
            int c = a + b;
//            System.out.print(".");
        }catch (Exception e){
        }
    }

    private static void semtry(int a, int b) {
        int c = a + b;
//        System.out.print(". ");
    }

}
