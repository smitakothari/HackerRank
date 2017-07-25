import java.util.Scanner;

/**
 * Created by smita on 2/14/17.
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Input Format:
 * First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.
 *
 * Output Format:
 * For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.
 */

public class ProjectEuler1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            long a = 0, b = 0, d = 0;
            a = (n - 1) % 3;
            a = n - 1 - a;
            a = a / 3;
            b = (n - 1) % 5;
            b = n - 1 - b;
            b = b / 5;
            d = (n - 1) % 15;
            d = n - 1 - d;
            d = d / 15;
            long c = 3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * d * (d + 1) / 2;
            System.out.println(c);
        }
    }
}
