import java.util.Scanner;

/**
 * Created by smita on 3/30/17.
 *
 * Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters
 * as 2 space-separated strings on a single line.
 */

public class LetsReview {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int number = scanner.nextInt();

        String[] inputArray = new String[number];
        System.out.println("Enter input strings:");
        for(int i=0; i<number; i++){
            inputArray[i] = scanner.next();
            //scanner.skip("\n");
        }

        for(int i=0; i<number; i++){
            String evenString = "", oddString = "";
            char[] charArray = inputArray[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if(j%2 == 0){
                        evenString = evenString + charArray[j];
                }
                else {
                        oddString = oddString + charArray[j];
                }
            }
            System.out.println(evenString + " " + oddString);
        }
    }
}
