package latihanTutorial;

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

    // konstruktor
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    // method 
    private String getBunyi(){
        return bunyi;
    }

    private  void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    private boolean isMenusuk(){
        return menusuk;
    }

    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
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
