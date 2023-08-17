package Day0002;

public class CountInversion {
    public static void main(String[] args) {

    }
}

class Solution1 {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        int count = 0;

        for (int i=0; i<arr.length; ++i) {
            for (int j=0; j<i; ++j) {
                if (arr[i] < arr[j]) ++count;
            }
        }

        return count;
    }
}
