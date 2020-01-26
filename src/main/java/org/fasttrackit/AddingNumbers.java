package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddingNumbers {


    public static void sumNumbers() {
        System.out.print("How many numbers you want to count? ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        int j = 0;
        while (j < number) {
            for (int i=0; i < number; i++) {
                System.out.print("Enter the "+(i+1)+" number ");
                numbers.add(scanner.nextInt());
                j++;
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("The total is " + sum);
    }


}
