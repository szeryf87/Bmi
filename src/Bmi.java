import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj wzrost w metrach: ");
            a = scanner.nextDouble();
            System.out.println("Podaj wage w kilogramach: ");
            b = scanner.nextDouble();

            double c = b / (a * a);

            if (c < 18.50) {
                System.out.println("Niedowaga.");
            }

            else if (c > 18.50) {
                System.out.println("Wartość prawidłowa.");
            }
            else if (c > 24.99) {

                System.out.println("Nadwaga");
            }

        scanner.close();
        }
    }



