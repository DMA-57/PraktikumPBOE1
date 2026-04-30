package PBO08_24060124130055;

/*
    Nama File: OperatorGenerik.java
    Deskripsi: kelas OperatorGenerik
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 30 April 2026
*/

public class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T sementara = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(sementara);
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}
