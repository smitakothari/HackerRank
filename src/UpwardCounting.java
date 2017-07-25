import java.util.Scanner;

/**
 * Created by smita on 7/14/17.
 *
 * Simply take a number from STDIN and count upwards 10 times with all of the words separated by "then".
 * sample input: 60
 * sample output: 61 then 62 then 63 then 64 then 65 then 66 then 67 then 68 then 69 then 70
 *
 */
public class UpwardCounting {

    public static void main(String args[]){
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number <= 10000000)
            countUp(number);
    }

    static void countUp(int start){
        String separator = "then";
        String result = "";
        for(int i = 1; i<=10; i++){
            if(i !=10) {
                result = Integer.toString(start + i) + " " + separator + " ";
            }
            else{
                result = Integer.toString(start + i);
            }
            System.out.print(result);
        }
    }
}
