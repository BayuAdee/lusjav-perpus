package com.Bukuv2;

public class Buku {
    private String judul;
    private String pengarang;
    private boolean dipinjam;

    public Buku(String judul, String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
        this.dipinjam = false;
    }
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public boolean isDipinjam(){
        return dipinjam;
    }
    public void setDipinjam(boolean dipinjam){
        this. dipinjam = dipinjam;
    }
    @Override
    public String toString(){
        return "judul '"+judul+"' pengarang '"+pengarang
        +"' Status :"+(dipinjam ? "Dipinjam :" : "tersedia");
    }
}
