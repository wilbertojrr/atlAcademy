import java.util.Random;
import java.util.Scanner;

public class Clase6E8 {

    private static String setElecion(int n){
        String election;

        switch (n){
            case 1:
                election = "piedra";
            break;

            case 2:
                election = "papel";
            break;

            case 3:
                election = "tijera";
            break;

            default:
                election = "Numero no valido";
        }
        return election;
    }

    private static String game (int eleccionUsuario, int nRamdom ){

        String resultado = "";

        switch (eleccionUsuario){

            case 1:

                if (nRamdom == 3){

                    resultado = "haz ganado";
                }

                if (nRamdom == 2){

                    resultado = "haz perdido";
                }

                if (nRamdom == 1){

                    resultado = "haz empatado";
                }

                break;


            case 2:
                if (nRamdom == 1){

                    resultado = "haz ganado";
                }

                if (nRamdom == 3){

                    resultado = "haz perdido";
                }
                if (nRamdom == 2){

                    resultado = "haz empatado";
                }
                break;

            case 3:
                if (nRamdom == 2){

                    resultado = "haz ganado";
                }

                if (nRamdom == 1){

                    resultado = "haz perdido";

                }

                if (nRamdom == 3){

                    resultado = "haz empatado";
                }
                break;

        }
        return resultado;
    }

    public static void main(String[] args) {

        System.out.println("Ingrese su elecion: 1. Piedra, 2. Papel, 3. Tijera");

        Scanner sc = new Scanner(System.in);
        int eleccionUsuario = sc.nextInt();
        sc.close();

        String eleccionUsuarioAsig = setElecion(eleccionUsuario);

        Random ramdom = new Random();
        int nRamdom = ramdom.nextInt(2) + 1;

        String manoMaquina = setElecion(nRamdom);


        System.out.println("Has seleccionado: " + eleccionUsuarioAsig);
        System.out.println("La maquina a seleccionado: " + manoMaquina);
        System.out.println("Resultado: " + game(eleccionUsuario,nRamdom) );
    }
}
