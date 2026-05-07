
/*
    Nama File: Anabul.java
    Deskripsi: kelas Anabul
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 30 April 2026
*/

public class Anabul {
    // Atribut
    private String panggilan;


    // Konstruktor
    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    // method 

    // getter
    public String getNama() {
        return panggilan;
    }

    // setter
    public void setNama(String panggilan) {
        this.panggilan = panggilan;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{panggilan='" + panggilan + "'}";
    }
}
