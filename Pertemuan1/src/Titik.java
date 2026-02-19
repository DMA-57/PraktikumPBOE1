/*
    Nama File: Titik.java
    Deskripsi: Berisi atribut dan method untuk kelas Titik
    Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 19 Februari 2026
*/

public class Titik{
    /*==============ATRIBUT============*/
    double absis; // x
    double ordinat; // y

    /*==============METHOD=============*/
    // konstruktor tanpa parameter
    Titik(){
        this.absis = 0;
        this.ordinat = 0;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }
    // method mengembalikan nilai absis
    public double getAbsis() {
        return this.absis;
    }
    // method mengembalikan nilai ordinat
    public double getOrdinat() {
        return this.ordinat;
    }

    // method mengubah nilai absis
    void setAbsis(double absis) {
        this.absis = absis;
    } 

    // method mengubah nilai ordinat
    void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // method translasi
    void geser(double deltaX, double deltaY) {
        this.absis += deltaX;
        this.ordinat += deltaY;
    }

    // method mencetak titik
    void printTitik() {
        System.out.println("Titik(" + this.absis + ", " + this.ordinat + ")");
    }
} // end of class Titik