import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: " );

        double height = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: " );

        double weight = scanner.nextDouble();

        double calculate = weight / (height * height);

        System.out.println("Vücut Kitle Indeksiniz: " + calculate);

    }
}