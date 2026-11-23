import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== CALCULADORA ====");

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("\nSelecciona una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Potencia");
        System.out.print("Opción: ");

        int opcion = sc.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                resultado = Math.pow(num1, num2);
                break;

            default:
                System.out.println("Opción no válida");
                sc.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}