package com.Bukuv2;

public class Anggota {
    private String nama;
    private String id;

    public Anggota(String nama, String id){
        this.nama = nama;
        this.id = id;
    }
    public String getNama(){
        return nama;
    }
    public String getId(){
        return id;
    }
    @Override
    public String toString(){
        return "Nama "+nama+", ID"+id;
    }
}
/**
 * InnerAnggota
 */
class BukuFiksi extends Buku{
    private String genre;
    
    public BukuFiksi(String judul, String pengarang, String genre){
        super(judul, pengarang);
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    @Override
    public String toString(){
        return "Buku Fiksi - "+super.toString()+", Genre: "+genre;
    }
}
class BukuNonFiksi extends Buku{
    private String bidang;
    private String ISBN;

    public BukuNonFiksi(String bidang, String ISBN, String judul, String pengarang){
        super(judul, pengarang);
        this.bidang = bidang;
        this.ISBN = ISBN;
    }
    public String getBidang(){
        return bidang;
    }
    public String getISBN(){
        return ISBN;
    }
    @Override
    public String toString(){
        return "Buku Non-Fiksi - "+super.toString()+", Bidang "+ bidang;
    }
}
