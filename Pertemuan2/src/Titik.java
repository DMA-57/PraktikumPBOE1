/*
    Nama File: Titik.java
    Deskripsi: Berisi atribut dan method untuk kelas Titik
    Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 27 Februari 2026
*/

public class Titik {
    //===================Atribut==========================
    private  double absis;
    private double ordinat;
    private static int counterTitik = 0;

    //===================METHOD==========================
    
    // Konstruktor
    Titik(){
        this(0,0);
        counterTitik++;
    }

    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;

    }

    // Method
    // method / mutator untuk absis
    void setAbsis(double absis){
        this.absis = absis;
    }

    // method / mutator untuk ordinat
    void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    // method / selektor untuk absis
    double getAbsis(){
        return this.absis;
    }

    // method / selektor untuk ordinat
    double getOrdinat(){
        return this.ordinat;
    }

    /** method untuk menggeser titik */
    void geser(double x, double y){
        this.absis += x;
        this.ordinat += y;
    }

    /** method untuk menentukan kuadran titik */
    int getKuadran(){
        if(this.absis > 0 && this.ordinat > 0){
            return 1;
        } else if(this.absis < 0 && this.ordinat > 0){
            return 2;
        } else if(this.absis < 0 && this.ordinat < 0){
            return 3;
        } else if(this.absis > 0 && this.ordinat < 0){
            return 4;
        } else {
            return 0; // Titik berada di sumbu atau di titik asal
        }
    }

    /** method untuk mendapatkan jarak terhadap titik pusat */
    double getJarakPusat(){
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
    }

    /** method untuk menghitung jarak dengan sebuah titik T */
    double getJarak(Titik T){
        double dx = this.absis - T.getAbsis();
        double dy = this.ordinat - T.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    /** method untuk refleksi titik dengan sumbu X */
    void refleksiX(){
        this.ordinat = -this.ordinat;
    }

    /** method untuk refleksi titik dengan sumbu Y */
    void refleksiY(){
        this.absis = -this.absis;
    }

    /** method untuk mengembalikan titik hasil refleksi titik ini dengan sumbu X */
    Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    /** method untuk mengembalikan titik hasil refleksi titik ini dengan sumbu Y */
    Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }

    /** method untuk mencetak titik*/
    void printTitik(){
        System.out.println("Titik(" + this.absis + ", " + this.ordinat + ")");
    }

    /** static method untuk mendapatkan jumlah objek Titik yang telah dibuat */
    static int getCounterTitik(){
        return counterTitik;
    }


}//end class titik