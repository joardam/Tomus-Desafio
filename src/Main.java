import desafios.d1.*;
import desafios.d2.*;
import desafios.d3.*;
import desafios.d4.*;
import desafios.d5.*;
import desafios.d6.*;
import desafios.d7.*;
import desafios.d8.*;
import desafios.d9.TemperatureConverter;


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
        System.out.println("-------------------------------------");

        //desafio 7:
        System.out.print(ListDuplicateRemover.removeDuplicates(List.of(3,3,5,8,7,6,3,1)));
        System.out.println("-------------------------------------");

        //desafio 8:
        System.out.println(OrdenateString.alphabeticOrder("o rato roeu a roupa do rei de roma"));
        System.out.println("-------------------------------------");

        //desafio 9:
        System.out.println(TemperatureConverter.convert(100, 'C'));
        System.out.println(TemperatureConverter.convert(212, 'F'));
        System.out.println("-------------------------------------");
    }
}