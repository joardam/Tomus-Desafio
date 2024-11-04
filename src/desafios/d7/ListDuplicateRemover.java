package desafios.d7;

import java.util.ArrayList;
import java.util.List;

public class ListDuplicateRemover {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        else {
            List<Integer> listWithoutDuplicates = new ArrayList<>();
            for (Integer integer : list) {
                if (!listWithoutDuplicates.contains(integer)) {
                    listWithoutDuplicates.add(integer);
                }
            }
            return listWithoutDuplicates;
        }
    }
}
