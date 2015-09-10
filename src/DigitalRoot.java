/**
 * Optimal Digital Root solution utilizing modulo 9 property
 */
public class DigitalRoot {

    public static int computeDigitalRoot(int n) {
        return n == 0 ? 0 : n == 9 ? 9 : n % 9;
    }

    public static void main(String[] args) {
        System.out.println(computeDigitalRoot(38));
        System.out.println(computeDigitalRoot(9));
        System.out.println(computeDigitalRoot(0));
        System.out.println(computeDigitalRoot(41));
    }
}
