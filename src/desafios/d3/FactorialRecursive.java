package desafios.d3;

public class FactorialRecursive {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be greater than or equal to 0");
        }

        else if (n == 0) {
            return 1;
        }

        else {
            return n * factorial(n - 1);
        }
    }
}
