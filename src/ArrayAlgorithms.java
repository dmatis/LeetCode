import java.util.Arrays;

public class ArrayAlgorithms {

    public static void moveZeroes(int[] nums) {
        // iterate through the numbers in array
        for (int i = 0; i < nums.length - 1; i++) {
            // if the value is 0, find first non-zero and swap places
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int tempInt = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tempInt;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,0,12,4,0,6,0};
        int[] noZeroes = {3,4,6,2,1};
        int[] manyZeroes = {3,0,0,0,4,0};
        moveZeroes(nums);
        moveZeroes(noZeroes);
        moveZeroes(manyZeroes);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(noZeroes));
        System.out.println(Arrays.toString(manyZeroes));
    }
}
