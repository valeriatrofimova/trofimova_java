import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Составить алгоритм: на входе есть числовой массив,
//необходимо вывести элементы массива кратные 3
public class Array {

    private static final int STOP_POPULATING = 0;

    public static void main(String[] args) {

// prepared array (alternative)
// int[] array = {1, 2, 4, 3, 3, 6, 9};


// dynamically created array
        System.out.println("Enter the numbers for array. " +
                "Then press 0 to finish operation");

        List<Integer> values = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int digit = scanner.nextInt();

            if (STOP_POPULATING != digit) {
                values.add(digit);
            } else break;
        }

        Integer[] array = values.toArray(new Integer[0]);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }

    }
}




