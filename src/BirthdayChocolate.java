import java.util.Scanner;

/**
 * Created by smita on 3/10/17.
 */
public class BirthdayChocolate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements for array");
        int elementCount = scanner.nextInt();

        System.out.println("Enter the array elements:");
        int input[] = new int[elementCount];
        for(int i=0; i<elementCount; i++){
            input[i] = scanner.nextInt();
        }

        System.out.println("Enter the birth day and month:");
        int day = scanner.nextInt();
        int month = scanner.nextInt();

        int count=0;
        int sum[] = new int[elementCount-1];

        if(elementCount >=1 && elementCount <= 100){
            if(day >=1 && day <=31){
                if(month >=1 && month <=12){
                    for(int i=0; i<elementCount; i++){
                        if((i+1) < elementCount) {
                            sum[i] = input[i] + input[i + 1];
                        }
                    }
                }
            }
        }

        for(int i=0; i<sum.length; i++) {
            System.out.println(sum[i]);
            if((i+1) < sum.length){
                if(sum[i] == day) {
                    if (sum[i] == sum[i + 1]) {
                        count = count + 2;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
