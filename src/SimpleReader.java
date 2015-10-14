import java.util.Scanner;

public class SimpleReader {

    public static int sumValues(int sum, int b) {
        return sum + b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int f = in.nextInt();
            sum = sumValues(sum, f);
        }

        System.out.println(sum);
    }
}
