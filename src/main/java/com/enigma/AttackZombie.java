package com.enigma;

import java.util.Scanner;

public class AttackZombie {

    static void attack(String number) {
        boolean firstNumberIsEven = OddEven.isEven(number.charAt(0));
        boolean lastNumberIsEven = OddEven.isEven(number.charAt(1));

        if (firstNumberIsEven && !lastNumberIsEven) {
            System.out.println("One Zombie Down!");
        } else if (!firstNumberIsEven && lastNumberIsEven) {
            System.out.println("You Are Dead!");
        } else {
            System.out.println("Try Again To Attack");
        }
    }

    static void main(Scanner in) {
        System.out.println("=== Attack Zombie ===");
        System.out.print("Input : ");
        String input = in.nextLine();

        if (input.length() == 2) {
            attack(input);
        } else {
            System.out.println("Angka tidak valid!");
        }
    }
}
