/*
    Nama File: Lingkaran.java
    Deskripsi: Kelas Lingkaran yang merupakan turunan dari kelas BangunDatar
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 12 Maret 2026
*/

public class Lingkaran extends BangunDatar{
    // Atribut
    private double jari;
    public static int counterLingkaran = 0; // menghitung jumlah objek lingkaran yang dibuat

    // Method
    /** Konstruktor*/
    public Lingkaran(){
        this(14.0, "merah", "line");
    }

    /** Konstruktor*/
    public Lingkaran(double diameter, String warna, String border){
        super(1 , warna, border);
        this.jari = diameter / 2;
        counterLingkaran++; // Menaikkan counter setiap kali objek Lingkaran dibuat
    }

    /** Getter jari-jari */
    public double getJari(){
        return jari;
    }

    /** Setter jari-jari */
    public void setJari(double jari){
        this.jari = jari;
    }

    /** Menghitung luas lingkaran */
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    /** Menghitung keliling lingkaran */
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    /** Menghitung diameter lingkaran */
    public double getDiameter(){
        return 2 * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Lingkaran: " + counterLingkaran);
    }
}