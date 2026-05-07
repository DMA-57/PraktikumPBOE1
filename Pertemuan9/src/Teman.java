/*
    Nama File: Teman.java
    Deskripsi: class Teman yang akan digunakan untuk menyimpan data teman-teman menggunakan koleksi generik ArrayList
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 07 Mei 2026
*/
import java.util.*;

public class Teman {
    // atribut
    private int nbelm; // jumlah teman dalam Lnama
    private List<String> Lnama; // koleksi generik untuk menyimpan nama teman

    // konstruktor
    public Teman() {
        Lnama = new ArrayList<String>();
        nbelm = 0;
    }

    // operator
    /** Getter untuk mendapatkan banyak elemen dalam Lnama */
    public int getNbelm() {
        return nbelm;
    }  

    /** Getter untuk mendapatkan nama di indeks tertentu */
    public String getNama(int indeks){
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        } else {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
    }

    /** Setter untuk mengatur nama di indeks tertentu*/
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        } else {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
    }
    
    /** Method untuk menambahkan nama teman ke dalam Lnama */
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    /** Method untuk menghapus nama teman dari daftar */
    public void delNama(String nama){
        if(Lnama.remove(nama)){ // jika berhasil dihapus <- ini return boolean 
            nbelm--;  // kurangi jumlah elemen
        }
    }

    /** Method yang mengembalikan true jika nama ada dalam koleksi Lnama*/
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    /** Method untuk mengganti nama dengna nama baru */
    public void gantiNama(String nama, String namabaru){
        int indeks = Lnama.indexOf(nama); // cari indeks nama yang ingin diganti
        if (indeks != -1) { // jika nama ditemukan
            Lnama.set(indeks, namabaru); // ganti nama di indeks tersebut
        } else {
            System.out.println("Nama tidak ditemukan dalam daftar.");
        }
    }

    /** Method untuk menghitung jumlah kemunculan nama di Lnama */
    public int countNama(String nama){
        // Kamus Lokal
        int count; // penghitung jumlah kemunculan nama
        
        // Algoritma
        count = 0; // inisialisasi penghitung
        for (String n : Lnama) { // foreach
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    /** Method untuk menampilkan semua nama teman */
    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String n : Lnama) {
            System.out.println("- " + n);
        }
    }

} // end of class Teman
 