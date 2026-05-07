/*
    Nama File: MTeman.java
    Deskripsi: class main Teman untuk menguji kelas Teman
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 07 Mei 2026
*/

public class MTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();

        System.out.println("=== Aplikasi Teman ===");
        teman.addNama("Budi");
        teman.addNama("Siti");
        teman.addNama("Rina");
        teman.addNama("Budi");

        teman.showTeman();
        System.out.println("Jumlah teman: " + teman.getNbelm());
        System.out.println("Nama indeks 1: " + teman.getNama(1));
        System.out.println("Apakah 'Siti' ada? " + teman.isMember("Siti"));
        System.out.println("Jumlah nama 'Budi': " + teman.countNama("Budi"));

        System.out.println("\n-- Ganti nama 'Siti' menjadi 'Sinta' --");
        teman.gantiNama("Siti", "Sinta");
        teman.showTeman();

        System.out.println("\n-- Ubah nama indeks 0 menjadi 'Andi' --");
        teman.setNama(0, "Andi");
        teman.showTeman();

        System.out.println("\n-- Hapus nama 'Budi' --");
        teman.delNama("Budi");
        teman.showTeman();
        System.out.println("Jumlah teman sekarang: " + teman.getNbelm());
    }
}

