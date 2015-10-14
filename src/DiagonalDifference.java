import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumA = 0;
        int sumB = 0;
        int f;

        for (int i = 0; i < n; i++) {
            f = in.nextInt();
            sumA += f;

            // prevents program from attempting to skip integers after adding
            // the last integer
            if (i == n-1) {
                break;
            }
            // skips the next n integers
            for (int j = 0; j < n; j++) {
                int g = in.nextInt();
            }
        }

        for (int k = 0; k < n; k++) {

            for (int j = 0; j < n; j++) {
                int g;
                if (j == 0) {
                    g = in.nextInt();
                }
                g = in.nextInt();
                sumB += in.nextInt();
            }


        }

        System.out.println(sumA);
    }
}