package com.enigma;

import java.util.Scanner;

public class SchoolReport {

    static String getGrade(int score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 55) {
            return "C";
        } else if (score >= 40) {
            return "D";
        } else {
            return "E";
        }
    }

    static void main(Scanner in) {
        System.out.println("=== Raport Nilai Sekolah ===");
        System.out.println("Input : ");
        System.out.print("TUGAS = ");
        int tugas = in.nextInt();

        System.out.print("UTS = ");
        int uts = in.nextInt();

        System.out.print("UAS = ");
        int uas = in.nextInt();

        int score = (tugas + uts + uas) / 3;
        String grade = getGrade(score);

        System.out.println("Nilai " + score + " dengan hasil akhir adalah " + grade);
    }
}
