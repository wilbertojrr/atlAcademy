import java.util.Scanner;

/* 3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
*/
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el precio original");

        double og = sc.nextDouble();

        System.out.println("Ingresa el % de descuento");

        double desc = sc.nextDouble();

        sc.close();

        double precio = (og -((og*desc)/100));

        System.out.println("El precio con descuento es: "+ precio);
    }

}
