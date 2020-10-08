import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        long product = 1L;

        for (; min < max; min++) {
            product *= min;
        }
        System.out.print(product);
    }
}