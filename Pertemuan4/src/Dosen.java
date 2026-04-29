/*
    Nama File: Dosen.java
    Deskripsi: Kelas dosen yang merupakan subclass untuk dosen di universitas
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 26 Maret 2026
*/

import java.util.Date;


public class Dosen extends Pegawai{
    // Atribut
    private String fakultas;

    // Method
    /** Konstruktor */
    public Dosen(String NIP, String nama, Date tanggalLahir, Date tanggalMasuk, int gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, tanggalMasuk, gajiPokok);
        this.fakultas = fakultas;
    }

    /** Getter fakultas */
    public String getFakultas() {
        return fakultas;
    }

    /** Method untuk menampilkan informasi dosen */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
