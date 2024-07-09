package com.Bukuv2;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Anggota> daftarAnggota;

    public Perpustakaan(){
        this.daftarBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
    }

    //method for class buku
    public void tambahBuku(int kategori, String judul, String pengarang, String tambahan1, String tambahan2){
        if(kategori ==1){
            tambahBukuFiksi(judul, pengarang, tambahan1);
        }else if(kategori ==2){
            tambahBukuNonFiksi(judul, pengarang, tambahan1, tambahan2);
        }else{
            System.out.println("Kategori tidak valid.");
        }
    }
    private void tambahBukuFiksi(String judul, String pengarang, String genre){
        BukuFiksi bukufiksi = new BukuFiksi(judul, pengarang, genre);
        daftarBuku.add(bukufiksi);
        System.out.println("Buku Fiksi Berhasi ditambahkan.");
    }
    private void tambahBukuNonFiksi(String judul, String pengarang, String bidang, String ISBN){
        BukuNonFiksi bukunonfiksi = new BukuNonFiksi(bidang, ISBN, judul, pengarang);
        daftarBuku.add(bukunonfiksi);
        System.out.println("Buku Non-fiksi berhasil ditambahkan");
    }
    public void tampilkanDaftarBuku(){
        if(daftarBuku.isEmpty()){
            System.out.println("Tidak ada buku dalam daftar");
        }else{
            for (Buku buku : daftarBuku){
                System.out.println(buku);
            }
        }
    }
    public void pinjamBuku(String judul){
        for(Buku buku : daftarBuku){
            if (buku.getJudul().equalsIgnoreCase(judul) && !buku.isDipinjam()) {
                buku.setDipinjam(true);
                System.out.println("Buku \""+judul+"\"behasil dipinjam.");
                return;
            }
        }
        System.out.println("Buku \""+judul+"\"tidak tersedia atau "+" sudah dipinjam");
    }
    public void kembalikanBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul) && buku.isDipinjam()) {
                buku.setDipinjam(false);
                System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Buku \"" + judul + "\" tidak ditemukan atau belum dipinjam.");
    }   
    public void tambahAnggota(String nama, String id){
        Anggota anggota = new Anggota(nama, id);
        daftarAnggota.add(anggota);
        System.out.println("Anggota berhasil ditambahkan");
    }
    public void tampilkandaftarAnggota(){
        if(daftarAnggota.isEmpty()){
            System.out.println("Tidak ada anggota dalam daftar");
        }else{
            for(Anggota anggota : daftarAnggota){
                System.out.println(anggota);
            }
        }
    }
}
