package com.Bukuv2;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthIcon;
import javax.swing.plaf.synth.SynthOptionPaneUI;

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
            System.out.println("[+] pilih menu : ");

            int pilihan;
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException e){
                System.out.println("Masukan Angka Yang Valid Untuk Memilih Menu");
                continue;
            }
            switch (pilihan) {
                case 1:
                    System.out.println("Pilih Kategori Buku: 1. Fiksi 2. Non-Fiksi");
                    int kategori = Integer.parseInt(scanner.nextLine());
                    System.out.println("Masukan Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.println("Masukan Pengarang: ");
                    String pengarang = scanner.nextLine();
                    if (kategori == 1) {
                        System.out.println("Masukan Genre Buku: ");
                        String genre = scanner.nextLine();
                        //to this
                    }else if (kategori == 2) {
                        System.out.println("Masukan Bidang Buku");
                        String bidang = scanner.nextLine();
                        System.out.println("Masukan ISBN Buku: ");
                        String isbn = scanner.nextLine();
                    }else{
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 2:
                    System.out.println("Masukan Nama Anggota: ");
                    String nama = scanner.nextLine();
                    System.out.println("Masukan ID Anggota: ");
                    String id = scanner.nextLine();
                    perpustakaan.tambahAnggota(nama, id);
                    break;
                case 3:
                //to this
                    System.out.println("Masukan Buku Yang Akan Dipinjam: ");
                    String judulPinjam = scanner.nextLine();
                    perpustakaan.pinjamBuku(judulPinjam);
                    break;
                case 4:
                //to this
                    System.out.println("Masukan Judul Buku Yang Akan Dikembalikan: ");
                    String judulKembali = scanner.nextLine();
                    perpustakaan.kembalikanBuku(judulKembali);
                    break;
                case 5:
                    //to this
                    perpustakaan.tampilkanDaftarBuku();
                    break;
                case 6:
                    //to this
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