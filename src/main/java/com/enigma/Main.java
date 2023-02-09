package com.enigma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        main:
        while (true) {
            System.out.println("\n======= Selamat Datang Enigmanians =======");
            System.out.println("Silahkan Pilih Menu :");
            System.out.println("1. Jadwal Harian");
            System.out.println("2. Raport Nilai Sekolah");
            System.out.println("3. Attack Zombie");
            System.out.println("4. Tebak Ganjil atau Genap");
            System.out.println("5. Exit");

            System.out.print("\nPilihan Anda : ");
            String userInput = in.nextLine();

            try {
                switch (userInput) {
                    case "1" -> DailySchedule.main(in);
                    case "2" -> SchoolReport.main(in);
                    case "3" -> AttackZombie.main(in);
                    case "4" -> OddEven.main(in);
                    case "5" -> {
                        break main;
                    }
                    default -> System.out.println("Masukan tidak valid, mohon dicoba kembali!!");
                }
            } catch (Exception e) {
                System.out.println("Masukan tidak valid!");
            }
        }
    }
}
