package com.Bukuv2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Daftar Buku");
            System.out.println("6. Tampilkan Daftar Anggota");
            System.out.println("7. Keluar");
            System.out.print("[+] Pilih menu: ");

            int pilihan;
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Masukan Angka Yang Valid Untuk Memilih Menu");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.println("Pilih Kategori Buku: 1. Fiksi 2. Non-Fiksi");
                    int kategori;
                    try {
                        kategori = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Masukan Angka Yang Valid Untuk Memilih Kategori");
                        continue;
                    }
                    System.out.print("Masukan Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukan Pengarang: ");
                    String pengarang = scanner.nextLine();
                    if (kategori == 1) {
                        System.out.print("Masukan Genre Buku: ");
                        String genre = scanner.nextLine();
                        perpustakaan.tambahBuku(kategori, judul, pengarang, genre, null);
                    } else if (kategori == 2) {
                        System.out.print("Masukan Bidang Buku: ");
                        String bidang = scanner.nextLine();
                        System.out.print("Masukan ISBN Buku: ");
                        String isbn = scanner.nextLine();
                        perpustakaan.tambahBuku(kategori, judul, pengarang, bidang, isbn);
                    } else {
                        System.out.println("Kategori tidak valid.");
                    }
                    break;
                case 2:
                    System.out.print("Masukan Nama Anggota: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukan ID Anggota: ");
                    String id = scanner.nextLine();
                    perpustakaan.tambahAnggota(nama, id);
                    break;
                case 3:
                    System.out.print("Masukan Judul Buku Yang Akan Dipinjam: ");
                    String judulPinjam = scanner.nextLine();
                    perpustakaan.pinjamBuku(judulPinjam);
                    break;
                case 4:
                    System.out.print("Masukan Judul Buku Yang Akan Dikembalikan: ");
                    String judulKembali = scanner.nextLine();
                    perpustakaan.kembalikanBuku(judulKembali);
                    break;
                case 5:
                    perpustakaan.tampilkanDaftarBuku();
                    break;
                case 6:
                    perpustakaan.tampilkandaftarAnggota();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Keluar Dari Program.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");
                    break;
            }
        }
        scanner.close();
    }
}
