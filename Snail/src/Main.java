import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int days = 0;

        while (h != 0) {
            int n = a - b;
            h = h - n;
            days += 1;
        }
        System.out.print(days);
    }
}