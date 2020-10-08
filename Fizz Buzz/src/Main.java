import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        for (; min <= max; min++) {
            if (min % 3 == 0 && min % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (min % 3 == 0 && min % 5 != 0) {
                System.out.println("Fizz");
            } else if (min % 3 != 0 && min % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(min);
            }
        }
    }
}