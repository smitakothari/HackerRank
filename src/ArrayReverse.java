import java.util.Scanner;

/**
 * Created by smita on 3/31/17.
 *
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 */

public class ArrayReverse {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int numberOfElements = scanner.nextInt();

        if (numberOfElements >= 1 && numberOfElements <= 1000) {
            int[] inputArray = new int[numberOfElements];

            for (int i = 0; i < numberOfElements; i++) {
                int temp = scanner.nextInt();
                if(temp >=1 && temp <= 10000)
                inputArray[i] = temp;
            }

            for (int i = numberOfElements - 1; i >= 0; i--) {
                System.out.print(inputArray[i] + " ");
            }
        }
    }
}
