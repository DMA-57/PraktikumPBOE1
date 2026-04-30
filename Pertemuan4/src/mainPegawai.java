/*
    Nama File: mainPegawai.java
    Deskripsi: main untuk mendemonstrasikan penggunaan kelas Lingkaran dan Persegi yang merupakan turunan dari kelas BangunDatar.
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 12 Maret 2026
*/


import java.util.Calendar;
import java.util.Date;

public class mainPegawai {
    private static Date makeDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static void main(String[] args) {
        Pegawai peg = new Pegawai("198765", "Budi Santoso", makeDate(1980, 4, 15), makeDate(2010, 1, 10), 3000000);
        Dosen dosen = new Dosen("123456", "Dr. Siti", makeDate(1970, 6, 20), makeDate(2000, 8, 1), 7000000, "Ilmu Komputer");
        DosenTetap dosenTetap = new DosenTetap("111222", "Dr. Andi", makeDate(1965, 3, 5), makeDate(1995, 9, 1), 8000000, "Teknik", "NIDN001");
        DosenTamu dosenTamu = new DosenTamu("333444", "Dr. Tamu", makeDate(1985, 2, 10), makeDate(2018, 7, 1), 4000000, "Matematika");
        Tendik tendik = new Tendik("555666", "Siti Nur", makeDate(1990, 11, 25), makeDate(2015, 5, 15), 2500000, "Administrasi");

        System.out.println("=== Pegawai ===");
        peg.printInfo();
        System.out.println();

        System.out.println("=== Dosen ===");
        dosen.printInfo();
        System.out.println();

        System.out.println("=== Dosen Tetap ===");
        dosenTetap.printInfo();
        System.out.println("Tunjangan: " + dosenTetap.getTunjangan());
        System.out.println();

        System.out.println("=== Dosen Tamu ===");
        dosenTamu.printInfo();
        System.out.println("Tunjangan: " + dosenTamu.getTunjangan());
        System.out.println();

        System.out.println("=== Tenaga Kependidikan (Tendik) ===");
        tendik.printInfo();
        System.out.println("Tunjangan: " + tendik.getTunjangan());
        System.out.println("Masa Kerja: " + tendik.getMasaKerja() + " tahun");
    }
}
