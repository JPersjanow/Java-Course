import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();

        int t = (number % 100) / 10;
        int h = (number % 1000) / 100;
        int i = (number % 10);

        if (i != 0){
            System.out.println(i + "" + t + "" + h);
        } else {
            System.out.println(t + "" + h);
        }


    }
}