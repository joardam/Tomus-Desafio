import desafios.d1.ListEvenNumbersBetween;
import desafios.d2.Palindrome;
import desafios.d3.FactorialRecursive;

public class Main {
    public static void main(String[] args) {
        //desafio 1:
        System.out.println(ListEvenNumbersBetween.returnList(1,7));

        //desafio 2:
        System.out.println(Palindrome.isPalindromeMethod1("arara"));
        System.out.println(Palindrome.isPalindromeMethod2("arara"));

        System.out.println(Palindrome.isPalindromeMethod1("arar"));
        System.out.println(Palindrome.isPalindromeMethod2("arar"));

        //desafio 3:
        System.out.println(FactorialRecursive.factorial(3));
        System.out.println(FactorialRecursive.factorial(3));

    }
}