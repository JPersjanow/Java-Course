//put imports you need here
import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String jave = scanner.next();
        String programming = scanner.next();
        String language = scanner.next();

        System.out.println(language);
        System.out.println(programming);
        System.out.println(jave);
    }
}
