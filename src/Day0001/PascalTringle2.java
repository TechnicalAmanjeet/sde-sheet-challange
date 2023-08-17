package Day0001;

import java.util.ArrayList;
import java.util.List;

public class PascalTringle2 {
    public static void main(String[] args) {

    }
}

class Solution7 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i<=                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        rowIndex; ++i) {
            temp.add(nCr(rowIndex, i));
        }
        return temp;
    }

    public Integer nCr(Integer n, Integer r) {
        int response = 1;
        for (Integer i= 0; i<r; ++i) {
            response = response * (n-i);
            response = response / (i +1);
        }

        return response;
    }
}
