import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double a, b, c, root1, root2, D;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients a, b and c:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        D = b * b - 4 * a * c;

        if (D > 0) {
            System.out.println("Roots are real and distinct");
            root1 = (-b + Math.sqrt(D)) / (2 * a);
            root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Root1 = %.2f and Root2 = %.2f%n", root1, root2);
        } else if (D == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.printf("Roots are real and equal: Root1 = Root2 = %.2f%n", root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.printf("Roots are complex and different: Root1 = %.2f + %.2fi and Root2 = %.2f - %.2fi%n",
                realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
