import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(name.endsWith("burg"));
    }
}