import java.util.Scanner;

/**
 * Created by smita on 2/9/17.
 * Problem statement: Take three 3 integers as input from user and display in three different lines.
 */
public class IntegerInput {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int input1, input2, input3;
        System.out.println("Enter 3 integers");
        input1 = input.nextInt();
        input2 = input.nextInt();
        input3 = input.nextInt();
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
    }
}
