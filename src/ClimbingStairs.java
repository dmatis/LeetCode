
public class ClimbingStairs {

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int maxPermutations(int n) {
        return fibonacci(n + 1);
    }

    public static void main(String[] args) {

        ClimbingStairs stairs = new ClimbingStairs();
        System.out.println(stairs.maxPermutations(20));
    }
}
