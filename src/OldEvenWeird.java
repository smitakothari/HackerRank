import java.util.Scanner;

/**
 * Created by smita on 2/9/17.
 *
 * Task
 Given an integer, n, perform the following conditional actions:

 If n is odd, print Weird
 If n is even and in the inclusive range of 2 to 5, print Not Weird
 If n is even and in the inclusive range of 6 to 20, print Weird
 If n is even and greater than 20, print Not Weird
 Complete the stub code provided in your editor to print whether or not  is weird.
 */

public class OldEvenWeird {
    public static void main(String [] args){
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number%2 == 0){
            if(number >= 2 && number <= 5)
                System.out.println("Not Weird");
            if(number >= 6 && number <= 20)
                System.out.println("Weird");
            if(number>20)
                System.out.println("Not Weird");
        }
        else {
            System.out.println("Weird");
        }
    }
}
