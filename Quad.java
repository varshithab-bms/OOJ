import java.util.Scanner;

public class Quad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of the equation [a, b, c]:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        sc.close();
        if (a == 0) {
            System.out.println("Invalid input");
            return;
        }
        double d = b * b - 4 * a * c;
        double r1, r2;
        if (d > 0) {
            System.out.println("The roots are real and distinct");
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
        } else if (d == 0) {
            System.out.println("The roots are real and equal.");
            r1 = r2 = -b / (2 * a);
            System.out.println("r1 = r2 = " + r1);
        } else {
            System.out.println("There are no real solutions");
        }
    }
}
