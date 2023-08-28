import java.util.Arrays;
import java.util.Scanner;

public class clase7E1 {

    public static void main(String[] args) {

        int [] numeros = new int[5];

        Scanner sc = new Scanner(System.in);

        int nMayor = 0;
        int nMenor = 0;
        double avg = 0;
        for (int i=0; i < 5; i++){
            System.out.println("Ingrese un numero: ");
            numeros [i] = sc.nextInt();

            if (numeros[i] > nMayor || i == 0){
                nMayor = numeros [i];
            }

            if (numeros[i] < nMenor || i==0){
                nMenor = numeros [i];
            }

            avg = avg + numeros[i];
        }
        sc.close();
        for (int i=0; i < 5; i++){
            System.out.println("El numero en la posicion " + i + " es: " + numeros[i]);
        }

        System.out.println("el numero mayor es: " + nMayor);
        System.out.println("el numero menor es: " + nMenor);

        double avgResul = avg/5;

        System.out.println("El promedio es: " + avgResul);
    }
}
