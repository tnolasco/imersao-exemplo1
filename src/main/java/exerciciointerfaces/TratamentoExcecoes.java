package exerciciointerfaces;

public class TratamentoExcecoes {

    public static void main(String[] args) {
        try {
            executa();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro genérico!");
        }
    }

    private static void executa() throws NumeroInvalidoException {
        int numero = validaNumero("A");
        System.out.println(numero);
    }

    private static int validaNumero(String s) throws NumeroInvalidoException {
        try {
            int parse = Integer.parseInt(s);
            return parse;
        } catch (NumberFormatException excecao){
            excecao.printStackTrace();
//            System.err.println(excecao.getMessage());
            throw new NumeroInvalidoException();
            //return -1;
        } finally {
            System.out.println(s);
        }//https://www.codepile.net/pile/Bo0QlnDX
        // http://tiny.cc/jnij9y
    }

}
