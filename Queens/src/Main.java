import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int vertical = Math.abs(x2-x1);
        int horizontal = Math.abs(y2-y1);

        if (y1 == y2 || x1 == x2 || horizontal == vertical) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}