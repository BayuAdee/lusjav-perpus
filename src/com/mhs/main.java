package com.mhs;

public class main {
    public static void main(String[] args) {
        // membuat object dari kelas Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "123456", "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Ani", "654321", "Sistem Informatika");

        // memanggil method untuk menampikan informasi siswa
        System.out.println("Mahasiswa 1: ");
        mahasiswa1.tampilkanInfo();
        System.out.println("Mahasiswa 2: ");
        mahasiswa2.tampilkanInfo();

    }
}
