import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Random random = new Random();

        int nRamdon = random.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Intenta adivinar, ingresa un numero del 1 al 100.");

        int nAdivina = sc.nextInt();

        sc.close();

        if (nRamdon == nAdivina){
            System.out.println("Felicidades has adivinado.");
        }else {
            System.out.println("lo siento, vuelve a intentar.");
        }
    }
}
