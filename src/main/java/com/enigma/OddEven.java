package com.enigma;

import java.util.Scanner;

public class OddEven {
    static boolean isEven(int number) {
        return (number % 2) == 0;
    }

    static void main(Scanner in) {
        System.out.println("=== Tebak Ganjil atau Genap ===");
        System.out.print("Input : ");
        String input = in.nextLine();

        String value = isEven(Integer.valueOf(input)) ? "Genap" : "Ganjil";
        System.out.println(value);
    }
}
