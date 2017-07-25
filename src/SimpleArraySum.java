import java.util.Scanner;

/**
 * Created by smita on 2/14/17.
 *
 * Given an array of N integers, can you find the sum of its elements?
 *
 * Input Format
 * The first line contains an integer, N, denoting the size of the array.
 * The second line contains N space-separated integers representing the array's elements.

 Output Format
 Print the sum of the array's elements as a single integer.
 */

public class SimpleArraySum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");
        int arraySize = scanner.nextInt();

        int[] arr = new int[arraySize];
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
