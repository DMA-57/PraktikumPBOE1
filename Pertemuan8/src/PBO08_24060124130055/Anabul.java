package PBO08_24060124130055;

/*
    Nama File: Anabul.java
    Deskripsi: kelas Anabul
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 30 April 2026
*/

public class Anabul {
    // Atribut
    private String nama;

    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    }

    // method 

    // getter
    public String getNama() {
        return nama;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{nama='" + nama + "'}";
    }
}
