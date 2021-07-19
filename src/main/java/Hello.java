import java.util.Scanner;

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        if (digit > 7) {
            System.out.println("Привет");
        }
    }
}
