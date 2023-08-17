package Day0001;

public class NextPermutation {
    public static void main(String[] args) {
        Solution3 obj = new Solution3();

        int[] array = {1,2,3,4,5,6};
        for (int number: obj.revereArray(array, 1, 2)) {
            System.out.printf(" " + number);
        }
        System.out.println();
    }
}

class Solution3 {
    public void nextPermutation(int[] nums) {

        for (int i=nums.length-1; i>=0; ++i) {
            if (i == 0) {
                nums = revereArray(nums, i, nums.length-1);
                break;
            }

        }
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

}
