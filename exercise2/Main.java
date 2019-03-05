package by.epam.javatreining.chybisau.exercise2;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int numberOne = new Random().nextInt();
        int numberTwo = new Random().nextInt();
        int biggestDigit = NumbersController.findBiggestDigit(numberOne);
        boolean isPalindrome = NumbersController.isNumberPalindrome(numberOne);
        boolean isPrime = NumbersController.isPrimeNumber(numberOne);
        List<Integer> allPrimeDivisors = NumbersController.findAllPrimeDivisors(numberOne);

        View.printNumber(numberOne);
        View.printNumber(numberTwo);
        View.printBiggestDigit(biggestDigit);
        View.printIsPalindrome(numberOne, isPalindrome);
        View.printIsPrime(numberOne, isPrime);
        View.printAllPrimeDivisors(allPrimeDivisors);
    }
}
