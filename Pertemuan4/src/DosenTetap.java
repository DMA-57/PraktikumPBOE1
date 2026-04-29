/*
    Nama File: DosenTetap.java
    Deskripsi: Kelas dosen tetap yang merupakan subclass dari class dosen untuk dosen tetap di universitas
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 26 Maret 2026
*/

import java.util.Date;

public class DosenTetap extends Dosen {
    // Atribut
    private String NIDN; // Nomor Induk Dosen Nasional
    final int BUP = 65; // Batas Usia Pensiun
    private int tunjangan;


    // Method
    /** Konstruktor */
    public DosenTetap(String NIP, String nama, Date tanggalLahir, Date tanggalMasuk, int gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, tanggalMasuk, gajiPokok, fakultas);
        this.NIDN = NIDN;
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

    public Date getPensiunDate(){
        Date sekarang = new Date();
        long selisihWaktu = sekarang.getTime() - getTanggalLahir().getTime();
        int usiaSekarang = (int) (selisihWaktu / (1000L * 60 * 60 * 24 * 365)); // Menghitung usia saat ini dalam tahun
        int sisaMasaKerja = BUP - usiaSekarang; // Menghitung sisa masa kerja hingga pensiun
        return new Date(sekarang.getTime() + (long) sisaMasaKerja * 365 * 24 * 60 * 60 * 1000); // Menghitung tanggal pensiun
    }

    /** Method untuk menghitung tunjangan berdasarkan masa kerja */
    private int hitungTunjangan() {
        return 2 / 100 * getGajiPokok() * getMasaKerja(); // Tunjangan sebesar 2% dari gaji pokok untuk setiap tahun masa kerja
    }

    /** Method untuk menampilkan informasi dosen tetap */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun" + " bulan");
        System.out.println("Tanggal Pensiun: " + getPensiunDate());
        System.out.println("Tunjangan: " + tunjangan);
    }
}
