import desafios.d1.ListEvenNumbersBetween;
import desafios.d2.Palindrome;
import desafios.d3.FactorialRecursive;
import desafios.d4.MaxNumberInList;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        //desafio 1:
        System.out.println(ListEvenNumbersBetween.returnList(1,7));
        System.out.println("-------------------------------------");
        //desafio 2:
        System.out.println(Palindrome.isPalindromeMethod1("arara"));
        System.out.println(Palindrome.isPalindromeMethod2("arara"));

        System.out.println(Palindrome.isPalindromeMethod1("arar"));
        System.out.println(Palindrome.isPalindromeMethod2("arar"));
        System.out.println("-------------------------------------");

        //desafio 3:
        System.out.println(FactorialRecursive.factorial(3));
        System.out.println(FactorialRecursive.factorial(3));
        System.out.println("-------------------------------------");
        //desafio 4:
        System.out.println(MaxNumberInList.maxNumber(List.of(1,2,3,4,9,11,10)));
        System.out.println("-------------------------------------");

    }
}