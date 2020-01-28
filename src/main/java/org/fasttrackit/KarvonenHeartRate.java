package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KarvonenHeartRate {


    public void calculatingHeartRate() {

        try {
            System.out.print("What is your pulse? ");
            Scanner scanner = new Scanner(System.in);
            int restingHeart = scanner.nextInt();
            System.out.print("How old are you? ");
            Scanner scanner1 = new Scanner(System.in);
            int age = scanner1.nextInt();


            int intensity = 50;

            System.out.println("Intensity    | Rate");
            System.out.println("-------------|------");
            while (95 > intensity) {
                int targetHeartRate = (((220 - age) - restingHeart) * intensity) + restingHeart;
                intensity += 5;
                System.out.println("  " + intensity + "%        | " + targetHeartRate + " bpm");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please introduce valid data");
            calculatingHeartRate();
        }


    }
}
