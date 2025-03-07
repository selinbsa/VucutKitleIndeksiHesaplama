import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: " );

        //Taking height from user
        double height = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: " );

        //Taking weight from user
        double weight = scanner.nextDouble();

        //Calculating result with inputs taking from user
        double calculate = weight / (height * height);

        //Showing result to user
        System.out.println("Vücut Kitle Indeksiniz: " + calculate);

    }
}