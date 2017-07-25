import java.util.Scanner;

/**
 * Created by smita on 2/14/17.
 *
 * Write a program that prints a staircase of size n.
 *
 */

public class Staircase {
    public static void main(String[] args){
        // input reader
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter staircase size:");
        int size = scanner.nextInt();

        // loop for line break
        for(int i=size; i>0; i--){
            int j;
            // loop for space
            for(j=1; j<i; j++){
                System.out.print(" ");
            }
            // loop for #
            for(int k=j; k<=size; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
