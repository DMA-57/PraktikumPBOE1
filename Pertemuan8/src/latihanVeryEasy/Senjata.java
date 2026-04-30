package latihanVeryEasy;

/*
    Nama File: Senjata.java
    Deskripsi: kelas Senjata 
    Nama Pembuat: 24060124130055 - Daffa Maulana Alfianto
    Tanggal: 30 April 2026
*/

public class Senjata {
    // atribut
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    // konstruktor
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }

    // method 
    public String getBunyi(){
        return bunyi;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public int getPeluru(){
        return peluru;
    }

    public void setPeluru(int peluru){
        if (peluru < 0) {
            this.peluru = 0;
        } else {
            this.peluru = peluru;
        }
    }

    public boolean isMenusuk(){
        return menusuk;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void menembak(){
        if (peluru > 0){
            System.out.println(getBunyi());
            peluru--;
        } else {
            System.out.println("Tidak bisa menembak, peluru habis!");
        }
    }

    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++){
            System.out.println(getBunyi() + " ");
        }
        System.out.println("");
    }

    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang, senjata sekarang bisa menusuk!");
    }

    public String menusuk(){
        if (isMenusuk()){
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet!";
        }
    } 
}
