/*
    Nama File: Piaraan.java
    Deskripsi: class Piaraan yang akan digunakan untuk menyimpan data kucing dalam piaraan menggunakan koleksi generik ArrayList
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 12 Maret 2026
*/
import java.util.*;


public class Piaraan {
    // atribut
    private int nbelm; // jumlah elemen
    private Queue<Anabul> Lanabul; // koleksi generik untuk menyimpan nama anabul

    // konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<Anabul>();
        nbelm = 0;
    }

    // operator
    /** Getter untuk mendapatkan banyak elemen */
    public int getNbelm() {
        return nbelm;
    }

    /** Method untuk menambahkan anabul ke dalam Lanabul */
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    /** Method untuk memeriksa apakah anabul ada dalam Lanabul */
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    /** Getter elemen anabul pertama */
    public  Anabul getAnabul() {
        if (!Lanabul.isEmpty()) { // cek apakah Lanabul tidak kosong 
            return Lanabul.peek(); // peek untuk melihat elemen pertama tanpa menghapusnya
        } else {
            throw new NoSuchElementException("Lanabul kosong");
        }
    }

    /** Method untuk menghapus anabul dari Lanabul */
    public void dequeueAnabul() {
        if (!Lanabul.isEmpty()) { // cek apakah Lanabul tidak kosong 
            Lanabul.poll(); // poll untuk menghapus elemen pertama
            nbelm--;
        } else {
            throw new NoSuchElementException("Lanabul kosong");
        }
    }




} // end of class Piaraan
