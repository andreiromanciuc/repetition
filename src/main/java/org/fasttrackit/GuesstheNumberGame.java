package org.fasttrackit;

import java.lang.annotation.Repeatable;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuesstheNumberGame {

    public void letsPlay() {
        System.out.println("Please select difficulty level of the game.");
        System.out.println("1, 2, or 3");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        if (select == 1) {
            levelOne();
        } else if (select == 2) {
            levelTwo();
        } else if (select == 3) {
            levelThree();
        } else System.out.println("Please select the level from the range.");
    }

    public void levelOne() {

        int range = ThreadLocalRandom.current().nextInt(1, 10);
        System.out.println("Guess the number");

        Scanner scanner1 = new Scanner(System.in);
        int sc = scanner1.nextInt();
        int i = 0;

        if (sc != range) {

            while (sc != range) {
                i++;
                if (sc > range) {
                    System.out.println("Too high. Guess again:");
                    sc = scanner1.nextInt();
                } else if (sc < range) {
                    System.out.println("Too low. Guess again:");
                    sc = scanner1.nextInt();
                }
                while (sc == range) {
                    System.out.println("You got it in " + (1 + i++) + " guesses.");
                    break;
                }
            }
        }else System.out.println("You won from first guess!");

    }

    public void levelTwo() {
        int range = ThreadLocalRandom.current().nextInt(1, 100);
        System.out.println("Guess the number");

        Scanner scanner1 = new Scanner(System.in);
        int sc = scanner1.nextInt();
        int i = 0;

        if (sc != range) {

            while (sc != range) {
                i++;
                if (sc > range) {
                    System.out.println("Too high. Guess again:");
                    sc = scanner1.nextInt();
                } else if (sc < range) {
                    System.out.println("Too low. Guess again:");
                    sc = scanner1.nextInt();
                }
                while (sc == range) {
                    System.out.println("You got it in " + (1 + i++) + " guesses.");
                    break;
                }
            }
        }else System.out.println("You won from first guess!");

    }

    public void levelThree() {
        int range = ThreadLocalRandom.current().nextInt(1, 1000);
        System.out.println("Guess the number");

        Scanner scanner1 = new Scanner(System.in);
        int sc = scanner1.nextInt();
        int i = 0;

        if (sc != range) {

            while (sc != range) {
                i++;
                if (sc > range) {
                    System.out.println("Too high. Guess again:");
                    sc = scanner1.nextInt();
                } else if (sc < range) {
                    System.out.println("Too low. Guess again:");
                    sc = scanner1.nextInt();
                }
                while (sc == range) {
                    System.out.println("You got it in " + (1 + i++) + " guesses.");
                    break;
                }
            }
        }else System.out.println("You won from first guess!");

    }
}

