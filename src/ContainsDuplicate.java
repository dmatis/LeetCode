import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value
 * appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate {

    /** O(n^2) solution **/
    public static boolean containsDuplicateQuadratic(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /** O(n) solution **/
    public static boolean containsDuplicateLinear(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int i : nums) {
            if (numSet.contains(i)) {
                return true;
            }
            numSet.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicateQuadratic(new int[]{1, 2, 3, 2}));
        System.out.println(containsDuplicateQuadratic(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicateQuadratic(new int[]{1, 2, 2}));
        System.out.println(containsDuplicateQuadratic(new int[]{0}));

        System.out.println(containsDuplicateLinear(new int[]{1,2,3,1}));
        System.out.println(containsDuplicateLinear(new int[]{1,2,3,4}));
    }
}
