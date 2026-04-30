package PBO08_24060124130055;

/*
    Nama File: Data.java
    Deskripsi: kelas Data
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 30 April 2026
*/

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            throw new IndexOutOfBoundsException("Posisi harus antara 1 dan 100");
        }
        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T isi) {
        if (posisi < 1 || posisi > 100) {
            throw new IndexOutOfBoundsException("Posisi harus antara 1 dan 100");
        }
        ruang[posisi - 1] = isi;
        if (posisi > banyak) {
            banyak = posisi;
        }
    }

    public int getSize() {
        return banyak;
    }
}
