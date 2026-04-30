/*
    Nama File: DosenTamu.java
    Deskripsi: Kelas dosen tamu yang merupakan subclass dari class dosen untuk dosen tamu di universitas
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 26 Maret 2026
*/

import java.util.Date;

public class DosenTamu extends Dosen {
    // Atribut
    private int tunjangan;

    // Method

    /** Konstruktor */
    public DosenTamu(String NIP, String nama, Date tanggalLahir, Date tanggalMasuk, int gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, tanggalMasuk, gajiPokok, fakultas);
        this.tunjangan = hitungTunjangan();
    }

    /** Getter tunjangan */
    public int getTunjangan() {
        return tunjangan;
    }
    
    /** Method mencari lama masa kerja */
    public int getMasaKerja() {
        Date sekarang = new Date();
        long selisihWaktu = sekarang.getTime() - getTanggalMasuk().getTime();
        return (int) (selisihWaktu / (1000L * 60 * 60 * 24 * 365)); // Menghitung masa kerja dalam tahun
    }

    /** Method untuk menghitung tunjangan */
    private int hitungTunjangan() {
        return (int) (2.5 / 100 * getGajiPokok()); 
    }  
    
    /** Method untuk menampilkan informasi dosen tamu */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun" + " bulan");
        System.out.println("Tunjangan: " + tunjangan);
    }

}
