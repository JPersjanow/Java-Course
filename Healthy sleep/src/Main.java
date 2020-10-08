import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num3 < num1) {
            System.out.println("Deficiency");
        } else if (num3 > num2) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}