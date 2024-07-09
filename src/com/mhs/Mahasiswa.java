package com.mhs;

import java.lang.module.ModuleDescriptor.Builder;

public class Mahasiswa {
    // atribut
    private String nama;
    private String nim;
    private String jurusan;

    // construct
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Jurusan : " + nama);
    }
}