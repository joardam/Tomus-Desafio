package desafios.d1;

import java.util.List;
import java.util.ArrayList;

public class ListEvenNumbersBetween {
    public static List<Integer> returnList(int start, int end) {
        List<Integer> evenNumbersList = new ArrayList<>();
        if (start > end) {
            throw new IllegalArgumentException("Start must be less than or equal to end");
        }

        else {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    evenNumbersList.add(i);
                }
            }
        }
        return evenNumbersList;
    }

}
