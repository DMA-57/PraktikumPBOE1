/*
    Nama File: Garis.java
    Deskripsi: Berisi atribut dan method untuk kelas Garis
    Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 3 Maret 2026
*/


public class Garis {
    //===================Atribut==========================
    private Titik titikAwal;
    private Titik titikAkhir;
    static int counterGaris = 0;

    //===================METHOD==========================

    // Konstruktor
    // Konstruktor default
    Garis(){
        this(new Titik(0, 0), new Titik(1,1));
    }

    // Konstruktor dengan parameter <-- menggunakan overloading
    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor 
    Titik getTitik1(){
        return this.titikAwal;
    }

    Titik getTitik2(){
        return this.titikAkhir;
    }

    // Mutator 
    void setTitik1(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    void setTitik2(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    // Operator lainnya
    /** Method untuk menghitung panjang garis */
    double panjangGaris(){
        return Math.sqrt(Math.pow(this.titikAkhir.getAbsis() - this.titikAwal.getAbsis(), 2) + 
                Math.pow(this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat(), 2));
    }

    /** Method untuk mendapatkan gradien garis */
    double gradienGaris(){
        return (this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat()) / 
                (this.titikAkhir.getAbsis() - this.titikAwal.getAbsis());
    }

    /** Method untuk mendapatkan titik tengah garis */
    Titik titikTengah(){
        double xTengah = (this.titikAwal.getAbsis() + this.titikAkhir.getAbsis()) / 2;
        double yTengah = (this.titikAwal.getOrdinat() + this.titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    /** Method untuk mengetahui apakah dua garis sejajar */
    boolean isSejajar(Garis G2){
        // Garis sejajar jika M G1 = M G2 
        return this.gradienGaris() == G2.gradienGaris();
    }

    /** Method untuk mengetahui apakah dua garis tegak lurus */
    boolean isTegakLurus(Garis G2){
        // Garis tegak lurus jika M G1 * M G2 = -1
        return this.gradienGaris() * G2.gradienGaris() == -1;
    }

    /** Method untuk menampilkan ke layar titik awal dan titik akhir garis. */
    void printGaris(){
        System.out.println("Garis dengan titik awal (" + this.titikAwal.getAbsis() + ", " + this.titikAwal.getOrdinat() + 
                ") dan titik akhir (" + this.titikAkhir.getAbsis() + ", " + this.titikAkhir.getOrdinat() + ")");
    }

    /** Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c.  */
    void printPersamaan(){
        double m = this.gradienGaris(); // gradien
        double c = this.titikAwal.getOrdinat() - m * this.titikAwal.getAbsis(); // intercept
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }

    // Method tambahan 

    /** Method untuk mengetahui garis tidak berpotongan*/
    boolean isTidakBerpotongan(Garis G2){
        // Garis tidak berpotongan jika M G1 = M G2 dan C G1 != C G2
        double m1 = this.gradienGaris(); // gradien garis satu
        double c1 = this.titikAwal.getOrdinat() - m1 * this.titikAwal.getAbsis(); // intercept garis satu
        double m2 = G2.gradienGaris(); // gradien garis dua
        double c2 = G2.titikAwal.getOrdinat() - m2 * G2.titikAwal.getAbsis(); // intercept garis dua
        return m1 == m2 && c1 != c2; // samakan gradien tetapi intercept berbeda berarti garis tidak berpotongan
    }

    /** Method untuk mengetahui jumlah baris yang di inisialisasi */
    static int getCounterGaris(){
        return counterGaris;
    }

    
}
