public class EquilibriumIndex {

    // O(n) solution
    public static int equilibriumPoint(int[] nums) {
        int totalArraySum = 0;
        int equilibriumIndex = 0;
        int sumSoFar = 0;

        for (int i = 0; i < nums.length; i++) {
            totalArraySum += nums[i];
        }

        for (int j = 0; j < nums.length; j++) {
            equilibriumIndex = j;
            sumSoFar += nums[j];
            if (sumSoFar >= totalArraySum/2) {
                break;
            }
        }
        return equilibriumIndex;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,4,3};
        System.out.println(equilibriumPoint(nums));
    }
}
