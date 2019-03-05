package by.epam.javatreining.chybisau.exercise1;

import java.util.Random;

public class HeadsAndTailsController {

    public static int countHeads(int numberOfFlips) {
        int numberOfHeads = 0;
        if (numberOfFlips > 0) {
            for (int counter = 0; counter < numberOfFlips; counter++) {
                if (new Random().nextBoolean()) {
                    ++numberOfHeads;
                }
            }
        }
        return numberOfHeads;
    }
}
