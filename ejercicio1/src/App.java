import java.util.Scanner;
import java.util.InputMismatchException;
import matematicas.meyor.mayor;

public class App {

    public static void main(String[] args) throws Exception {
        boolean continua;
        do {
            try {
                continua = false;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Comprobar cuál es el mayor");
                System.out.print("Introduzca un numero: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Introduzca otro numero: ");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.print("Introduzca otro numero: ");
                int c = Integer.parseInt(scanner.nextLine());
                System.out.printf("El numero mayor entre %d, %d y %d es el %d", a, b, c, mayor.numeromayor(a, b, c));
                scanner.close();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error, escriba solo numeros enteros");
                continua = true;
            }
        } while (continua);
    }
}