package desafios.d4;
import java.util.List;

public class MaxNumberInList {
    public static int maxNumber(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        else if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }

        else {
            int max = list.getFirst();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
            return max;
        }
    }

}
