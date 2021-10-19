package ru.vsu.cs.suvorov_d_a;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int height = readNumber("height: ");
        int width = readNumber("width: ");

        verifySize(height, width);

        printFigure(height, width);
    }

    private static int readNumber(String text) {
        System.out.print("Enter the value of " + text);
        Scanner scan = new Scanner(System.in);

        return scan.nextInt();
    }

    private static void verifySize(int height, int width) {
        if (height < 3 || width < 3) {
            System.out.println("Error. Data is not correct. Height and width must be greater than 2.");
            System.exit(1);
        }
    }

    private static void printFigure(int height, int width) {
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                System.out.print(" ");
                printUnderlines(width - 2);
                System.out.print(" ");
            } else if (i <= (width - 1) / 2) {
                printLine(i - 1, width);
            } else {
                System.out.print("|");
                printEmpties(width - 2);
                System.out.print("|");
            }
            System.out.println();
        }
    }

    private static void printUnderlines(int countUnderlines) {
        for (int i = 0; i < countUnderlines; i++ ) {
            System.out.print("-");
        }
    }

    private static void printEmpties(int countEmpties) {
        for (int i = 0; i < countEmpties; i++ ) {
            System.out.print(" ");
        }
    }

    private static void printLine(int countEmpties, int width) {
        System.out.print("|");
        printEmpties(countEmpties);

        for (int i = 0; i < width - 2 - 2 * countEmpties; i++) {
            System.out.print("*");
        }

        printEmpties(countEmpties);
        System.out.print("|");
    }
}









