public class ReverseString {

    public static String reverseString(String s) {
        char[] sArray = s.toCharArray();
        for (int i = 0; i< s.length()/2; i++) {
            char tempChar = sArray[i];
            sArray[i] = sArray[s.length()-1-i];
            sArray[s.length()-1-i] = tempChar;
        }
        return sArray.toString();
    }


    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));
    }
}
