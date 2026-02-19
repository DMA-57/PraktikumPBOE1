/*
    Nama File: MTitik.java
    Deskripsi: Driver atau file main untuk kelas Titik
    Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 19 Februari 2026
*/


public class MTitik {
    public static void main(String[] args) {
        // membuat objek titik1 dengan konstruktor tanpa parameter
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik(); // output: Titik(3.0, 4.0)
        T1.geser(3, 4);
        T1.printTitik(); // output: Titik(6.0, 8.0)

        // membuat objek titik2 dengan konstruktor dengan parameter
        Titik T2 = new Titik(5, 6);
        T2.printTitik(); // output: Titik(5.0, 6
    }
}