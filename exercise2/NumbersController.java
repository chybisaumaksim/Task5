package by.epam.javatreining.chybisau.exercise2;

import java.util.ArrayList;

public class NumbersController {

    static int measure = 10;

    public static int findBiggestDigit(int number) {
        int biggestDigit = -1;
        int lastDigit;
        number = returnPositiveEquivalent(number);
        while (number != 0) {
            lastDigit = number % measure;
            if (number % measure > biggestDigit) {
                biggestDigit = lastDigit;
                number = ((number - biggestDigit) / measure);
            } else {
                number = (number - number % measure) / measure;
            }
        }
        return biggestDigit;
    }

    public static boolean isNumberPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number != 0) {
            reversed = (reversed * measure) + (number % measure);
            number /= measure;
        }
        return reversed == original;
    }

    public static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        number = returnPositiveEquivalent(number);
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static ArrayList<Integer> findAllPrimeDivisors(int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        number = returnPositiveEquivalent(number);
//        if (!isPrimeNumber(number)) {
        for (int i = 2; i <= Math.floor(Math.sqrt(number)); i++) {
            if (number % i == 0 && isPrimeNumber(i)) {
                arrayList.add(i);
            }
        }
//        }
        return arrayList;
    }

    public static int returnPositiveEquivalent(int number) {
        return number > 0 ? number : -number;
    }

}
