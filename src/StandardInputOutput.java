import java.util.Scanner;

/**
 * Created by smita on 2/9/17.
 *
 * Problem statement: Read an integer, a double, and a String from stdin, then print the values according to below instructions:
 * There are three lines of output:
 * On the first line, print String
 * On the second line, print Double
 * On the third line, print Int
 */

public class StandardInputOutput {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String message;
        int number;
        double decimalValue;

        System.out.println("Enter an integer, a double and a string values");

        number = scanner.nextInt();
        decimalValue = scanner.nextDouble();
        message = scanner.nextLine() + scanner.nextLine();

        System.out.println("String: " + message);
        System.out.println("Double: " + decimalValue);
        System.out.println("Int: " + number);
    }
}
