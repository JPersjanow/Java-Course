import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code hers
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        for (int i=low; i < high + 1; i++) {
            System.out.print(word.charAt(i));
        }
    }
}
