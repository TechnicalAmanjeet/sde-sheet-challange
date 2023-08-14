package Day0001;

import java.util.ArrayList;
import java.util.List;

public class PascalTringle {
    public static void main(String[] args) {
        Solution1 obj = new Solution1();
        List<List<Integer>> output = obj.generate(4);

        for (List<Integer> arr: output) {
            for (Integer ints: arr) {
                System.out.printf(" " + ints);
            }
            System.out.println();
        }
    }
}

class Solution1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> response = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i<numRows; ++i) {
            temp = new ArrayList<>();
            for (int j = 0; j<=i; ++j) {
                if (j == 0 || j == i) {
                    temp.add(1);
                    continue;
                }
                temp.add(response.get(i-1).get(j-1) + response.get(i-1).get(j));
            }
            response.add(temp);
        }
        return response;
    }
}
