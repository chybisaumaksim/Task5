package by.epam.javatreining.chybisau.exercise2;

import java.util.List;

public class View {

    public static void printBiggestDigit(int digit) {
        System.out.println("Biggest digit: " + digit);
    }

    public static void printIsPalindrome(int number, boolean result) {
        System.out.printf("%d is palindrome - %b\n", number, result);
    }

    public static void printIsPrime(int number, boolean result) {
        System.out.printf("%d is prime number - %b\n", number, result);
    }

    public static void printAllPrimeDivisors(List<Integer> numbers) {
        System.out.printf("Simple divisors are: ");
        for (Integer tmp : numbers) {
            System.out.print(tmp + " ");
        }
        System.out.println();
    }

    public static void printNumber(int number) {
        System.out.println(number);
    }
}


