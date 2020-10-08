import java.util.Scanner;//put imports you need here

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String age = scanner.next();
        String degree = scanner.next();
        String experience = scanner.next();
        String preffered = scanner.next();

        System.out.print("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + preffered +" dishes.");
    }
}