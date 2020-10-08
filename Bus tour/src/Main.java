import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int num_bridges = scanner.nextInt();
        boolean crashes = false;

        for (int i = 1; i <= num_bridges; i++) {
            int bridge_height = scanner.nextInt();

            if (height >= bridge_height) {
                System.out.println("Will crash on bridge " + i);
                crashes = true;
                break;
            }
        }

        if (!crashes) {
            System.out.println("Will not crash");
        }
    }
}