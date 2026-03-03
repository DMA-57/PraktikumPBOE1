/*
    Nama File: MGaris.java
    Deskripsi: Main file atau driver untuk kelas Garis
    Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 3 Maret 2026
*/

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik untuk garis
        Titik titik1 = new Titik(1, 2);
        Titik titik2 = new Titik(4, 6);

        // Menggunakan konstruktor default dan parameter
        Garis garisDefault = new Garis();
        System.out.println("Garis default dibuat:");
        garisDefault.printGaris();

        // Membuat objek garis dengan konstruktor berparameter
        Garis garis1 = new Garis(titik1, titik2);

        // menggunakan getter untuk mengakses titik
        System.out.println("Koordinat titik awal garis1: (" + garis1.getTitik1().getAbsis() + ", " + garis1.getTitik1().getOrdinat() + ")");
        System.out.println("Koordinat titik akhir garis1: (" + garis1.getTitik2().getAbsis() + ", " + garis1.getTitik2().getOrdinat() + ")");

        // Cetak panjang dan gradien garis
        System.out.println("Panjang garis: " + garis1.panjangGaris());
        System.out.println("Gradien garis: " + garis1.gradienGaris());

        // Titik tengah
        Titik tengah = garis1.titikTengah();
        System.out.println("Titik tengah garis1: (" + tengah.getAbsis() + ", " + tengah.getOrdinat() + ")");

        // Cetak persamaan dan bentuk garis
        garis1.printGaris();
        garis1.printPersamaan();

        // membuat garis lain untuk perbandingan
        Garis garis2 = new Garis(new Titik(2, 3), new Titik(5, 7));
        System.out.println("\nGaris2");
        garis2.printGaris();
        garis2.printPersamaan();

        System.out.println("Apakah garis1 sejajar garis2? " + garis1.isSejajar(garis2));
        System.out.println("Apakah garis1 tegak lurus garis2? " + garis1.isTegakLurus(garis2));
        System.out.println("Apakah garis1 tidak berpotongan dengan garis2? " + garis1.isTidakBerpotongan(garis2));

        // Mengubah titik awal menggunakan setTitik1
        System.out.println("\nMengubah titik awal garis1 menggunakan setTitik1()...");
        garis1.setTitik1(new Titik(0, 0));
        System.out.println("Koordinat titik awal baru: (" + garis1.getTitik1().getAbsis() + ", " + garis1.getTitik1().getOrdinat() + ")");

        // Mengubah titik akhir garis1 dan cetak ulang
        garis1.setTitik2(new Titik(5, 7));
        System.out.println("\nPanjang garis setelah perubahan titik akhir: " + garis1.panjangGaris());
        System.out.println("Gradien garis setelah perubahan titik akhir: " + garis1.gradienGaris());

        // Tampilkan jumlah garis dan titik yang dibuat
        System.out.println("Jumlah objek garis dibuat: " + Garis.getCounterGaris());
        System.out.println("Jumlah objek titik dibuat: " + Titik.getCounterTitik());
    }
}
