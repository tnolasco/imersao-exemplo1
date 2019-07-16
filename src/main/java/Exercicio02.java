public class Exercicio02 {

    public static void main(String[] args) {

        //Imprima todos os números de 150 a 300.
        for (short i = 150; i <= 300; i++) {
            //System.out.println(i);
        }

        int i = 150;
        while (i <= 300) {
            //System.out.println(i);
            i = i + 1;
        }

        int v = 150;
        while (true) {
            //System.out.println(v);

            if (v >= 300) {
                break;
            }
            //v = v+1;
            //v += 1;
            v++;
        }


        // Imprima a soma de 1 até 1000.
        int soma = 0;
        for (int m = 0; m <= 1000; m++) {
            soma += m;
            System.out.println("m:" + m + " -> " + soma);
        }
        System.out.println("soma: " + soma);

        //Imprima todos os múltiplos de 3, entre 1 e 100.
        int inicio = 0;
        int fim = 100;

        int count = 0;
        while (count < fim) {
            if( count%3 == 0){
                System.out.println(count);
            }
            count++;
        }
        System.out.println("-------");
        System.out.println(inicio);
        System.out.println(fim);
        System.out.println(count);


        //4.  Imprima os fatoriais de 1 a 10.
        //O fatorial de um número n é n * (n-1) * (n-2) * ... * 1.

//        int fatorial = 0;
////        for (int f = 1; f <= 10;f++){
////            fatorial = 0;
////            for(int fact=f-1;fact<f;fact--){
////                fatorial = f * fact;
////            }
////            System.out.println(f+ ": "+ fatorial);
////        }

        for (int fatorial = 0; fatorial <= 10; fatorial++) {

            if (fatorial == 0) {
                System.out.println("F(0) é : 0");
            } else {
                int valor = fatorial;

                for (int i2 = fatorial - 1; i2 > 0; i2--) {
                    valor *= i2;
                }
                System.out.println(String.format("F(%s) é : %s", fatorial, valor));
            }

            int potencia = 1^4;
        }

        System.out.println("-------");

        int fatorial10 = fatorial(10);
        System.out.println(fatorial10);

        System.out.println("-------");
        //5. Faça um for que inicie uma variável n (número) como 1
        // //e a potência (resultado)como 1 e varia n de 1 até 10:

        int somaPotencias = 0;

        for (int n = 1; n <= 10; n++) {
            //somaPotencias += Math.pow(n, n);
            somaPotencias += potencia(n, n);
            System.out.println("Soma das potências: "+somaPotencias);
        }

        int fibonacci = 0;
        int limite = 100;
        int anterior = 0;

        while (fibonacci < limite){
            if(fibonacci == 0){
                fibonacci= 0;
            } else if( fibonacci == 1) {
                fibonacci = 1;
            }else{
                fibonacci = anterior+fibonacci;
            }
            anterior = fibonacci;

            fibonacci++;
            System.out.println(fibonacci);
        }

    }

    private static int potencia(int n, int m){
        int potencia = n;
        while (m > 1){
            potencia *= n;
            m--;
        }
        return potencia;
    }

    private static int fatorial(int n){
        if(n <= 1){
            return 1;
        }else{
            return n * fatorial(n-1);
        }
    }

//    7. Imprima  os  primeiros  números  da  série  de  Fibonacci  até  passar  de  100.
//    A  série  de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la,
//    private static int fibonacci(int n){
//        if(n == 0){
//            return 0;
//        } else if( n == 1){
//            return 1;
//        }else{
//            return n + fibonacci(n-1);
//        }
//    }



}
