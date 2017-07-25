import java.util.Scanner;

/**
 * Created by smita on 2/10/17.
 * Given an integer, N, print its first 10 multiples. Each multiple N*i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.
 * Constraint: 2<=N<=20
 */
public class FirstTenMultiple {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 2 and 20: ");
        int input = scanner.nextInt();
        if(2 <= input && input <= 20){
            for(int i=1;i<=10;i++){
                System.out.println(input + " * " + i + " = " + (input*i));
            }
        }
    }
}
