package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingBadInput {


    public void invest() {
        System.out.println("What is the rate of return?");
        Scanner scanner = new Scanner(System.in);


        try {
            int r = scanner.nextInt();
            if (r == 0) {
                System.out.println("Sorry. That's not a valid input.");
                invest();
            } else {
                int years = 72 / r;
                System.out.println("It will take " + years + " years to double your initial investment.");
            }
        } catch (Exception e) {
            System.out.println("Sorry. That's not a valid input.");
            invest();
        }
    }

}

