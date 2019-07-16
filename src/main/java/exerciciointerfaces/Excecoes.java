package exerciciointerfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Objects;

public class Excecoes {
    public static void main(String args[]) {

        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("Resultado = " + c);
        }catch (ArithmeticException e){
            System.out.println("Erro ao executar operação:"+ e.getMessage());
        }

        String a = null;
        if(Objects.nonNull(a)){
            System.out.println(a.charAt(0));
        }

        try {
            String b = "Imersao Java";
//            if(b.length() > 30){
                char c = b.charAt(29);
                System.out.println(c);
//            }
        //Evitaria esse catch com um if(lenght conforme comentário)
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Não foi possível obter caracter...." + e.getMessage());
        }

//        FileReader fr = null;
//        try {
//            File file = new File("E://arquivo.txt");
//            fr = new FileReader(file);
//        }catch (FileNotFoundException e){
//            System.out.println("Arquivo não existe:"+e.getMessage());
//
//        }catch (IOException e){
//            System.out.println("Erro de leitura:"+e.getMessage());
//        } finally {
//            try {
//                fr.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        File file = new File("E://arquivo.txt");
        try (FileReader fr = new FileReader(file)) {
            fr.read();

        }catch (FileNotFoundException e){
            System.out.println("Arquivo não existe:"+e.getMessage());

        }catch (IOException e){
            System.out.println("Erro de leitura:"+e.getMessage());
        }

        try {
            int num = Integer.parseInt("zero");
            System.out.println(num);

        }catch (NumberFormatException e){
            System.out.println("Número inválido:"+e.getMessage());
        }
        
        try {
            throw new IllegalArgumentException();

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}