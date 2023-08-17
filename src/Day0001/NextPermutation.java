package Day0001;

public class NextPermutation {
    public static void main(String[] args) {
        Solution3 obj = new Solution3();

        int[] array = {1,3,2};
        for (int number: obj.nextPermutation(array)) {
            System.out.printf(" " + number);
        }
        System.out.println();
    }

}

class Solution3 {
    public int[] nextPermutation(int[] nums) {

        for (int i=nums.length-1; i>=0; --i) {
            if (i == 0) {
                nums = revereArrayUsingWhile(nums, i, nums.length-1);
                break;
            }

            if (nums[i-1] < nums[i]) {
                int swapIndex = nums.length - 1;
                for (int k = nums.length - 1; k>=i; --k) {
                    if (nums[k] > nums[i-1]) {
                        swapIndex = k;
                        break;
                    }
                }

                nums[i-1] = nums[i-1] ^ nums[swapIndex];
                nums[swapIndex] = nums[i-1] ^ nums[swapIndex];
                nums[i-1] = nums[i-1] ^ nums[swapIndex];

                revereArrayUsingWhile(nums, i, nums.length-1);
                break;
            }

        }

        return nums;
    }

    public int[] revereArray(int[] nums, int startIndex, int lastIndex) {
        for (int i = 0; i<= ((startIndex + lastIndex)/2) - startIndex; ++i) {
            if ((startIndex + i) != (lastIndex - i)) {
                nums[startIndex + i] = nums[startIndex + i] ^ nums[lastIndex - i];
                nums[lastIndex - i] = nums[startIndex + i] ^ nums[lastIndex - i];
                nums[startIndex + i] = nums[startIndex + i] ^ nums[lastIndex - i];
            }
        }

        return nums;
    }

    public int[] revereArrayUsingWhile(int[] nums, int startIndex, int lastIndex) {
        while (startIndex < lastIndex) {
            nums[startIndex] = nums[startIndex] ^ nums[lastIndex];
            nums[lastIndex] = nums[startIndex] ^ nums[lastIndex];
            nums[startIndex] = nums[startIndex] ^ nums[lastIndex];

            ++startIndex;
            --lastIndex;
        }

        return nums;
    }


}
