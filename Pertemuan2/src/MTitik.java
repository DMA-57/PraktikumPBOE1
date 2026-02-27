public class MTitik {
    /*
    Nama File: MTitik.java
    Deskripsi: Main / Driver untuk kelas Titik
    Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 27 Februari 2026
*/
    public static void main(String[] args) {
        // Membuat objek titik1 dengan konstruktor default
        Titik titik1 = new Titik();
        titik1.setAbsis(1);
        titik1.setOrdinat(2);

        // Membuat objek titik2 dengan konstruktor berparameter
        Titik titik2 = new Titik(3, 4);

        // Cetak nilai absis dan ordinat masing-masing objek
        System.out.println("titik1.absis = " + titik1.getAbsis());
        System.out.println("titik1.ordinat = " + titik1.getOrdinat());
        titik2.printTitik();

        // Menggeser titik1 dan cetak hasilnya
        titik1.geser(5, 6);
        System.out.println("Setelah digeser:");
        titik1.printTitik();

        // Kuadran dan jarak ke pusat
        System.out.println("Kuadran titik1: " + titik1.getKuadran());
        System.out.println("Jarak titik1 ke pusat: " + titik1.getJarakPusat());

        // Jarak antara dua titik
        double jarak = titik1.getJarak(titik2);
        System.out.println("Jarak antara titik1 dan titik2: " + jarak);

        // Refleksi
        titik1.refleksiX();
        System.out.println("Titik1 setelah refleksi X:");
        titik1.printTitik();

        titik2.refleksiY();
        System.out.println("Titik2 setelah refleksi Y:");
        titik2.printTitik();

        // Mendapatkan titik hasil refleksi tanpa mengubah objek asli
        Titik refleksi1 = titik1.getRefleksiY();
        System.out.println("Refleksi Y dari titik1 (baru):");
        refleksi1.printTitik();

        Titik refleksi2 = titik2.getRefleksiX();
        System.out.println("Refleksi X dari titik2 (baru):");
        refleksi2.printTitik();

        // Untuk memastikan counter berfungsi
        System.err.println("Jumlah objek Titik yang telah dibuat: " + Titik.getCounterTitik());
        // System.err.println("(panggilan melalui instance) jumlah objek Titik: " + titik2.getCounterTitik());
    }
}

