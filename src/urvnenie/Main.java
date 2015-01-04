package urvnenie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        System.out.println("A?");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        System.out.println("B?");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }
        System.out.println("C?");
        if (sc.hasNextInt()) {
            c = sc.nextInt();
        }
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(D)) / (2.0 * a);
            System.out.printf("D = %g, x1 = %g, x2 = %g \n", D, x1, x2);
        }
        if (D == 0) {
            double x = -b / (2.0 * a);
            System.out.printf("D = %g, x = %g \n", D, x);
        }
        if (D < 0) {
            System.out.println("No resolve");
        }
    }
}
