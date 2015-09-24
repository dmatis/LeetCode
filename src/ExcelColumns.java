
public class ExcelColumns {

    /** Uses ASCII char values, since ('A' - 1) == 64
     *  (s.charAt(i) - ('A' - 1) will return A=1, B=2, etc
     *  (number * 26) multiplies the result for each additional letter
     */
    public static int convertToNum(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number * 26 + (s.charAt(i) - ('A' - 1));
        }
        return number;
    }

    public static void main(String[] args) {
        String aa = "AA";
        String c = "C";

        System.out.println(convertToNum(c));
        System.out.println(convertToNum(aa));
    }
}
