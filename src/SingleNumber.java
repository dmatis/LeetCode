/**
 * Given an array of integers, every element appears twice
 * except for one. Find that single one.
 * Needs to run in O(n) and without extra memory (if possible)
 **/

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Will return 0 as default if no single integer is in original array
 * Program currently can only handle positive integers
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) throws IllegalArgumentException {
        /** An array with only one unpaired element will always have an odd number of integers **/
        if (nums.length % 2 == 0) {
            throw new IllegalArgumentException("Must provide a array containing a single integer that only appears once");
        }

        /** Covers the condition that array is size 1 and simply returns that element **/
        if (nums.length == 1) {
            return nums[0];
        }

        /** Current solution requires extra memory **/
        int[] tempArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            tempArray[nums[i]]++;
        }
        for (int j = 0; j < tempArray.length; j++) {
            if (tempArray[j] == 1) {
                return j;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array3 = {1,2,1,2,3,4,5,4,5};
        int[] array1 = {4,2,3,4,1,2,3};
        int[] arrayOneElem = {1};
        //System.out.println(singleNumber(array3));
        //System.out.println(singleNumber(array1));
        System.out.println(singleNumber(arrayOneElem));
    }
}
