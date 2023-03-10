public class Main {
    public static void main(String[] args) {

        int primerNumero = 2;
        int segundoNumero = 20;
        boolean pares = false;

        while(primerNumero <= segundoNumero) {
            if(primerNumero % 2 == 0 && pares){
                System.out.println(primerNumero);
            }

            if (primerNumero % 2 == 1 && !pares){
                System.out.println(primerNumero);
            }

            primerNumero++;
        }
    }

}

