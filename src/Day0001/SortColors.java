package Day0001;

public class SortColors {
    public static void main(String[] args) {

    }
}

class Solution5 {
    public void sortColors(int[] nums) {
        int zeroCount = 0, oneCount = 0, twoCount = 0;

        for (int number: nums) {
            if (number == 0) ++zeroCount;
            if (number == 1) ++oneCount;
            if (number == 2) ++twoCount;
        }

        int index = 0;
        while (zeroCount-- > 0) {
            nums[index] = 0;
            ++index;
        }

        while (oneCount-- > 0) {
            nums[index] = 1;
            ++index;
        }

        while (twoCount-- > 0) {
            nums[index] = 2;
            ++index;
        }
    }
}
