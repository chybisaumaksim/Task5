package by.epam.javatreining.chybisau.exercise1;

public class Main {
    public static void main(String[] args) {

        int numberOfFlips = 1000;

        int numberOfHeads = HeadsAndTailsController.countHeads(numberOfFlips);
        int numberOfTails = numberOfFlips - numberOfHeads;
        View.print(numberOfHeads, numberOfTails);
    }
}
