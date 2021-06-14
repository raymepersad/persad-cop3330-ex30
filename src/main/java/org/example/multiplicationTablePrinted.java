/*
 *  UCF COP3330 Summer 2021 Assignment 27 Solution
 *  Copyright 2021 RAYME PERSAD
 */

/*
Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
 */


package org.example;

public class multiplicationTablePrinted {
    private int[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private int[] y = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    // variant with for loop
    void multipleTable() {
        int num = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                num = x[i] * y[j];
                System.out.println(i + " X " + j + " = " + num);
            }
        }
    }

    // variant with for loop
    void multipleTable2() {
        int num = 0;
        for (int item : x) {
            for (int item2 : y) {
                num = x[item] * y[item2];
                System.out.println(item + " X " + item2 + " = " + num);
            }
        }
    }
}
