/*
    Nama File: Pegawai.java
    Deskripsi: Kelas pegawai yang merupakan superclass untuk pegawai di universitas
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 26 Maret 2026
*/

import java.util.Date;

public class Pegawai {
    // Atribut
    private  String NIP; 
    private String nama;
    private Date tanggalLahir;
    private Date tanggalMasuk; // TMT
    private int gajiPokok;

    // Method

    /** Konstruktor */
    public Pegawai(String NIP, String nama, Date tanggalLahir, Date tanggalMasuk, int gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tanggalMasuk = tanggalMasuk;
        this.gajiPokok = gajiPokok;
    }

    /** Getter NIP */
    public String getNIP() {
        return NIP;
    }

    /** Getter nama */
    public String getNama() {
        return nama;
    }

    /** Getter tanggal lahir */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    /** Getter tanggal masuk */
    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    /** Getter gaji pokok */
    public int getGajiPokok() {
        return gajiPokok;
    }

    /* Method untuk menampilkan informasi pegawai */
    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + tanggalMasuk);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
