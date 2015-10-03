import java.util.Arrays;

public class AnagramFinder {

/* O(nlogn) solution
   Removes whitespaces, converts to char array, sorts and compares if equal
 */
public static boolean isAnagram(String s, String t) {
        char[] word1 = s.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = t.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String t1 = "elloh";
        String s2 = "arty";
        String t2 = "party";
        String s3 = "car";
        String t3 = "rat";
        String s4 = "aacc";
        String t4 = "ccac";

        System.out.println(isAnagram(s1,t1));
        System.out.println(isAnagram(s2, t2));
        System.out.println(isAnagram(s3,t3));
        System.out.println(isAnagram(s4,t4));
    }

}
