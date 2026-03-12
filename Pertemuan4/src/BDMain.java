/*
    Nama File: BDMain.java
    Deskripsi: Berisi method main untuk mendemonstrasikan penggunaan kelas Lingkaran dan Persegi yang merupakan turunan dari kelas BangunDatar.
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 12 Maret 2026
*/

public class BDMain {
    public static void main(String[] args) {
        // ===== DEMONSTRASI LINGKARAN =====
        System.out.println("===== LINGKARAN =====\n");
        
        // Membuat objek Lingkaran dengan konstruktor default
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.println("--- Lingkaran 1 (Konstruktor Default) ---");
        lingkaran1.printInfo();
        System.out.println("Diameter: " + lingkaran1.getDiameter());
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());
        System.out.println();
        
        // Membuat objek Lingkaran dengan konstruktor berparameter
        Lingkaran lingkaran2 = new Lingkaran(20, "biru", "solid");
        System.out.println("--- Lingkaran 2 (Konstruktor Berparameter) ---");
        lingkaran2.printInfo();
        System.out.println("Diameter: " + lingkaran2.getDiameter());
        System.out.println("Luas: " + lingkaran2.getLuas());
        System.out.println("Keliling: " + lingkaran2.getKeliling());
        System.out.println();
        
        // Mendemonstrasikan setter
        System.out.println("--- Menggunakan Setter pada Lingkaran 1 ---");
        lingkaran1.setJari(15);
        System.out.println("Jari-jari setelah diubah: " + lingkaran1.getJari());
        System.out.println("Luas baru: " + lingkaran1.getLuas());
        System.out.println("Keliling baru: " + lingkaran1.getKeliling());
        System.out.println();
        
        // ===== DEMONSTRASI PERSEGI =====
        System.out.println("===== PERSEGI =====\n");
        
        // Membuat objek Persegi dengan konstruktor default
        Persegi persegi1 = new Persegi();
        System.out.println("--- Persegi 1 (Konstruktor Default) ---");
        persegi1.printInfo();
        System.out.println();
        
        // Membuat objek Persegi dengan konstruktor berparameter
        Persegi persegi2 = new Persegi(10, "hijau", "dashed");
        System.out.println("--- Persegi 2 (Konstruktor Berparameter) ---");
        persegi2.printInfo();
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        System.out.println("Diagonal: " + persegi2.getDiagonal());
        System.out.println();
        
        // Mendemonstrasikan setter
        System.out.println("--- Menggunakan Setter pada Persegi 1 ---");
        persegi1.setSisi(8);
        System.out.println("Sisi setelah diubah: " + persegi1.getSisi());
        System.out.println("Luas baru: " + persegi1.getLuas());
        System.out.println("Keliling baru: " + persegi1.getKeliling());
        System.out.println("Diagonal baru: " + persegi1.getDiagonal());
        System.out.println();
        
        // ===== DEMONSTRASI SETTER DAN GETTER DARI BANGUN DATAR =====
        System.out.println("===== SETTER & GETTER BANGUN DATAR =====\n");
        
        System.out.println("--- Mengubah Atribut Lingkaran 2 ---");
        lingkaran2.setWarna("kuning");
        lingkaran2.setBorder("dotted");
        System.out.println("Warna baru: " + lingkaran2.getWarna());
        System.out.println("Border baru: " + lingkaran2.getBorder());
        System.out.println("Jumlah sisi: " + lingkaran2.getJmlSisi());
        System.out.println();
        
        System.out.println("--- Mengubah Atribut Persegi 2 ---");
        persegi2.setWarna("merah");
        persegi2.setBorder("solid");
        System.out.println("Warna baru: " + persegi2.getWarna());
        System.out.println("Border baru: " + persegi2.getBorder());
        System.out.println("Jumlah sisi: " + persegi2.getJmlSisi());
        System.out.println();
        
        // ===== DEMONSTRASI STATIC COUNTER =====
        System.out.println("===== STATIC COUNTER =====\n");
        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterBangunDatar();
        Lingkaran.printCounterBangunDatar();
    }
}
