package PBO08_24060124130055;

/*
    Nama File: Kucing.java
    Deskripsi: kelas Kucing
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 30 April 2026
*/

public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{nama='" + getNama() + "', bobot=" + bobot + "}";
    }
}
