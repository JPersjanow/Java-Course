import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        double sum = 0.0;
        double len = 0.0;
        for (; min <= max; min++) {
            if (min % 3 == 0) {
                sum += min;
                len += 1;
            }
        }
        System.out.print(sum / len);
    }
}