package org.fasttrackit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArrayValidator {
    public static String validateArray(int[] numbersArray) {
        for (int k = 0; k < numbersArray.length; k++) {
            for (int x = k + 1; x < numbersArray.length; x++) {
                if (numbersArray[k] < numbersArray[x]) {
                    for (int j = x + 1; j < numbersArray.length; j++) {
                        if (numbersArray[j] < numbersArray[k]) {
                            return "INVALID";
                        }
                    }
                }
            }
        }

        return "VALID";
    }

    public static void main( String[] args ) throws IOException {
        Scanner scanner = new Scanner(Paths.get(
                "D:\\Personale\\CODING\\FASTTRACKIT\\New folder\\org.fasttrackit\\repetition\\src\\main\\java\\org\\fasttrackit\\exercise 6 - input.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("D:\\Personale\\CODING\\FASTTRACKIT\\New folder\\org.fasttrackit\\repetition\\src\\main\\java\\org\\fasttrackit\\exercise 6 - output.txt", true));

        int testCasesCount = scanner.nextInt();

        for (int i = 1; i <= testCasesCount; i++) {
            int arrayLength = scanner.nextInt();

            int[] numbersArray = new int[arrayLength];

            for (int j = 0; j < arrayLength; j++) {
                numbersArray[j] = scanner.nextInt();
            }

            String result = validateArray(numbersArray);

            bufferedWriter.append("CASE#" + i + ": " + result);
            bufferedWriter.newLine();
        }
        scanner.close();
        bufferedWriter.close();
    }

}
