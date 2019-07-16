public class Exemplo1 {

    public static void main(String[] args){

        System.out.println("Iniciando programa...");

        short idade = 31;

        System.out.println("Idade:"  + idade);

        double habitantesAmericaLatina;

        habitantesAmericaLatina = (double)569000000000L;

        System.out.println("Habitantes:" + habitantesAmericaLatina);

        double habitantesAmerica = habitantesAmericaLatina + 200000000L;

        System.out.println("America: "+ habitantesAmerica);

        short carrosPorHabitante = (short)3;

        double numeroCarrosAmerica = habitantesAmerica * carrosPorHabitante;

        System.out.println("Carros america: "+ numeroCarrosAmerica);
        char letraA = 'A' + 1;
        System.out.println(letraA);
        boolean estaPago = false;

        if (estaPago){
            System.out.println("Boleto está pago");
            System.out.println("Valor: 1222");
        } else {
            System.out.println("Boleto Não está pago!!! ");
        }

        boolean existemCarros = carrosPorHabitante > 0;

        if (existemCarros){
            System.out.println("Carros por habitante: " + carrosPorHabitante);
        }


        int valor = 0;

        if(valor == 0) {
            System.out.println("Valor zerado");

        }else if(valor <= 10){
            System.out.println("Valor abaixo de 10");

        }else{
            System.out.println("Valor igual a: "+ valor);
        }

        switch(valor){
            case 0:
                System.out.println("Valor zerado");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Valor abaixo de 10");
                break;
            default:
                System.out.println("Valor igual a: "+valor);
        }


    }

}
