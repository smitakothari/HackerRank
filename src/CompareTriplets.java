import java.util.Scanner;

/**
 * Created by smita on 2/14/17.
 *
 * Alice and Bob each created one problem for HackerRank.
 * A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories:
 * problem clarity, originality, and difficulty.

 We define the rating for Alice's challenge to be the triplet A=(a0,a1,a2), and the rating for Bob's challenge
 to be the triplet B=(b0,b1,b2).

 Your task is to find their comparison scores by comparing  a0 with b0, a1 with b1, and a2 with b2.

 If a>b, then Alice is awarded  point.
 If b>a, then Bob is awarded  point.
 If a=b, then neither person receives a point.
 */

public class CompareTriplets {
    public static void main(String[] args){
        // input reader
        Scanner scanner = new Scanner(System.in);

        // variable declaration
        int[] arrayA = new int[3];
        int[] arrayB = new int[3];
        int alicePoints = 0;
        int bobPoints = 0;

        // input array A
        for(int i=0; i<3; i++){
            arrayA[i] = scanner.nextInt();
        }

        // input array B
        for(int i=0; i<3; i++){
            arrayB[i] = scanner.nextInt();
        }

        // compare two arrays
        for (int k=0; k<3; k++){
            if((arrayA[k] >= 1 && arrayA[k] <= 100) && (arrayB[k] >= 1 && arrayB[k] <= 100)) {
                if (arrayA[k] > arrayB[k]) {
                    alicePoints++;
                } else if (arrayA[k] < arrayB[k]) {
                    bobPoints++;
                }
            }
        }

        // displays output
        System.out.println(alicePoints + " " + bobPoints);
    }
}
