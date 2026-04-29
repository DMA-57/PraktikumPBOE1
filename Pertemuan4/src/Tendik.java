/*
    Nama File: Tendik.java
    Deskripsi: Kelas tendik yang merupakan subclass dari pegawai untuk tendik di universitas
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 26 Maret 2026
*/

import java.util.Calendar;
import java.util.Date;

public class Tendik extends Pegawai{
    // Atribut
    private  String bidang;
    final int BUP = 55; // batas usia pensiun
    private int tunjangan;

    // Method
    /** Konstruktor */
    public Tendik(String NIP, String nama, Date tanggalLahir, Date tanggalMasuk, int gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, tanggalMasuk, gajiPokok);
        this.bidang = bidang;
        this.tunjangan = hitungTunjangan();
    }

    /** Getter bidang */
    public String getBidang() {
        return bidang;
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
        
        // Buat tanggal lahir + 1 bulan
        Calendar cal = Calendar.getInstance();
        cal.setTime(getTanggalLahir());
        cal.add(Calendar.MONTH, 1);
        Date tanggalLahirPlus1Bulan = cal.getTime();
        
        long selisihWaktu = sekarang.getTime() - tanggalLahirPlus1Bulan.getTime();
        int usiaSekarang = (int) (selisihWaktu / (1000L * 60 * 60 * 24 * 365)); // Menghitung usia saat ini dalam tahun
        int sisaMasaKerja = BUP - usiaSekarang; // Menghitung sisa masa kerja hingga pensiun
        return new Date(sekarang.getTime() + (long) sisaMasaKerja * 365 * 24 * 60 * 60 * 1000); // Menghitung tanggal pensiun
    }

    /** Method untuk menghitung tunjangan berdasarkan masa kerja */
    private int hitungTunjangan() {
        return (int) (1/ 100 * getGajiPokok() * getMasaKerja()); // Tunjangan sebesar 1% dari gaji pokok untuk setiap tahun masa kerja
    }


    /** Method untuk menampilkan informasi tendik */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Tenaga Kependidikan");
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun" + " bulan");
        System.out.println("Tanggal Pensiun: " + getPensiunDate());
        System.out.println("Tunjangan: " + tunjangan);
    }
}
