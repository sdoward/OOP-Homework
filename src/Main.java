import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter length in cm");
        Scanner scanner = new Scanner(System.in);
        int centimeters = scanner.nextInt();
        double inches = centimeters * 0.3937007874;
        System.out.println(inches);
    }
}
