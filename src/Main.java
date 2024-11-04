import desafios.d1.*;
import desafios.d2.*;
import desafios.d3.*;
import desafios.d4.*;
import desafios.d5.*;
import desafios.d6.*;


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

        //desafio 5:
        System.out.println(VogalCounting.countVogals("arara"));
        System.out.println("-------------------------------------");

        //desafio 6:
        System.out.println(FibonacciUntilLimit.returnList(2000));

    }
}