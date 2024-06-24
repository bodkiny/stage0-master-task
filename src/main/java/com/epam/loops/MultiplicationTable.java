package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", i, numberTableToPrint, numberTableToPrint * i);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printTable(2);
    }

}
