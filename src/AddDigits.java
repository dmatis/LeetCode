/**
 * Given a non-negative integer num, repeatedly add all its digits
 * until the result has only one digit.
 * ie. Given num = 38, (3 + 8) = 11, num = 11, (1 + 1) = 2, num = 2. return 2.
 *
 * Recursive solution
 */
public class AddDigits {

    public static int sumDigits(int num) {

        if (num < 10) {
            return num;
        }
        else {
            int sumOfDigits = 0;
            while (num > 0) {
                sumOfDigits += num % 10;
                num = num / 10;
            }
            return sumDigits(sumOfDigits);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(38));
        System.out.println(sumDigits(410));
        System.out.println(sumDigits(73));
    }
}
