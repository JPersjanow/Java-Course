import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.next();
        double a;
        double b;
        double c;
        double floorage;

        switch (figure) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();

                double s = (a + b + c) / 2;
                floorage = Math.sqrt(s * (s - a) * (s - b) * (s -c));
                System.out.println(floorage);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                floorage = a * b;
                System.out.println(floorage);
                break;

            case "circle":
                double r = scanner.nextDouble();
                floorage = 3.14 * Math.pow(r, 2);
                System.out.println(floorage);

        }
    }
}