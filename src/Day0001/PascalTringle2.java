package Day0001;

import java.util.ArrayList;
import java.util.List;

public class PascalTringle2 {
    public static void main(String[] args) {

    }
}

class Solution7 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> response = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i<rowIndex; ++i) {
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
        return response.get(rowIndex-1);
    }
}
