import java.lang.reflect.Array;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int numOfAs = 0;
        int numOfBs = 0;
        int numOfCs = 0;
        int numOfDs = 0;
        int grade = 0;

        for (int i = 0; i < num; i++) {
            grade = scanner.nextInt();
            if (grade == 5) {
                numOfAs += 1;
            } else if (grade == 4) {
                numOfBs += 1;
            } else if (grade == 3) {
                numOfCs += 1;
            } else if (grade == 2) {
                numOfDs += 1;
            }
        }

        System.out.print(numOfDs + " " + numOfCs + " " + numOfBs + " " + numOfAs);

    }
}