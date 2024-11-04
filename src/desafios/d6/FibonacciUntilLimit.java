package desafios.d6;

import java.util.ArrayList;
import java.util.List;

public class FibonacciUntilLimit {

    private static int toFibonacci(int n) {

        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round((Math.pow(phi, n) - Math.pow(1-phi,n)) / Math.sqrt(5));

    }

    public static List<Integer> returnList(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("Limit must be greater than or equal to 0");
        }

        else {
            List<Integer> fibonacciList = new ArrayList<>();
            int c = 1;
            while (toFibonacci(c) <= limit) {
                fibonacciList.add(toFibonacci(c));
                c++;
            }
            return fibonacciList;
        }
    }
}
