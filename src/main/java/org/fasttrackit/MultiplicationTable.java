package org.fasttrackit;

public class MultiplicationTable {
    public void multiply() {
        int x = 12;
        int a=-1;
        while (a < x) {
            for (int i = -1; i < x; i++) {
                a++;
                while (i++ < 12) {
                    System.out.println(a + " x " + i + " = " + (a*i));
                }
            }

        }

    }
}
