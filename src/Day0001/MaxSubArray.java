package Day0001;

public class MaxSubArray {
    public static void main(String[] args) {

    }
}

class Solution4 {
    public int maxSubArray(int[] nums) {
        int prevMaxSum = nums[0], currentMaxSum = nums[0];

        for (int i=1; i<nums.length; ++i) {
            currentMaxSum += nums[i];
            if (currentMaxSum > prevMaxSum) prevMaxSum = currentMaxSum;
            if (currentMaxSum <= 0) currentMaxSum = 0;
        }

        return prevMaxSum;
    }
}
