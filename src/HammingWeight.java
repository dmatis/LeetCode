/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3
 */
public class HammingWeight {

    public static void main(String[] args) {
        System.out.println(computeWeight(31));
        System.out.println(computeWeightLog(31));
    }

    /** O(n) solution **/
    private static int computeWeight(int n) {
        int count = 0;
        for (int i = 15; i >= 0; i--) {
            if (n == 0) {
                return count;
            }
            if (n - Math.pow(2, i) >= 0) {
                count++;
                n -= Math.pow(2, i);
            }
        }
        return count;
    }

    /** O(logn) solution **/
    private static int computeWeightLog(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }
}