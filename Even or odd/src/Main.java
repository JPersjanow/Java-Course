import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                if (num == 0) {
                    continue;
                }
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

    }
}