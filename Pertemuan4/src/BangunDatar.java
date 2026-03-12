/*
    Nama File: BangunDatar.java
    Deskripsi: Kelas BangunDatar yang merupakan dasar untuk kelas-kelas turunan bangun datar 
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 12 Maret 2026
*/

// Inheritance (Pewarisan)

class BangunDatar {
    // Atribut
    private int jmlSisi; // sisi pada bangun datar
    private String warna;  // warna pada bangun datar
    private String border;  // border pada bangun datar
    public static int counterBangunDatar = 0; // menghitung jumlah objek bangun datar yang dibuat

    // Konstrutor
    public BangunDatar(){
        this(4, "merah", "hitam");
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++; // Menaikkan counter setiap kali objek BangunDatar dibuat
    }

    // Method

    /** Getter Jumlah Sisi */
    int getJmlSisi(){
        return jmlSisi;
    }

    /** Getter Warna */
    String getWarna(){
        return warna;
    }

    /** Getter Border */
    String getBorder(){
        return border;
    }

    //* Setter Jumlah Sisi */
    void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    /** Setter Warna */
    void setWarna(String warna){  
        this.warna = warna;
    }

    /** Setter Border */
    void setBorder(String border){
        this.border = border;
    }

    // Print Info
    /** Menampilkan info pada bangun datar */
    public void printInfo(){
        System.out.println("Jumlah sisi: "+ jmlSisi) ;
        System.out.println("Warna: " + warna) ;
        System.out.println("Border: " + border) ;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }
}