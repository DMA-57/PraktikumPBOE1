/*
    Nama File: Persegi.java
    Deskripsi: Kelas Persegi yang merupakan turunan dari kelas BangunDatar
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 12 Maret 2026
*/


public class Persegi extends BangunDatar {
    // Atribut
    private double sisi;
    public static int counterPersegi = 0; // menghitung jumlah objek persegi yang dibuat

    // Konstruktor
    public Persegi() {
        setJmlSisi (4);
        counterPersegi++; // Menaikkan counter setiap kali objek Persegi dibuat
    }
    
    public Persegi (double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
        counterPersegi++; // Menaikkan counter setiap kali objek Persegi dibuat
    }

    /** getter sisi */
    public double getSisi () {
        return sisi;
    }

    /** setter sisi */
    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    /** Menghitung luas persegi */
    public double getLuas(){
        return sisi * sisi; 
    }

    /** Menghitung keliling persegi */
    public double getKeliling(){
        return 4 * sisi;
    }

    /** Menghitung diagonal persegi */
    public double getDiagonal(){
        return Math.sqrt(2) * sisi; 
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Persegi: " + counterPersegi);
    }
}