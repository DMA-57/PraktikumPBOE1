package PBO08_24060124130055;

/*
    Nama File: TestPBO08.java
    Deskripsi: kelas TestPBO08
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 30 April 2026
*/

public class TestPBO08 {
    public static void main(String[] args) {
        Anggora anggora = new Anggora("Boba", 4.8);
        KembangTelon kembangTelon = new KembangTelon("Mimi", 3.6);

        System.out.println("=== Keluarga Anabul ===");
        System.out.println(anggora);
        System.out.println(kembangTelon);

        Datum<Kucing> dataKucing1 = new Datum<>(anggora);
        Datum<Kucing> dataKucing2 = new Datum<>(kembangTelon);

        System.out.println("\nSebelum tukar:");
        System.out.println("dataKucing1 = " + dataKucing1.getIsi());
        System.out.println("dataKucing2 = " + dataKucing2.getIsi());

        OperatorGenerik.Tukar(dataKucing1, dataKucing2);

        System.out.println("\nSetelah tukar:");
        System.out.println("dataKucing1 = " + dataKucing1.getIsi());
        System.out.println("dataKucing2 = " + dataKucing2.getIsi());

        double totalBobot = OperatorGenerik.Bobot2(dataKucing1.getIsi(), dataKucing2.getIsi());
        System.out.println("\nTotal bobot kedua kucing = " + totalBobot + " kg");

        System.out.println("\n=== Aplikasi Data Generik ===");
        Data<String> dataString = new Data<>();
        dataString.setIsi(1, "Satu");
        dataString.setIsi(2, "Dua");

        System.out.println("Isi posisi 1: " + dataString.getIsi(1));
        System.out.println("Isi posisi 2: " + dataString.getIsi(2));
        System.out.println("Banyak elemen efektif: " + dataString.getSize());
    }
}
