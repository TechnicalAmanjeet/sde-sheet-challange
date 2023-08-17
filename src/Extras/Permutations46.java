package Extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {
        Solution46 obj = new Solution46();

        int[] array = {1,3,2};
        for (List<Integer> numbers: obj.permute(array)) {
            for (Integer number: numbers) {
                System.out.printf(" " + number);
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> response = new ArrayList<>();

        Arrays.sort(nums);
        int[] arr = new int[nums.length];

        for (int i=0; i<nums.length; ++i) {
            arr[i] = nums[i];
        }

        response.add(convertArrayToList(arr));
        do {
            arr = nextPermutation(arr);
            response.add(convertArrayToList(arr));
        } while (!isBothArraySame(arr, nums));

        return response;
    }

    public boolean isBothArraySame(int[] firstArray, int[] secondArray) {
        for (int i = 0; i<firstArray.length; ++i) {
            if (firstArray[i] != secondArray[i]) return false;
        }

        return true;
    }

    public List<Integer> convertArrayToList(int[] nums) {
        List<Integer> response = new ArrayList<>();
        for (int number: nums ) {
            response.add(number);
        }

        return response;
    }

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
