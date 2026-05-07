/*
    Nama File: MPiaraan.java
    Deskripsi: class main Piaraan untuk menguji kelas Piaraan
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 07 Mei 2026
*/

import java.util.*;

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan piaraan = new Piaraan();

        System.out.println("=== Aplikasi Piaraan ===");
        Anabul anabul1 = new Anabul("Mimi");
        Kucing kucing1 = new Kucing("Kitty", 3.5);
        Anggora anggora1 = new Anggora("Luna", 4.2);
        KembangTelon kembang1 = new KembangTelon("Telon", 2.9);

        piaraan.enqueueAnabul(anabul1);
        piaraan.enqueueAnabul(kucing1);
        piaraan.enqueueAnabul(anggora1);
        piaraan.enqueueAnabul(kembang1);

        System.out.println("Jumlah piaraan: " + piaraan.getNbelm());
        showAllPiaraan(piaraan);

        System.out.println("\n-- Cek anabul pertama tanpa melepas --");
        System.out.println(piaraan.getAnabul());

        System.out.println("\n-- Ambil dan hapus anabul pertama --");
        System.out.println(piaraan.getAnabul() + " diambil dari piaraan.");
        piaraan.dequeueAnabul();
        System.out.println("Jumlah piaraan setelah dequeue: " + piaraan.getNbelm());
        showAllPiaraan(piaraan);
    }

    private static void showAllPiaraan(Piaraan piaraan) {
        if (piaraan.getNbelm() == 0) {
            System.out.println("Tidak ada piaraan.");
            return;
        }

        List<Anabul> buffer = new ArrayList<>();
        System.out.println("Daftar piaraan saat ini:");
        while (piaraan.getNbelm() > 0) {
            Anabul current = piaraan.getAnabul();
            System.out.println("- " + current);
            buffer.add(current);
            piaraan.dequeueAnabul();
        }

        for (Anabul anabul : buffer) {
            piaraan.enqueueAnabul(anabul);
        }
    }
}

