package PBO08_24060124130055;

/*
    Nama File: Datum.java
    Deskripsi: kelas Datum
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 30 April 2026
*/

public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }

    @Override
    public String toString() {
        return String.valueOf(isi);
    }
}
