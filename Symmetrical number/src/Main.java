import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        String numRev = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            numRev += num.charAt(i);
        }
        if (num.equals(numRev)) {
            System.out.println("1");
        } else {
            System.out.println("38");
        }
    }
}