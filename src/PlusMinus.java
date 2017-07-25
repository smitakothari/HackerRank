import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by smita on 2/14/17.
 * Input Format: The first line contains an integer, N, denoting the size of the array.
 *
 * Output Format: You must print the following 3 lines:
 * A decimal representing of the fraction of positive numbers in the array.
 * A decimal representing of the fraction of negative numbers in the array.
 * A decimal representing of the fraction of zeroes in the array.
 *
 */
public class PlusMinus {
    public static void main(String[] args){
        // input reader
        Scanner scanner = new Scanner(System.in);

        // variable declaration
        int size, positiveCounter=0, negativeCounter=0, zeroCounter=0;
        int[] arr;
        float positiveFraction, negativeFraction, zeroFraction;

        System.out.println("Enter array size:");
        size = scanner.nextInt();

        // initializing array
        arr = new int[size];

        // loop to enter values to array
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }

        // loop to count negative positive and zero numbers in array
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0) {
                negativeCounter++;
            }
            else if(arr[i]==0){
                zeroCounter++;
            }
            else if(arr[i]>0){
                positiveCounter++;
            }
        }

        // calculate fraction
        positiveFraction = (float)positiveCounter/(float)size;
        negativeFraction = (float)negativeCounter/(float)size;
        zeroFraction = (float)zeroCounter/(float)size;

        // convert value to six places decimal
        DecimalFormat df = new DecimalFormat("0.000000");

        System.out.println(df.format(positiveFraction));
        System.out.println(df.format(negativeFraction));
        System.out.println(df.format(zeroFraction));
    }
}
