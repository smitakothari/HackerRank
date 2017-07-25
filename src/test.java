import java.util.Scanner;

/**
 * Created by smita on 2/15/17.
 */
public class test {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int temperature[][] = new int[7][4];

        for(int i=0; i<7; i++){
            for(int j=0; j<4; j++){
                temperature[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<7; i++){
            for(int j=0; j<4; j++){
                System.out.print(temperature[i][j]);
            }
        }
    }
}
