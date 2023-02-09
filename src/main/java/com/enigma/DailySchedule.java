package com.enigma;

import java.util.Scanner;

public class DailySchedule {
    static void main(Scanner in) {
        System.out.println("=== Jadwal Harian ===");
        System.out.print("Input : ");
        int input = in.nextInt();

        switch (input) {
            case 4, 5 -> System.out.println("Bangun Pagi");
            case 6, 7 -> System.out.println("Mandi dan Sarapan");
            case 8, 9, 10, 11 -> System.out.println("Berangkat Sekolah");
            case 12 -> System.out.println("Pulang Sekolah");
            case 13, 14, 15 -> System.out.println("Tidur Siang");
            case 16, 17 -> System.out.println("Waktu Main");
            default -> {
                if (input > 24) {
                    System.out.println("Hanya ada 24 jam dalam sehari");
                } else {
                    System.out.println("Waktu Belajar dan Istirahat");
                }
            }
        }
    }
}
